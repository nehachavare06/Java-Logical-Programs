package day10jan24;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		System.out.println(set.size());
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		System.out.println(set);
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext())
		{
		    System.out.println(iter.next());
		}
		Set<Integer> set1 = new HashSet<>() {
			{
				add(40);
				add(60);
				add(70);
			}
		};
		System.out.println(set1);
		set.addAll(set1);
		System.out.println(set);
		Set<Integer> set2 = new HashSet<>(List.of(1,2,3));
		System.out.println(set2);
		
		
	}

}
