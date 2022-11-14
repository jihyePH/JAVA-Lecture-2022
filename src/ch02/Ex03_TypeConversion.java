package ch02;

public class Ex03_TypeConversion {

	public static void main(String[] args) {
		byte b = 30;
		short c = 300;
		int i = b;   //작은수->큰수:자동변환이루어짐
		i = c;  	 // Promotion
	
		short s = (short)i;		//큰수->작은수로 변할때는 강제타입변환Casting
		
		long l = i; 	//int -> long
		float f = l;	//long -> float
		double d = f; 	//float -> double
		
		if (s >= -128 && s <= -127)
			byte bb =(byte)s;
	    }	
		byte bb = (byte)s; 		//실행할 때 에러발생
		
		System.out.println(s);
		System.out.println(bb);
	
		i = b+s;
		d = f+l;
		String str = "str" + d;
		//byte1 -> short2 -> int4 -> long8 -> float4 -> double8 -> String
		
  }

}
