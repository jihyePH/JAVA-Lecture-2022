package ch08.ex11_member;

import ch06.Ex41_Member;

public class ArrayMemberService implements Ex41_MemberService{
	private Ex41_Member[] members = new Ex41_Member[10];
	
	@Override
	public void register(String id, String password, String name) {
	
	Ex11_Member member = findById(id);
	if (member != null) {
		System.out.println("id가 중복되었습니다.");
		return;
	}
	
	member = new Ex11_Member(id, password, name);
	for (int i = 0; i < members.length; i++) {
		if(members[i] == null) {
			members[i] = member;
			break;
		}
	}
	}

	@Override
	public void printAllMembers() {

	for (Ex11_Member member : members) {
		if (member == null)
			break;
		System.out.println(member);
	}
}
	@Override
	public Ex11_Member findById(String id) {
		for (Ex11_Member member : members) {
			if (member == null)  		//id에 해당하는member를 못찾은경우
				break;
			if (id.equals(member.getId())) 	//id에 해당하는 member찾음
				return member;
		}
		return null;
	}
	

	@Override
	public boolean login(String id, String password) {
		public boolean login(String id, String password) {
			Ex11_Member member = findById(id);
			if (member == null) 		//id에 해당하는 member가 없는경우
				return false; 		
			else { 					//id에 해당하는 member를 찾은경우
				if (password.equals(member.getPassword())) {
					System.out.println(member.getName() + "님 환영합니다.");
					return true;
				}else  				// password가 틀린경우
					return false;
			}
	}
	}


	@Override
	public void logout(String id) {
	
	}
		void logout(String id) {
			Ex11_Member member = findById(id);
			System.out.println(member.getName() + "님 로그아웃 되었습니다.");
	
	}
	
}
