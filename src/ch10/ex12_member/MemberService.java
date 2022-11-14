package ch10.ex12_member;

import ch06.Ex41_Member;

public interface MemberService {
	void register(String id, String password, String name) ;
	void printAllMembers() ;
	Member findById(String id);
	boolean login(String id, String password);
	void logout(String id);
	
}
