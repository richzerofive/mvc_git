package member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import bank.AccountService;
import bank.AccountServiceImpl;
import subject.SubjectBean;
import subject.SubjectDAO;
import subject.SubjectMember;

/**
 *@date   : 2016. 6. 20.
 *@author : 박승주
 *@file   : StudentServiceImpl.java
 *@story  : 
*/
public class MemberServiceImpl implements MemberService{
	private Map<String,MemberBean> map;
	private MemberDAO dao;
	private SubjectDAO subjDao =SubjectDAO.getInstance();
	private MemberBean session;
	
	AccountService accService = AccountServiceImpl.getInstance();
	
	private static MemberServiceImpl instance = new MemberServiceImpl();
	
	private MemberServiceImpl() {
		dao =  MemberDAO.getInstance();
	}
	public static MemberServiceImpl getInstance() {
		return instance;
	}
	@Override
	public SubjectMember login(MemberBean mBean) {
		String result = null;
		SubjectMember sm = new SubjectMember();
		SubjectBean sb = new SubjectBean();
		if(mBean.getId()==null || mBean.getPw()==null){
			return null;
		}
		if(this.checkLogin(mBean)){	
			this.map();
			session = (MemberBean) map.get(mBean.getId());
			result = session.getName();
			accService.map();
			sb= subjDao.findById(mBean.getId());
			sm.setEmail(session.getEmail());
			sm.setId(session.getId());
			sm.setImg(session.getProfileImg());
			sm.setMajor(sb.getMajor());
			sm.setName(session.getName());
			sm.setPhone(session.getPhone());
			sm.setPhone(session.getPw());
			sm.setReg(session.getRegDate());
			sm.setSsn(session.getSsn());
			sm.setSubjects(sb.getSubjects());
		}else{
			sm.setId("fail");
		}
		System.out.println("서비스로그인결과?"+session.getId());
		return sm;
	}
	@Override
	public Map<?, ?> map() {
		this.map = new HashMap<String,MemberBean>(); 
		map = dao.selectMap();
		return map;
	}
	@Override
	public String regist(MemberBean mem) {
		String msg = "";
		MemberBean temp = this.findById(mem.getId());
		if (temp == null) {
			System.out.println(mem.getId()+"가 존재하지 않음,가입 가능한 ID");
			int result = dao.insert(mem);
			if (result==1) {
				msg = "success";
			} else {
				msg = "fail";
			}
		} else {
			System.out.println(mem.getId()+"가 존재함,가입 불가능한 ID");
			msg = "fail";
		}
		
		return msg;
	}

	@Override
	public int update(MemberBean mBean) {
		int result= dao.updatePw(mBean);
		if(result==1){
			this.session = dao.findByPK(mBean.getId());
			this.map.replace(session.getId(), session);
		}else{
			System.out.println("수정실패");
		}
		return result;
	}
	@Override
	public int delete(MemberBean mBean) {
		
		return dao.deleteMember(mBean);
	}
	@Override
	public int count() {
		return map.values().size();
	}
	@Override
	public MemberBean findById(String id) {
		return dao.findByPK(id);
	}
	@Override
	public List<MemberBean> findBy(String word) {
		List<MemberBean> findList = new ArrayList<MemberBean>();
		Set<?> keys = map.keySet();
		Iterator<?> it = keys.iterator();
		while(it.hasNext()){
			MemberBean tempBean = (MemberBean) map.get(it.next());
			if(tempBean.getName().equals(word)){
				findList.add(tempBean);
			}
		}
		return findList;
	}
	@Override
	public ArrayList<MemberBean> list() {
		ArrayList<MemberBean> allList = new ArrayList<MemberBean>();
		Set<?> keys = map.keySet();
		Iterator<?> it = keys.iterator();
		while(it.hasNext()){
			allList.add((MemberBean) this.map.get(it.next()));
		}
		
		return allList;
	}
	public MemberBean getSession() {
		return session;
	}
	public boolean checkLogin(MemberBean mBean) {
		boolean loginOk = false;
		MemberBean m = dao.findByPK(mBean.getId());
		if(m!=null && m.getPw().equals(mBean.getPw())){
			loginOk = true;
		}
		return loginOk;
	}
	@Override
	public void logOut(MemberBean mBean) {
		if(mBean.getId().equals(session.getId()) && mBean.getPw().equals(session.getPw())){
			this.session = null;
		}  
	}
	
}

