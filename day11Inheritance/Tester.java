package day11Inheritance;

public class Tester extends Emp{
	boolean isAutomation;
	public Tester() {
		System.out.println("Tester constructor is being called..");
	}
	void FindBugs() {
		System.out.println("Finds Bugs...");
	}
	public static void main(String[] args) {
		Tester t = new Tester();
		Emp e = new Tester();//Top Casting
		e.work();
		t.work();
		t.FindBugs();
		
	}

}
