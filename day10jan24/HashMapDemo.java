package day10jan24;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "neha");
		map.put(2, "komal");
		map.put(3, "neha1");
		System.out.println(map);
		Set<Integer> set = map.keySet();
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext())
		{
			Integer k = iter.next();
			System.out.println(k+"="+map.get(k));
		}
		
	}

}
