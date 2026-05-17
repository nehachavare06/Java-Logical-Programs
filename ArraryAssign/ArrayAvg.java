	package ArraryAssign;

public class ArrayAvg {
	public static void main(String[] args) {
		
	int[] arr= {2,4,6,3,8,8};
	float sum=0;
	for(int i=0;i<arr.length;i++)
	{
		sum=sum+arr[i];
	}
	System.out.println("sum="+sum);
	float avg=(sum)/arr.length;
	System.out.println("avg="+avg);
}

}

