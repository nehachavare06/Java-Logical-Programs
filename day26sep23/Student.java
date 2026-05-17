package day26sep23;

public class Student {
int id;
String name;
int std;
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", std=" + std + "]";
}
public Student (int id)
{
	this.id=id;
}
public Student(int id , String name)
{
	this.id=id+100;
	this.name=name;
}
public Student(String name,int id)
{
	this.name=name;
	this.id=id+500;
}
public Student(int id1,String name1,int std)
{
	//this(id1,name1,std);
	this(name1,id1);//this() will give a call to the constructor of the same class
	//this(id1,name1,std);
	this.std=std;
}
void disp() {
	//this(200,"virat",10);
	//this has to be in a constructor method not in any other method
	}
Student getInstance()
{
	return this;
}
public static void main(String[] args)
{
	Student s1= new Student(1,"virat",12);
	System.out.println(s1);
	Student s2 =s1.getInstance();
	System.out.println(s2);
}
}
 



