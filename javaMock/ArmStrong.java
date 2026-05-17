package javaMock;

public class ArmStrong {
	public static void main(String[] args)
	 {
		int len = 0, n = 153, r, orgNo=n;
		while(n != 0)
		{	
			r = n % 10;
			n = n / 10;
			len = len + 1;
		}
		System.out.println("length = " + len);
		n = orgNo;
		int mult = 1, sum=0;
		while(n != 0)
		{
			mult = 1;
			r = n % 10;
			for(int i=1;i<=len;i++)
				mult = mult * r;
			sum = sum + mult;
			n= n / 10;
		}
		System.out.println("sum = "  + sum);
		if (sum == orgNo)
			System.out.println(orgNo + " is ARMSTRONG no");
		else
			System.out.println(orgNo + " is NOT an ARMSTRONG no");
	 }

}
