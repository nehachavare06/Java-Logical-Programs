package javaMock;

public class SumOfFactorial {
	public static void main(String[] args) {
		int a=5,sum=0;
		for(int x=a;x>=1;x--)
		{
			int mult=1;
			for(int no=x;no>1;no--)
			
			mult=mult*no;
		
			System.out.println(mult);
			sum=sum+mult;
			}
			System.out.println(sum);
		}
		
	}


