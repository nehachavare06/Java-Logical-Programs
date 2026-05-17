package day11jan24OOPs;

public class StaticDemo {
	static int  var;
	
	static
	{
		System.out.println("i am inside static block");
		 var = var +100; 
		System.out.println("var="+var);
	}
	static
	{
		System.out.println(" i am inside static block 2");
		var=var+35;
		System.out.println("var="+var);
	}
	public static void main(String[] args) {
		System.out.println("Welcome to static block demonstartion");
	}

}
