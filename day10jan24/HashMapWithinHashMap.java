package day10jan24;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapWithinHashMap {
public static void main(String[] args) {
	Map<Integer,Map<String,String>> map = new HashMap<>();
	Map<String,String> m1 = new HashMap<>();
	m1.put("name", "komal");
	m1.put("city", "Supe");
	map.put(1, m1);
	Map<String,String> m2 = new HashMap<>();
	m2.put("name", "neha");
	m2.put("city", "Phaltan");
	map.put(2, m2);
	Map<String,String> m3 = new HashMap<>();
	m3.put("name", "ankita");
	m3.put("city", "Baramati");
	map.put(3, m3);
	Set<Integer> ks = map.keySet();
	Iterator<Integer> iter = ks.iterator();
	while(iter.hasNext())
	{
		Integer t = iter.next();
		Map<String,String> m = map.get(t);
		System.out.println(t + " : " + m.get("name") + " : " + m.get("city") );
		
		System.out.println(t+ ":"+map.get(t));
	}
	
	
}
}
