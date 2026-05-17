package day10jan24;

import java.util.HashSet;
import java.util.Set;

public class UniqueChars {
	public static void main(String[] args) {
		String s = "i am learning java and java programs";
		Set<Character> set = new HashSet<>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		System.out.println(set);
	}

}
