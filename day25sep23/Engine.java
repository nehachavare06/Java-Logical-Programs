package day25sep23;

public class Engine
{
int cylinders;
int pistons;
public Engine(int cylinders,int pistons)
{
	this.cylinders = cylinders;
	this.pistons = pistons;
	
}
@Override
public String toString()
{
	return cylinders + ":"+pistons;
}
}
