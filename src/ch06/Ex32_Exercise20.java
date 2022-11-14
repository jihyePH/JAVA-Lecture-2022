package ch06;

public class Ex32_Exercise20 {
private static Ex32_Account[] accountArray = new Ex32_Account[]
	
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			
			int selectNo = Integer.parseInt(scan.nextLine());
			switch(selectNo) {
			case 1:
				createAccount(); break;
			case2:
				accountList(); break;
//			case3:
	//			deposit(); break;
		//	case4:
			//	withdraw(); break;
			case5:
				run = false; break;
			default:
					System.out.println("Warning: 1에서 5까지의 숫자만 입력하세요");	
			}
		}
		System.out.println("프로그램 종료");
	}
	private static void accoungList() {
		System.out.println("--------------");
		System.out.println("계좌 목록");
		System.out.println("--------------");
		
		for (int i=0; i < index; i++) {
			System.out.printf(" %8s", accountArray[i].getAno()); //뒤의 데이터를 8칸에넣겠다
			System.out.printf("%8s", accountArray[i].getOwner());
			System.out.printf("%,12d", accountArray[i].getBalance());
		}
	}


	private static void createAccount() {
		System.out.println("--------------");
		System.out.println("계좌 생성");
		System.out.println("--------------");
		
		String ano = (1001 + index) + "";
		System.out.print("계좌주 이름> ");
		String owner = scan.nextLine();
		System.out.print("최초 입금액> ");
		int balance = Integer.parseInt(nextInt());
		
		acountArray[index++] = new Ex32_Account(owner, owner, balance);
		System.out.println("계좌가 생성되었습니다.");
	}

}
