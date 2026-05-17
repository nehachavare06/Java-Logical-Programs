package SplitAssign;


public class StringCapital {
	public static void main(String[] args) {
	String S1 ="I Love My India";
	for(int i=0;i<S1.length();i++)
	{
		char ch = S1.charAt(i);
		if(ch>=65 && ch<=90)
		{
			System.out.println(ch);
		}
	}

}
}
