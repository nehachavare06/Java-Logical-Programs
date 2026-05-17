package javaMock;

public class Perfect {
	public static void main(String[] args)
	  {
	     int n = 6, d=1, sum = 0;

	     while(d <= (n/2))
	     {
	        if ( (n % d) == 0) 
		    sum = sum + d;  
		
		d++;
	     }
	     System.out.println("n   = " + n);
	     System.out.println("sum = " + sum);
	     if ( n == sum)
	         System.out.println(n + " is a PERFECT no");
	     else
	         System.out.println(n + " is NOT a PERFECT no");
	   }
}
