package ch10.ex12_member;

import ch06.Ex41_Member;

public class ArrayMemberService implements MemberService{
	private Member[] members = new Member[10];
	
	@Override
	public void register(String id, String password, String name) {
	Member member = findById(id);
	if (member != null) {
		System.out.println("id가 중복되었습니다.");
		return;
	}
	
	member = new Member(id, password, name);
	for (int i = 0; i < members.length; i++) {
		if(members[i] == null) {
			members[i] = member;
			break;
		}
	}
	}

	@Override
	public void printAllMembers() {

	for (Member member : members) {
		if (member == null)
			break;
		System.out.println(member);
	}
}
	@Override
	public Member findById(String id) {
		for (Member member : members) {
			if (member == null)  		//id에 해당하는member를 못찾은경우
				break;
			if (id.equals(member.getId())) 	//id에 해당하는 member찾음
				return member;
		}
		return null;
	}
	

	@Override
	public boolean login(String id, String password) throw NotExistidException, WrongPasswordException {
			Member member = findById(id);
			if (member == null) 		//id에 해당하는 member가 없는경우
				throw new NotExistidException(id + "이/가 잘못되었습니다.");
//				return false; 		
			else { 					//id에 해당하는 member를 찾은경우
				if (password.equals(member.getPassword())) {
					System.out.println(member.getName() + "님 환영합니다.");
					return true;
				} else  				// password가 틀린경우
					throw new WrongPasswordException("패스워드가 틀렸습니다.");
//					return false;
			}
	}
	
	@Override
	public void logout(String id) {
			Ex11_Member member = findById(id);
			System.out.println(member.getName() + "님 로그아웃 되었습니다.");
	
	}
	
}
