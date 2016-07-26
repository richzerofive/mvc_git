package subject;

import java.io.Serializable;

public class SubjectMember implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id,pw,name,reg,ssn,email,img,phone,major,subjects;

	public final String getId() {
		return id;
	}

	public final void setId(String id) {
		this.id = id;
	}

	public final String getPw() {
		return pw;
	}

	public final void setPw(String pw) {
		this.pw = pw;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final String getReg() {
		return reg;
	}

	public final void setReg(String reg) {
		this.reg = reg;
	}

	public final String getSsn() {
		return ssn;
	}

	public final void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public final String getEmail() {
		return email;
	}

	public final void setEmail(String email) {
		this.email = email;
	}

	public final String getImg() {
		return img;
	}

	public final void setImg(String img) {
		this.img = img;
	}

	public final String getPhone() {
		return phone;
	}

	public final void setPhone(String phone) {
		this.phone = phone;
	}

	public final String getMajor() {
		return major;
	}

	public final void setMajor(String major) {
		this.major = major;
	}

	public final String getSubjects() {
		return subjects;
	}

	public final void setSubjects(String subjects) {
		this.subjects = subjects;
	}
}
