package day11jan24OOPs;

public class Flat {
	int rooms;
	String owner;
	Bathroom Br;
	@Override
	public String toString() {
		return "Flat [rooms=" + rooms + ", owner=" + owner + ", Br=" + Br + "]";
	}
	public static void main(String[] args) {
		Flat flat = new Flat();
		System.out.println(flat.toString());
	}

}
