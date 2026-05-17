package SplitAssign;

public class Vowels {
	public static void main(String[] args) {
		String S1 = "I love my India";
	   
		for(int i=0;i<S1.length();i++)
		{
			char ch=S1.charAt(i);
			switch(ch){
			case 'a','A' :
				System.out.println(ch+" Vowel is present");
			break;
			case 'e','E' :
				System.out.println(ch+" Vowel is present");
			break;
			case 'i','I' :
				System.out.println(ch+" Vowel is present");
			break;
			case 'o','O' :
				System.out.println(ch+" Vowel is present");
			break;
			case 'u','U' :
				System.out.println(ch+" Vowel is present");
			}
				
			
		}
	}

}
