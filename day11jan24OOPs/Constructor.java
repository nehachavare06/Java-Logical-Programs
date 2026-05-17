package day11jan24OOPs;

public class Constructor {
int rollno;
String name;
//zero parameterized constructor
Constructor(){
	System.out.println("i am inside zero parametrized constructor...");
}
//one  constructor
Constructor(int rollno){
	System.out.println("i am inside one parameterized constructor...");
	this.rollno=rollno;
}
//two parameterized constructor
Constructor(int rollno, String name){
	System.out.println("two parameterized constructor");
	this.name=name;
	this.rollno=rollno;
}
void disp() {
	System.out.println("i an inside non static method");
	System.out.println(this.rollno+":"+this.name);
}
public static void main(String[] args) {
	Constructor c1 = new Constructor();
	c1.disp();
	Constructor c2 = new Constructor(20);
	c2.disp();
	c2.name="neha";
	System.out.println(c2.name);
}

}
