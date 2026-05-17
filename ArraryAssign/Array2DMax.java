package ArraryAssign;

public class Array2DMax {
	public static void main(String[] args) {
    int[][] arr= {{1,2,3},{4,5,6}};
    int[][] arr1 = {{1,2,3},
    		        {3,4,5},
    		        {4,5,6}
                          };
    int[] ar = {1,2,3,4};
	System.out.println(arr.length);
    int max=arr[0][0];
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			if(arr[i][j]>max)
			{
			max=arr[i][j];	
		}
	}
}
	System.out.println("max Array="+max);
}
}
