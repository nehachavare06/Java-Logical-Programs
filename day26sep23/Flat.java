package day26sep23;

public class Flat {
	int rooms;
	String owner;
	Bathroom br;
	public String toString(){
		return "flat [rooms="+rooms+",owner="+owner+",br="+br+"]";
	
	}
	public static void main(String[] args) {
		Flat flat=new Flat();
		System.out.println(flat.toString());
	}

}
