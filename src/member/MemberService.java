/**
 * 
 */
package member;

import global.CommonService;

import subject.SubjectMember;

/**
 *@date   : 2016. 6. 17.
 *@author : 박승주
 *@file   : StudentService.java
 *@story  : 
*/
public interface MemberService extends CommonService{
	public String regist(MemberBean mBean);
	public void update(MemberBean mBean);
	public void delete(MemberBean mBean);
	public MemberBean findById(String id);
	public SubjectMember login(MemberBean mBean);
	public void logout(MemberBean member);
	public MemberBean getSession();
}
