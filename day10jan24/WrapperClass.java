package day10jan24;

public class WrapperClass {

	public static void main(String[] args) {
		//AutoBoxing
		int b=20;
		Integer val=b;
		System.out.println(val);
		//primitive to non primitive by valueOf
		int a=10;
		Integer i = Integer.valueOf(a);
		System.out.println(i);
		//constructor
		int p=30;
		//Integer n = new Integer(p);
		System.out.println(p);
		//non primitive to primitive 
		//AutoUnBoxing
		Integer nPInt = Integer.valueOf(56);
		int PInt = nPInt;
		System.out.println(PInt);
		//xxxxValue()
		Integer nInt = Integer.valueOf(67);
		int Pr = nInt.intValue();
		System.out.println(Pr);
		//Casting
		Integer t = Integer.valueOf(56);
		int f = (int) t;
		System.out.println(f);
		int k=100;//
		//Integer j = new Integer(k);
		System.out.println(k);
		
		//Binary to Integer
		Integer seven = Integer.valueOf("111",2);
		System.out.println(seven);
		System.out.println(Integer.toString(seven, 2));
		
		
		Integer integer1 = Integer.valueOf(5);
		Integer integer2 = Integer.valueOf(5);
		System.out.println(integer1==integer2);
		System.out.println(integer1.equals(integer2));
		System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
		System.out.println("Integer MIN_VALUE:"+Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println("Integer.BYTES    : " + Integer.BYTES);
		
		


		
	}
}
