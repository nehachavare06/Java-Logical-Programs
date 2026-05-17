package ArraryAssign;

public class ArrayEvenNo {

	public static void main(String[] args) {
		int[][] arr= {{2,3,4},{4,5,6},{7,8,5}};
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
		
			if(arr[i][j]%2==0)
			{
				System.out.println(arr[i][j]+"is even");
			}
			}
	
		
      }
}
}
