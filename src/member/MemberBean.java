/**
 * 
 */
package member;

import java.io.Serializable;
/**1986
 *@date   : 2016. 6. 16.
 *@author : 박승주
 *@file   : student.java
 *@story  : *@story  : 스테틱 변수 : 한빛 학원 인스턴스 Id , pw , name , regDate , gender ,800101-1(ssn)int age
 *1. 등록 :ssn,아이디,비번,이름 2. 조회 (결과값 : 홍길동,h,남)
*/
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

/**
 * @date   :2016. 6. 16. 
 * @author :pakjkwan@gmail.com
 * @file   :Student.java
 * @story  :
*/
public class MemberBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id,pw,name,regDate,gender,ssn,
		profileImg,email,phone; 
	private int birth;
	
	public MemberBean() {}
	
	public MemberBean(String id,String pw,String name,String ssn) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.ssn = ssn;
		String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()));
		this.regDate = now;
		}
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfileImg() {
		return profileImg;
	}

	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate() {
		String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()));
		this.regDate = now;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGenderAndBirth(String ssn) {
		String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()));
		String[] ssnArr = ssn.split("-");
		String[] nowArr = now.split("-");
		int ssnBirth = (Integer.parseInt(ssnArr[0]));
		int ssnGender = (Integer.parseInt(ssnArr[1]));
		int thisYear = (Integer.parseInt(nowArr[0]));
		this.ssn = ssn;
		switch (ssnGender) {
		case 1: case 5: 
			this.gender="남"; 
			System.out.println("올해:"+thisYear);
			System.out.println("생년월일:"+ssnBirth);
		//	age = ageResult2 - (1900-(this/10000));
		//  나이를 구하려고 했으나 일단 보류
			this.birth = ssnBirth;
			break;
		case 3: case 7:
			this.gender="남"; 
			this.birth = ssnBirth;
			break;
		case 2: case 6:
			this.gender="여";
			this.birth = ssnBirth;
			break;
		case 4: case 8:
			this.gender="여";
			this.birth = ssnBirth;
			break;
		default:
			System.out.println("잘못된값이 입력됨");
		}
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public int getBirth() {
		return birth;
	}
	

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "학생 [아이디=" + id + ", 비번=****"+ ", 이메일=" + email  + ", 이름=" + name + ", 등록일=" + regDate + ", 성별=" + gender
				+ ", 주민번호=" + ssn + ", 나이=" + birth + "]";
	}

}
