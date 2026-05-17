package ArraryAssign;

public class Arraymax {
	public static void main(String[] args) {
		int[] arr= {2,6,7,4,5,8};
		System.out.println(arr[0]);
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
	System.out.println("max Array = "+ max);
	}

	
}
