package day21sep23;

public class Student {
	int rollNo;
	String name;
	//zero parameterised constructor
	Student()
	{
		System.out.println("i am in a zero parametrised constructor...");
	}
	//1 parameter rollno constructor
	Student(int rollNo)
	{
		System.out.println("i am in a 1 parametrised constructor");
		this.rollNo = rollNo;
	}
	//1 parameter name constructor
	Student(String name)
	{
		System.out.println("i am in 1 parametrised name constructor");
		this.name= name;
	}
	//2 parameters rollno and name constructor
	Student(int rollNo, String name)
	{
		System.out.println("i am in 2 parametrised rollno, name constructor...");
		this.rollNo =rollNo;
		this.name = name;
	}
	// 2 parameters name and rollno constructor
	Student(String name,int rollNo)
	{
		System.out.println("i am in 2 parametrised name , rollno constructor...");
		this.rollNo = rollNo;
		    this.name = name;
	}
	void disp()
	{
		System.out.println(this.rollNo+":"+this.name);
	}
	

	public static void main(String[] args) 
	{
	Student s1 =new Student();
	s1.disp();
	Student s2= new Student(101);
	s2.disp();
	Student s3 = new Student("Rohit");
	s3.disp();
	Student s4 = new Student(202,"Saurabh");
	s4.disp();
	Student s5 =new Student("Mahesh",303);
	s5.disp();
		
	}

}
