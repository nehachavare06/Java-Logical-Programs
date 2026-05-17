package day09jan24;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListInitialization {
	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.add("D");
		System.out.println("l1 = "+l1);
		l1.remove("A");
		System.out.println("l1 = "+l1);
		LinkedList<String> l2 = new LinkedList<String>() {
			{add("neha");
			add("komal");
			add("Ankita");
			add("Ankita");
			}
	      };
	      System.out.println(l2);
		
		LinkedList<String> l3 = new LinkedList<String>(List.of("spain","italy","india"));
        System.out.println(l3);
        LinkedList<String> l4 = new LinkedList<String>(Arrays.asList("a","b","c","d"));
        System.out.println(l4);

}
}
