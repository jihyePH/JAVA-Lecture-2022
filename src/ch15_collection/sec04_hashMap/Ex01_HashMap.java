package ch15_collection.sec04_hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * HashMap 사용법
 */
public class Ex01_HashMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		//객체 저장
		map.put("사과", 1000);
		map.put("배", 2000);
		map.put("수박", 2000);
		map.put("배", 4000); 		//key 중복되면, value를 수정함
		System.out.println("총 엔트리수 : "+ map.size());
		System.out.println(map.get("배")); 	//4000원
		
		//key로 값 얻기
		String key = "배";
		int value = map.get(key);
		System.out.println(key+ ": "+ value);
		System.out.println();
		
		//key set collection
		Set<String> keySet = map.keySet();
		for (String s : keySet)
			System.out.println(s + ": " + map.get(s));
		System.out.println();
		
		//Entry Set collection
		Set <Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet)
			System.out.println(entry.getKey()+":" + entry.getValue());
		System.out.println();
		
		//Iterator
		Iterator<Entry<String, Integer>> iter = entrySet.iterator();
		while(iter.hasNext()) {
			Entry<String, Integer> entry = iter.next();
			System.out.println(entry.getKey()+":" + entry.getValue());
		}
		System.out.println();
		
		//forEach !!!
		map.forEach((k, v)-> System.out.println(k+ " : "+ v));
		System.out.println();
		
		//key로 entry 삭제하기 
		map.remove("사과");
		System.out.println("총엔트리수: "+ map.size());
		map.forEach((k, v)-> System.out.println(k+ " : "+ v));
		System.out.println();
		
		//키 검색
		System.out.println(map.containsKey("배"));
		System.out.println(map.containsKey("사과"));
		
		//value 검색하기
		System.out.println(map.containsValue(1000));
		
	}

}
