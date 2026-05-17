package day08jan24;



public class Arrays2D {
	public static void main(String[] args) {
		int[][] arr= new int[2][2];
		arr[0][0] = 2;
		arr[0][1] = 5;
		arr[1][0] = 8;
		arr[1][1] = 3;
		int[][] arr1 = { {2,3,4},
			             {4,5,6},
			             {3,2,4}
				       };
		for(int i=0;i<arr1.length;i++) 
		{
			for(int j=0;j<arr1.length;j++)
				{
			        System.out.print(arr1[i][j]+"\t");
			       
				}
			System.out.println();
		}
		System.out.println("---------------------------------");
		
		//System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=0;j<arr.length;j++)
				{
			        System.out.print(arr[i][j]+"\t");
			       
				}
			System.out.println();
		}
		
	}

}
