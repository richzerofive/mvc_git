/**
 * 
 */
package bank;

import java.util.List;
import java.util.Map;

import global.CommonService;

/**
 *@date   : 2016. 6. 20.
 *@author : 박승주
 *@file   : AccountService.java
 *@story  : 
*/
public interface AccountService extends CommonService{
	
	// 1.개설 2.입금 3.출금4.수정5.해지6.조회(전체)7.조회(계좌번호)8.조회(이름)9.조회(전체통장수)
	//accountBean <-> view
	// 1.개설
	public String openAccount(String id);
	// 2입금
	public void deposit(String depositInfo);
	// 3출금
	public String withdraw(String withdrawInfo);
	// 4.수정 .. 사용자의 요청에 의해 비번만 전환가능
	public String updateAccount(AccountBean acc);
	// 5해지
	public String deleteAccount(String findAcc);
	// 7조회(계좌번호)
	public AccountBean findByAccountNo(AccountBean bean);
	// 원래 요구사항에는 없었지만.. 필요에 따라 생성하는 메소드
	public int restMoney(int accNo);
	void deleteAccount();
	AccountBean findByAccountNo(String accNo);
	
}

