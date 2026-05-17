package SplitAssign;

public class Split {
public static void main(String[] args) {
	String s1="I learn Java from Cyber Success";
	String[] Arr=s1.split(" ");
	
	for(int i=Arr.length-1;i>=0;i--)
	{
		//System.out.println(Arr[i]);
		String rev= "";
		String str = Arr[i];
		
		for(int j=str.length()-1;j>=0;j--)
		{
			
			rev = rev+ str.charAt(j);
			
			
		}
		System.out.print(rev+ " ");
	}
	
	}
}
