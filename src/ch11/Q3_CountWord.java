package ch11;

import java.util.HashSet;

/*
 * 단어의 개수 새는방법, 반복해서 나오는 단어도 모두 새기
 */
public class Q3_CountWord {

	public static void main(String[] args) {
		String text = "But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain\r\n"
			
		System.out.println(text.length());		
//		String cleanText = text.replaceAll("[\\.,\\?]", "" );
		String cleanText = text.replaceAll("[A-Za-z -]", "" );
		System.out.println(cleanText.length());
		
		String[] textArr = cleanText.split(" ");
		System.out.println("단어의 개수: " + textArr.length);

		//고유 단어의 개수
		HashSet<String> hs = new HashSet<>();
		for (String word : textArr)
			hs.add(word.toLowerCase());
		System.out.println("고유단어의 개수: " + hs.size());
	}

}
