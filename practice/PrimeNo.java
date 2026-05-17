package practice;

public class PrimeNo {
	public static void main(String[] args) {
		int  in=0;
		int  r;
		int no=47;
		for(int div=2;div<=no/2;div++)
		{
			
			r=no%div;
			if(r==0)
			{
				in=1;
				break;
			}
		}
			
		
			
		if(in==1)
		{
			System.out.println("no is not prime");
		}
		else
		{
			System.out.println("no is prime");
		}
			
		}
	}


	

