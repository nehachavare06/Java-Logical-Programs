package JavaInterview;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n= sc.nextInt();
		int r=0,rem;
		int no=n;
		while(n!=0)
		{
			rem=n%10;
			r=r*10+rem;
			n=n/10;
			
		}
		System.out.println(r);
		
		if(r==no)
		{
			System.out.println("n is palindrome");
		}
		else
		{
			System.out.println("n is not palindome");
		}
		sc.close();
	}
}
