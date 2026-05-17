package day08jan24;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements :");
		int no =sc.nextInt();
		int[] number = new int[no];
		System.out.println("enter array elements :");
		int i=0;
		while(no>0)
		{
			//System.out.println("enter array elements :");
			number[i] = sc.nextInt();
			i++;
			no--;
		}
		System.out.println("Array Contents :");
		for(int t: number)
		{
			System.out.println(t);
		}
		
		System.out.println(Arrays.toString(number));
		sc.close();
	}

}
