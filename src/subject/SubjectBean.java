package subject;

import java.io.Serializable;

public class SubjectBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id,major,subjects;
	private int subjSeq;

	public final int getSubjSeq() {
		return subjSeq;
	}

	public final void setSubjSeq(int subjSeq) {
		this.subjSeq = subjSeq;
	}

	public final String getId() {
		return id;
	}

	public final void setId(String id) {
		this.id = id;
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
