package ArraryAssign;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		//int[] s=null;
		for(int i=arr.length-1;i>=0;i--)
		{
	      // System.out.println(arr[i]);
	       for(int j=0;j<=arr.length;j++)
	       {
	    	   int[] s=null;
	    	  s[j]=arr[i]; 
	  		System.out.println(Arrays.toString(s));
           }
           // System.out.println(s);
		
	}

}
}
