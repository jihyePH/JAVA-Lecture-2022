package ch11;

public class Q04_SelfNumber {
	public static final int SELF_NUMBER = 0;
	public static final int NOT_SELF_NUMBER = 1;

	public static void main(String[] args) {
		int [] selfNum = new int[100];
		for (int n = 1 ; n <= 99; n++) {
		int dn = n;
		while (true) {
			dn = dn + dn / 10 + dn % 10;
//			System.out.println(dn);
			if (dn <= 99)
			selfNum[dn] = NOT_SELF_NUMBER;
			if (dn > 100)
				break;
		}
	}

}
}
