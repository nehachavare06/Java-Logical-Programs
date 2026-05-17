package day08jan24;

import java.util.Scanner;

public class Array2Dscanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter array size :");
		int r = sc.nextInt();
		System.out.println("enter array size :");
		int c = sc.nextInt();
		int[][] n = new int[r][r];
	
		for(int i=0;i<r;i++)
		{
			
		for(int j=0;j<r;j++)
		{
		System.out.println("enter array elements:");
		n[i][j] = sc.nextInt();
		//no1++;
		}
		//no--;
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(n[i][j]+"\t");
			}
			System.out.println();
		}
		sc.close();
		//System.out.println();
		//System.out.println(Arrays.toString(null));	
		}
}
