package SplitAssign;

public class Consonants {
	public static void main(String[] args) {
		String S1 = "I love my India";
	   
	for(int i=0;i<S1.length();i++)
	{
		char ch=S1.charAt(i);
		switch(ch){
		case 'a','A' :
	     break;
		case 'e','E' :
			
		break;
		case 'i','I' :
			
		break;
		case 'o','O' :
			
		break;
		case 'u','U' :
		break;
		case ' ':
			break;
		default:
				System.out.println(ch + "consonant is present");
			
		}
	}
}
}	


