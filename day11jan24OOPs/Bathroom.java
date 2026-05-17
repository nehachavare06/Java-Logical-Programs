package day11jan24OOPs;

public class Bathroom {
	int mirrors;
	@Override
	public String toString() {
		 return "Bathroom[ mirrors="+mirrors +"]";
	}
	public static void main(String[] args) {
		Bathroom b = new Bathroom();
		System.out.println(b.toString());
	}

}
