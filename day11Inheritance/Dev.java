package day11Inheritance;

public class Dev extends Emp {
	String techSkills;
	public Dev() {
		System.out.println("Dev constructor is being called..");
	}
	void coding() {
		System.out.println("dev does coding...");
	}
	public static void main(String[] args) {
		Dev d = new Dev();
		d.work();
		
	}

}
