package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import global.Constants;
import global.DatabaseFactory;
import global.Vendor;

/*
private String id,pw,name,regDate,gender,ssn; 
private int age;*/
public class MemberDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private static MemberDAO instance = new MemberDAO();
	
	private MemberDAO() {
		conn = DatabaseFactory.createDatabase(Vendor.ORACLE, Constants.USER_ID, Constants.USER_PW).getConnection();
	}
	public static MemberDAO getInstance() {
		return instance;
	}
	public int insert(MemberBean mBean){
		int result = 0;
		String sql = "INSERT INTO MEMBER(ID,PW,NAME,REGDATE,SSN,EMAIL,PROFILE_IMG) VALUES(?,?,?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mBean.getId());
			pstmt.setString(2, mBean.getPw());
			pstmt.setString(3, mBean.getName());
			pstmt.setString(4, mBean.getRegDate());
			pstmt.setString(5, mBean.getSsn());
			pstmt.setString(6, mBean.getEmail());
			pstmt.setString(7, mBean.getProfileImg());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	public int updatePw(MemberBean mBean){
		int result = 0;
		String sql = "UPDATE MEMBER SET PW=?,EMAIL=? WHERE ID=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mBean.getPw());
			pstmt.setString(2, mBean.getEmail());
			pstmt.setString(3, mBean.getId());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	public int deleteMember(String id){
		int result = 0;
		String sql = "DELETE FROM MEMBER WHERE ID=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	public MemberBean findByPK(String pk){
		MemberBean findBean = null;
		String sql = "SELECT * FROM MEMBER WHERE ID=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pk);
			rs = pstmt.executeQuery();
			if(rs.next()){
				findBean = new MemberBean();
				findBean.setId(rs.getString("ID"));
				findBean.setPw(rs.getString("PW"));
				findBean.setName(rs.getString("NAME"));
				findBean.setRegDate(rs.getString("REG_DATE"));
				findBean.setSsn(rs.getString("SSN"));
				findBean.setEmail(rs.getString("EMAIL"));
				findBean.setProfileImg(rs.getString("PROFILE_IMG"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return findBean;
	} // id
	public Map<String, MemberBean> selectMap() {
		Map<String, MemberBean> memberMap = new HashMap<String,MemberBean>();
		String sql = "SELECT * FROM MEMBER";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				MemberBean tempBean = new MemberBean();
				tempBean.setId(rs.getString("ID"));
				tempBean.setPw(rs.getString("PW"));
				tempBean.setName(rs.getString("NAME"));
				tempBean.setRegDate(rs.getString("REG_DATE"));
				tempBean.setSsn(rs.getString("SSN"));
				tempBean.setEmail(rs.getString("EMAIL"));
				tempBean.setProfileImg(rs.getString("PROFILE_IMG"));
				memberMap.put(tempBean.getId(), tempBean);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return memberMap;
	}
		
		}
