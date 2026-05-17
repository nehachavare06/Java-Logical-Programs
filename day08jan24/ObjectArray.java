package day08jan24;

import java.util.Arrays;

public class ObjectArray {
	public static void main(String[] args) {
		//Object is the super data type and can hold any data type
		Object[] objArr = {"neha",'A',34.0,45};
		for(int i=0;i<=objArr.length-1;i++)
		{
		System.out.println(objArr[i]);
		}
		
		System.out.println(Arrays.toString(objArr));
		int arr[] = new int[3];
		//prints default values if not initialized
		System.out.println(arr[0]);
		System.out.println(arr[2]);
		

	}

}
