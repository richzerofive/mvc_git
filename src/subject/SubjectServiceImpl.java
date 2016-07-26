package subject;

public class SubjectServiceImpl implements SubjectService{
	SubjectDAO dao = SubjectDAO.getInstance();
	private static SubjectService instance = new SubjectServiceImpl();
public static final SubjectService getInstance() {
		return instance;
	}
	public static final void setInstance(SubjectService instance) {
		SubjectServiceImpl.instance = instance;
	}
private SubjectServiceImpl() {
}
	@Override
	public void insert(SubjectBean s) {
		dao.insert(s);
	}
}
