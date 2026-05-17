package practice;

public class constructor {
public static void Add(int a, int b,int c)
{
System.out.println("a="+a);	
System.out.println("b="+b);	
int add=a+b+c;
System.out.println("sum="+add);
}
public static void Add1(int x, int y) {
	int res=x+y;
	System.out.println("res="+res);
}
public static void main(String[] args) {
	Add(2,4,5);
	Add(24,45,5);
	Add1(3,5);
	
	
}
}
