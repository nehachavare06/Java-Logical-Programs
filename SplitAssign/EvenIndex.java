package SplitAssign;

public class EvenIndex {
public static void main(String[] args) {
	String S1 ="I love my india";
	for(int i=0;i<S1.length();i++) {
		
		if(i%2==0)
		{
			System.out.println(S1.charAt(i) + " is a char of index "+ i);
		}
	}
}

}
