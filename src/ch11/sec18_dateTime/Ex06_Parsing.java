package ch11.sec18_dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex06_Parsing {

	public static void main(String[] args) {
		LocalDateTime localDate = LocalDateTime.parse("2022-11-04");
		System.out.println(localDate);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		localDate = LocalDateTime.parse("2022.11.04", formatter);
		System.out.println(localDate);
	}

}
