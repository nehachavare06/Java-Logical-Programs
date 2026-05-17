package day10jan24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingDemo {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>(List.of(1,2,4,6,5,3,7,8,9));
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
	}
}
