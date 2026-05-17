package javaMock;

public class Prime {
	public static void main(String[] args)
	  {
	      int n = 23, d=2,r,in=0;

	      while(d < n)
	      {
		r = n % d;
		if ( r == 0)     // n is compltely divisible by d
	  	{
		    in = 1;
	            System.out.println(n + " is NOT a PRIME");
	            break;       // control will come out of innermost loop
		}
		d++;
	      } // end of while loop
	      if ( in == 0)
	      {
	            System.out.println(n + " is a PRIME");
	      }
	  }

}
