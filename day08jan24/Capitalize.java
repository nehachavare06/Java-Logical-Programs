package day08jan24;

public class Capitalize {
	public static void main(String[] args) {
		char[] arr = {'a','A','b','c','D'};
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>=65 && arr[i]<=90)
			{
				System.out.print(arr[i]+"\t");
			}
			if(arr[i]>=97 && arr[i]<=122)
			{
				System.out.print((char)(arr[i]-32)+ "\t");
			}
		}
		
	}

}
