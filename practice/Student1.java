package practice;

class Student1 {
	//instance variable/non static variable
	int id;
	String name;
	//Non static method
	void disp()
	{
		System.out.println("Displaying student info...");
	}
public static void main(String[] args) {
	Student1 s1 = new Student1();
	s1.id=100;
	s1.name="Neha";
	System.out.println("id="+s1.id);
	System.out.println("name="+s1.name);
	s1.disp();
}
}
