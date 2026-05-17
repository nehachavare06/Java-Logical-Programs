package javaMock;

public class Conditionalstmt {
	public static void main(String[] args) {
		int a=10, b=30;
		if(a>b)
			System.out.println("i am inside if block");
		else
			System.out.println("i am inside else block");
		//find the greatest number from given 2 numbers
		int c=89,d=100;
		if(c==d)
			System.out.println("both numbers are equal");
		else
		{
			if(c>d)
			System.out.println("c is bigger");
			else
				System.out.println("d is bigger");
		}
		
	}

}
