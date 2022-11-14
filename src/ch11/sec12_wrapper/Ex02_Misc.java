package ch11.sec12_wrapper;

public class Ex02_Misc {

	public static void main(String[] args) {
		Double d = Double.parseDouble("3.14");
		Integer i = Integer.parseInt("100");
		Integer k = 100;
		
		System.out.println(i == k);
		System.out.println(i.equals(k));
	}

}
