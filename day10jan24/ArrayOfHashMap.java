package day10jan24;

public class ArrayOfHashMap {
	public static void main(String[] args) {
		Student[] sArr = new Student[4];
		Student s1 = new Student(10,"virat");
		Student s2 = new Student(20,"Dhoni");
		Student s3 = new Student(30,"shikhar");
        Student s4 = new Student(40,"rohit");
        
        sArr[0]=s1;
        sArr[1]=s2;
        sArr[2]=s3;
        sArr[3]=s4;
        for(Student s:sArr)
        {
        	System.out.println(s.getRollNo()+":"+s.getName());
        }
        
	}

}
