package day09jan24;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<Integer,String> ht = new  Hashtable<Integer,String>();
		ht.put(1, "neha");
		ht.put(2,"komal");
		ht.put(3, "ankita");
		ht.put(4, " ");
		System.out.println(ht);
		Enumeration<Integer> keyset = ht.keys();
		Iterator<Integer> it = keyset.asIterator();
		while(it.hasNext())
		{
			int t= it.next();
			System.out.println(t+"=="+ht.get(t));
		}
		Hashtable<String,String> ht1 = new Hashtable<String,String>(){
		{  put("10", "efr");
		   put("20", "asd");
		   put("30", "shj");
		}
		};
		Enumeration<String> keyset1 =ht1.keys();
		Iterator<String> it1 = keyset1.asIterator();
		while(it1.hasNext())
		{
			String t1 = it1.next();
			System.out.println(ht1.get(t1));
			
		}
		
	}

}
