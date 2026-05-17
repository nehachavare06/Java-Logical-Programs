package day08jan24;

public class Array2DSum {
	public static void main(String[] args) {
		int[][] arr = {
				        {1,2,3},
				        {2,1,2},
				        {2,3,1}
		              };
		int[][] arr1 = {
		        {1,2,3},
		        {2,6,5},
		        {2,2,1}
              };
		int[][] arr2 = new int[3][3];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
		{
				sum=sum+arr[i][j];
		     }
		}
		System.out.println("sum="+sum);
		
		for(int k=0;k<arr.length;k++)
		{
			for(int l=0;l<arr1.length;l++)
			{
				arr2[k][l]=arr[k][l]+arr1[k][l];
				//arr2[k][l]=sum1;
			}
		}
		for(int k=0;k<arr2.length;k++)
		{
			for(int l=0;l<arr2.length;l++)
			{
				System.out.print(arr2[k][l]+"\t");
			}
			System.out.println();
		}
		//System.out.println();
		
	}

}
