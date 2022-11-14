package ch15_collection.sec07_treeMap;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

/*
 * TreeMap 일반적 사용법
 */
public class Ex01_TreeMap {

	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<>();
		
		tm.put("apple", 10);
		tm.put("forever", 60);
		tm.put("discription", 40);
		tm.put("ever", 50);
		tm.put("zoo", 80);
		tm.put("base", 90);
		tm.put("guess", 20);
		tm.put("cherry", 70);
		
		//정련된 entry 가져오기
		for (Entry<String, Integer> entry: tm.entrySet())
		System.out.println(entry.getKey()+ "-"+ entry.getValue());
		System.out.println();
		tm.forEach((k,v)-> System.out.println(k +"-" + v));
		System.out.println();
		
		//범위 검색
		System.out.println("[c~h) 사이의 단어검색");
		NavigableMap<String, Integer> rangeMap = tm.subMap("c", true, "g", false);
		rangeMap.forEach((k, v)-> System.out.println(k + "-"+ v));
	}

}
