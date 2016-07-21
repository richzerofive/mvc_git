/**
 * 
 */
package member;

import java.util.List;

import global.CommonService;

/**
 *@date   : 2016. 6. 17.
 *@author : 박승주
 *@file   : StudentService.java
 *@story  : 
*/
public interface MemberService extends CommonService{
	public int regist(MemberBean mBean);
	public int update(MemberBean mBean);
	public int delete(MemberBean mBean);
	public MemberBean findById(String id);
	public String login(MemberBean mBean);
	public void logOut(MemberBean mBean);
	public MemberBean getSession();
}
