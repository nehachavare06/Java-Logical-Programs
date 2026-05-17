package day11jan24OOPs;

public class MainMethodOverloading {
public static void main(String[] args) {
	System.out.println("inside main method");
	main(1000);
}
public static void main(int a) {
	System.out.println("inside main(a) : "+a);
	
}
}
