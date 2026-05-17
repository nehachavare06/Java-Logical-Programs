package day09jan24;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInitialization {
	public static void main(String[] args) {
		//list of integer data type
		List<Integer> al = new ArrayList<>() {
			{
				add(10);
				add(20);
				add(30);
			}
		};
		System.out.println(al);
		//list of all data types
		ArrayList<Object> Al = new ArrayList<>();
		List<Object> l = new ArrayList<>();
		System.out.println("size of Al :"+Al.size());
		System.out.println("Al contents :"+ Al);
		Al.add(10);
		Al.add(true);
		Al.add("neha");
		Al.add(26);
		l.add(null);
		l.add('A');
		l.add(" ");
		System.out.println(Al);
		System.out.println(l);
		System.out.println("Al.get(0):"+Al.get(0));
		System.out.println("Al.get(1):"+Al.get(1));
		System.out.println("Al.get(2):"+Al.get(2));
		for(int i=0;i<Al.size();i++)
		{
			System.out.println("i = "+ i +":"+Al.get(i));
		}
		for(int i=Al.size()-1;i>=0;i--)
		{
			System.out.println("i="+i+":"+Al.get(i));
		}
		
		}

}
