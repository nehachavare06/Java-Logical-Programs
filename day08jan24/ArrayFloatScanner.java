package day08jan24;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFloatScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int no = sc.nextInt();
		float[] n = new float[no];
		int i=0;
		while(no>0)
		{
			System.out.println("Enter Array elements :");
			n[i] = sc.nextFloat();
			i++;
			no--;
		}
		System.out.println(Arrays.toString(n));
		sc.close();
	}

}
