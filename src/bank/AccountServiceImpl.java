/**
 * 
 */
package bank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @date : 2016. 6. 20.
 * @author : 박승주
 * @file : AccountServiceImpl.java
 * @story :계좌 인터페이스
 */
public class AccountServiceImpl implements AccountService {
	AccountDAO dao = AccountDAO.getInstance();
	private Map<?,?> map ;
	private static AccountServiceImpl instance = new AccountServiceImpl();
	
	public static AccountServiceImpl getInstance() {
		return instance;
	}
	private AccountServiceImpl() {
		map = new HashMap<String,AccountMemberBean>();
	}
	@Override
	public String openAccount(String id) {
		AccountBean acc = new AccountBean();
		acc.setAccountNo();
		acc.setId(id);
		acc.setMoney(0);
		String msg = "";
		if (dao.insertAccount(acc)==1) {
			msg = "계좌생성 완료";
		} else {
			msg = "계좌생성 실패";
		}
		
		return msg;
	}

	@Override
	public void deposit(String depositInfo) {
		String[] arr = depositInfo.split(",");
		AccountBean acc = new AccountBean();
		acc.setAccountNo(Integer.parseInt(arr[0]));
		int money = this.restMoney(Integer.parseInt(arr[0])) 
				+ Integer.parseInt(arr[1]);
		acc.setMoney(money);
		dao.deposit(acc);
	}

	@Override
	public String withdraw(String withdrawInfo) {
		String result = "";
		String[] arr = withdrawInfo.split(",");
		AccountBean acc = new AccountBean();
		acc.setAccountNo(Integer.parseInt(arr[0]));
		int restMoney = this.restMoney(Integer.parseInt(arr[0]));
		int withdrawMoney = Integer.parseInt(arr[1]);
		if (restMoney < withdrawMoney) {
			result = "잔액이 부족합니다";
		} else {
			acc.setMoney(restMoney-withdrawMoney);
			dao.withdraw(acc);
			result = "잔액 : "+String.valueOf(this.restMoney(Integer.parseInt(arr[0])));
		}
		
		return result;
	}

	@Override
	public String updateAccount(AccountBean acc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<?> list() {
		List<AccountMemberBean> list = dao.selectAll();
		
		return list;
	}

	@Override
	public AccountBean findByAccountNo(String accNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> findBy(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int restMoney(int accNo) {
		
		return dao.selectMoney(accNo);
	}
	@Override
	public Map<?,?> map() {
		map = new HashMap<String,AccountMemberBean>();
		map = dao.selectMap();
		return map;
	}
	@Override
	public String deleteAccount(String findAcc) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public AccountBean findByAccountNo(AccountBean bean) {
		// TODO Auto-generated method stub
		return null;
	}
}

