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
	private String id,pw,name,regDate,gender,ssn,profileImg,email;
	private int age,birth;
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
	public int getBirth() {
		return birth;
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
	public void setRegDate(String regDate){
		this.regDate = regDate;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		int sCode = Integer.parseInt(ssn.split("-")[1]);
		this.gender = (sCode + 10) % 2 == 0 ? "여" : "남";
		int nowYear = Integer.parseInt(regDate.substring(0, 4));
		int ageYear = Integer.parseInt(ssn.substring(0, 2));
		switch (sCode) {
		case 1:	case 2:	case 5:	case 6:
			this.age = nowYear - (1900 + ageYear) + 1;
			break;
		case 9:	case 0:
			this.age = nowYear - (1800 + ageYear) + 1;
			break;
		default:
			this.age = nowYear - (2000 + ageYear) + 1;
			break;
		}
		this.birth = Integer.parseInt(ssn.split("-")[0]);
		this.ssn = ssn;
	}
	public int getAge() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}

	public void setAge(int age) {
		this.birth = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "학생 [아이디=" + id + ", 비번="+ pw + ", 이메일=" + email + ", , 프로필=" + profileImg + "이름=" + name + ", 등록일=" + regDate + ", 성별=" + gender
				+ ", 주민번호=" + ssn + ", 나이=" + birth + "]";
	}
	

}
