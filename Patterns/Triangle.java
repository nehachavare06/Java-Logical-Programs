package Patterns;

public class Triangle {
	public static void main(String[] args) {
		int stars=1;
		int spaces=4;
		for(int r = 1;r<=5;r++)
		{
			for(int i=1;i<=spaces;i++)
			
				System.out.print(" ");
			
			for(int j =1;j<=stars;j++)
			
				System.out.print("* ");
			
			
			
			spaces--;
			stars++;
			System.out.println();
		}
		stars=4;
		spaces=1;
		for(int k=1;k<=4;k++)
		{
			for(int i=1;i<=spaces;i++)
			
				System.out.print(" ");
				for(int j= 1;j<=stars;j++)
				
					System.out.print("* ");
					stars--;
					spaces++;
					System.out.println();
				}
			
		}
	
	}


