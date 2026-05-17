package day11jan24OOPs;

public class InstanceBlockDemo {

	int no;
	String name;
	//Instance block
	{
		System.out.println("i am inside instance block 1...");
		this.name="neha";
		System.out.println(this.name);
		
	}
	{
		System.out.println("i am inside instance block 2");
		this.no=22;
		System.out.println(this.no);
	}
	public static void main(String[] args) {
		InstanceBlockDemo In = new InstanceBlockDemo();
		System.out.println(In.name);
		System.out.println("welcome to instance block demonstration...");
	}
}
