package ArraryAssign;

public class MinArray {
	public static void main(String[] args) {
		int[] arr= {2,6,7,4,5,8};
		System.out.println(arr[0]);
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
	System.out.println("min Array = "+ min);
	}

}
