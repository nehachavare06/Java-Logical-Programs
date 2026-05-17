package day10jan24;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		Map<Integer,String> map = new LinkedHashMap<>();
		map.put(1, "23");
		map.put(2, "123");
		map.put(20, "345");
		map.put(12, "78");
		System.out.println(map);
	}

}
