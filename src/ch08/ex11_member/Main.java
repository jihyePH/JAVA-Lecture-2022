package ch08.ex11_member;

import java.util.Scanner;

import ch06.Ex41_MemberService;

public class Main {

	public static void main(String[] args) {
		MemberService memberService = new ArrayMemberService();
		memberService.register("kim", "9876", "김자바");
		memberService.register("hong", "12345", "홍길동");
		memberService.register("hong", "1234", "홍자바");
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("id: ");
		String id = scan.nextLine();
		System.out.print("password : ");
		String password = scan.nextLine();
		boolean result = memberService.login(id, password);
		if (result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout(id);
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
	}
		scan.close();
 }
	


}


