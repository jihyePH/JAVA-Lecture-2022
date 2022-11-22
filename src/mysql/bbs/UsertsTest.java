package mysql.bbs;

	import java.util.List;
	import java.util.Scanner;

//	import org.mindrot.jbcrypt.BCrypt;

	public class UsersTest {
		static UsersDao dao = new UsersDao();

		public static void main(String[] args) {
			
			dao.registerUser(new Users("maria","admin","마리아","admin@mysql.com"));
			dao.registerUser(new Users("kevin","james","케빈","james@mysql.com"));

//			Users user = dao.getUserInfo("admin");
//			System.out.println(user);
			
			List<Users> list = dao.listUsers();
			for (Users u: list)
				System.out.println(u);
			
//			Scanner scan = new Scanner(System.in);
//			System.out.print("uid> ");
//			String uid = scan.nextLine();
//			System.out.print("pwd> ");
//			String pwd = scan.nextLine();
//			login(uid, pwd);
		}
		
		static void login(String uid, String pwd) {
			Users user = dao.getUserInfo(uid);
			if (!uid.equals(user.getUid()))
				System.out.println("ID가 없습니다.");
			else {
				if (BCrypt.checkpw(pwd, user.getPwd()))
					System.out.println("Login 성공");
				else
					System.out.println("패스워드가 틀립니다.");
			}
		}
}
