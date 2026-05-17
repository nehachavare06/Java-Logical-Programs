package day25sep23;

public class Hamam
{
int mirrors;
//Getter
public int getMirrors()
{
	return mirrors;
}
//setter
public void setMirrors(int mirrors)
{
	this.mirrors= mirrors;
}
//constructor 1 parametrised
public Hamam(int mirrors)
{
	this.mirrors = mirrors;
}
@Override
public String toString()
{
	return ""+mirrors;
}
public static void main(String[] args)
{
	Hamam h = new Hamam(4);
 System.out.println(h.toString());
}
}