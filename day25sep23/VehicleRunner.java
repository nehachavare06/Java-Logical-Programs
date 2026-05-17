package day25sep23;

public class VehicleRunner 
{
public static void main(String[] args)
{
	Engine e1 = new Engine(2,1);
	Vehicle v = new Vehicle("MH12 GB 3554",2,"Activa",e1);
	System.out.println(v.toString());
}
}
