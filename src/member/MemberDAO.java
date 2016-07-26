package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import global.Constants;
import global.DatabaseFactory;
import global.Vendor;

/*
private String id,pw,name,regDate,gender,ssn; 
private int age;*/
public class MemberDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private static MemberDAO instance = new MemberDAO();
	
	private MemberDAO() {
		con = DatabaseFactory.createDatabase(Vendor.ORACLE, Constants.USER_ID, Constants.USER_PW).getConnection();
	}
	public static MemberDAO getInstance() {
		return instance;
	}
	public int insert(MemberBean bean){
		int result = 0;
		String sql = "insert into member(id,pw,name,reg_date,ssn,email,profile_img,phone)"
				+ "values(?,?,?,?,?,?,?,?)";
		bean.setRegDate();
				try {
					pstmt = con.prepareStatement(sql);
					pstmt.setString(1, bean.getId());
					pstmt.setString(2, bean.getPw());
					pstmt.setString(3, bean.getName());
					pstmt.setString(4, bean.getRegDate());
					pstmt.setString(5, bean.getSsn());
					pstmt.setString(6, bean.getEmail());
					pstmt.setString(7, "member.jpg");
					pstmt.setString(8, bean.getPhone());
					result = pstmt.executeUpdate();
				
				} catch (Exception e) {
					e.printStackTrace();
				}
		return result;
	}
	public int updatePw(MemberBean mBean){
		int result = 0;
		String sql = "UPDATE MEMBER SET PW=?,EMAIL=? WHERE ID=?";
		try {
			pstmt = con.prepareStatement(sql);
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
	public int deleteMember(MemberBean bean){
		int result = 0;
		String sql = "DELETE FROM MEMBER WHERE ID=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getId());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	public MemberBean findByPK(String pk){
		String sql = "select * from member where id = ?";
		MemberBean temp = null; 
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, pk);
			rs = pstmt.executeQuery();
			if(rs.next()){
				temp = new MemberBean();
				temp.setId(rs.getString("ID"));
				temp.setPw(rs.getString("PW"));
				temp.setName(rs.getString("NAME"));
				temp.setEmail(rs.getString("EMAIL"));
				temp.setSsn(rs.getString("SSN"));
				temp.setRegDate(rs.getString("REG_DATE"));
				temp.setProfileImg(rs.getString("PROFILE_IMG"));
				temp.setPhone(rs.getString("PHONE"));
				System.out.println("DAO에서 ID존재 체크:"+temp.getId());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}
	public Map<String, MemberBean> selectMap() {
		Map<String, MemberBean> memberMap = new HashMap<String,MemberBean>();
		String sql = "SELECT * FROM MEMBER";
		try {
			pstmt = con.prepareStatement(sql);
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
