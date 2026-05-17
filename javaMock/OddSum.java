package javaMock;

public class OddSum {
	public static void main(String[] args) {
		int oddsum=0;
		for(int i=1;i<=10;i=i+2)
		{
			
			oddsum=oddsum+i;
			System.out.println(oddsum);
		}
		System.out.println("oddSum="+oddsum);
		int evensum=0;
		for(int j=0;j<=10;j=j+2)
		{
			evensum=evensum+j;
			System.out.println(evensum);
		}
		System.out.println("Total="+evensum);
		
			
	}

}
