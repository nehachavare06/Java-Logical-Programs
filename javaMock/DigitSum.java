package javaMock;

public class DigitSum {
	public static void main(String[] args) {
		int no=345;
		int sum=0;
		for(;no!=0;)
		{
			int r;
		  r=no%10;
			System.out.println(r);
			sum=sum+r;
			System.out.println(sum);
			no=no/10;
		}
		System.out.println("total sum="+sum);
	}

}
