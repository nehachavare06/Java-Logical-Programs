package day08jan24;

import java.util.Arrays;

public class ArrayInitialization {
	public static void main(String[] args) {
		int[] arr1 =new int[3];
		arr1[0] = 23;
		arr1[1] = 224;
		arr1[2] = 34;
		System.out.println(Arrays.toString(arr1));
		int[] arr = {1,2,3,4,5,6};
        System.out.println(arr.length);
		System.out.println("arr -->"+arr);
		System.out.println(Arrays.toString(arr));
		
		int i=0;
		do {
		
			System.out.println(arr[i]);
			i++;
		}while(i<arr.length);
		System.out.println("----------------");
		
		/*for(int x : arr)
		{
			System.out.println(x);
		}*/
		for(int j=0;j<=arr.length-1;j++)
		{
			System.out.println(arr[j]);
		}

		
	}

}
