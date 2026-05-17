package javaMock;

public class TernaryOperator {
	public static void main(String[] args) {
		int a=300,b=700,c=500,res;
		res=(a>b&&a>c)?a:(b>c)?b:c;
		System.out.println("bigger number="+res);
		if(true)//forever true
		{
			if(true)
			{
				if(a==200)
				System.out.println("a is eqals to 300");
				else
					System.out.println("a is not equals to 300");
			}
		}
			
		
	}

}
