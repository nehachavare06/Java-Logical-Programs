package day11jan24OOPs;

public class InstanceVar {
	int id;
	String name;
	
void display() {
	System.out.println("i am in non static method...");
}

public static void main(String[] args) {
	InstanceVar v1 = new InstanceVar();
	InstanceVar s2 = v1;
	v1.id=12;
	v1.name="komal";
	System.out.println(v1.id+"="+v1.name);
	v1.display();
	System.out.println(s2.hashCode());
	System.out.println(v1.hashCode());
	//hashCode comes same because it pointing towards the same object
	
}
}