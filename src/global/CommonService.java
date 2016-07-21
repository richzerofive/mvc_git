package global;

import java.util.List;
import java.util.Map;

import member.MemberBean;

public interface CommonService {
	public List<?> list();
	public List<?> findBy(String keyword);
	public int count();
	public Map<?,?> map();
}
