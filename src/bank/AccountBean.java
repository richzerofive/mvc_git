/**
 * 
 */
package bank;

import java.io.Serializable;
import java.util.Random;

import javax.swing.JOptionPane;

import global.Constants;

/**
 * @date : 2016. 6. 16.
 * @author : 박승주
 * @file : Account.java
 * @story :
 */
public class AccountBean implements Serializable{
		
	private static final long serialVersionUID = 1L; // java bean 을 jsp 파일에서 쓸수 있도록 하자
	private int accountNo,money; // 인스턴스 변수는 초기화를 하지 않는다
	private String name,pw,id;
	
	public void setAccountNo() {
		this.accountNo = (int) (Math.random() * 999999) + 100000;
	}
	public void setAccountNo(int accountNo){
		this.accountNo = accountNo;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setId(String id){
		this.id = id;
	}
	public int getAccountNo() {
		return this.accountNo;
	}
	public String getName() {
		return this.name;
	}
	public int getMoney() {
		return this.money;
	}
	public String getPw() {
		return this.pw;
	}
	public String getId() {
		return this.id;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {	//메소드 오버라이딩
		return Constants.BANK_NAME+"계좌정보 [계좌번호=" + accountNo + ", 이름=" + name + ", 잔액=" + money + ", 비번=" + pw + ", 아이디=" + id
				+ "]";
	}
}
