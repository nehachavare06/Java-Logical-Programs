package day10jan24;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		Map<Integer,String> map = new TreeMap<>();
		map.put(2,"koma");
		map.put(1, "34");
		map.put(3, "java");
		System.out.println(map);
	}

}
