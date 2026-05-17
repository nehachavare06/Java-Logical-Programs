package day11jan24OOPs;

public class Encapsulation {
	private double price;
	private String customer;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer=customer;
	}
	Encapsulation(double price,String customer){
		System.out.println("i am inside constructor");
this.customer=customer;
this.price=price;
System.out.println(price);
		
	}
	public static void main(String[] args) {
		Encapsulation en = new Encapsulation(2000,"komal");
		//System.out.println(en.price);
		en.price=3000;
		System.out.println(en.price);
	}
	

}
