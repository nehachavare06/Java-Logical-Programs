package javaMock;
interface I1
{
	public void m1();
}

class A implements I1
{
	@Override
	public void m1()
	{
		System.out.println("I am m1 method....");
	}
}
public class FunctionalInterface {
	public static void main(String[] args) {
//		I1 obj1 = new I1(); // can not create object of interface
			
		I1 obj = new A(); // top casting/runtime polymorphism
		obj.m1();
		}

}
