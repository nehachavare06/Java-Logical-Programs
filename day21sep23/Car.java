package day21sep23;

public class Car 
{
String name;
int price;
float weight;
boolean isElectric;
char brand;

void disp()
{
	System.out.println(name + ":"+ price+":"+weight+":"+isElectric+":"+brand);
}
//constructor-zero parametrised
Car()
{
	System.out.println("i am in a car constructor...");
}
//constructor overloading
Car(String name,int price,float weight,boolean isElectric,char brand)
{
	System.out.println("i am in a 5 parametrised car constructor stats with name.. ");
	this.name=name;
	this.price=price;
	this.weight=weight;
	this.isElectric=isElectric;
	this.brand=brand;
}
Car(int price,float weight,boolean isElectric,char brand,String name)
{
	System.out.println("i am in 5 parametrised car construvtor starting with price..");
	this.name=name;
	this.price=price;
	this.weight=weight;
	this.isElectric=isElectric;
	this.brand=brand;
}
public static void main(String[] args)
{
	Car c1 = new Car();
	c1.disp();
	Car c2 = new Car("Alto",200000,1200.50f,false,'M');
	c2.disp();
	Car c3 = new Car(50000,5000.40f,true,'s',"wagnor");
	c3.disp();
	
}


}
