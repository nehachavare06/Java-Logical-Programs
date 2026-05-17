package day09jan24;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//import java.util.ListIterator;


public class ArrayListIterator {
	public static void main(String[] args) {
		ArrayList<Integer> Al = new ArrayList<>(); 
		Al.add(10);
		Al.add(20);
		Al.add(30);
		ArrayList<Object> al = new ArrayList<>();
		List<Object> l = new ArrayList<>();
		al.add(10);
		al.add(true);
		al.add(null);
		al.add("komal");
		al.add('N');
		System.out.println(al);
		//List Iterator
		System.out.println("Printing using ListIterator");
		//ListIterator<Integer> it = new Al.listIterator();
		int i=0;
	Iterator itr = al.iterator();
	while(itr.hasNext())
	{
		System.out.println("Val :" +i++ +":" +itr.next());
	}
	//polymorphic integer ArrayList 
	List<Integer> l1 = new ArrayList<Integer>();
	l1.add(100);
	l1.add(200);
	l1.add(300);
	int sum=0;
	for(int var : l1)
	{
		sum=sum+var;
	}
	System.out.println("sum="+sum);
		boolean res =al.addAll(l1);
			System.out.println("res="+res);
			System.out.println(al);
			al.addAll(0,l1);
			System.out.println(al);
			res=al.contains(100);
			System.out.println(res);
			
	}

}
