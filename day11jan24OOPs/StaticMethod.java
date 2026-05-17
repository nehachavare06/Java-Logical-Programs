package day11jan24OOPs;

public class StaticMethod {
	static int no=45;
	
static void show() {
	
	System.out.println("i an in show() static method");
	}
static void run() {
	System.out.println("i am run() static method");
}
public static void main(String[] args) {
	//main method is also static thats why we don't have to create object for static methods
	//we can directly give call to them by class name.method name
	StaticMethod.show();
	StaticMethod.run();
	System.out.println(StaticMethod.no);
	
}

}
