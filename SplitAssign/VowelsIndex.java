package SplitAssign;

public class VowelsIndex {
	public static void main(String[] args) {
		String S1 = "I love my India";
	  
		for(int i=0;i<S1.length();i++)
		{
			char ch=S1.charAt(i);
			switch(ch){
			case 'a','A' :
				System.out.println(ch+" Vowel is present");
			System.out.println("Index :"+S1.indexOf(ch)); 
			break;
			case 'e','E' :
				System.out.println(ch+" Vowel is present");
			System.out.println("Index :"+S1.indexOf(ch));
			break;
			case 'i','I' :
				System.out.println(ch+" Vowel is present");
			System.out.println("Index :"+S1.indexOf(ch));
			break;
			case 'o','O' :
				System.out.println(ch+" Vowel is present");
			System.out.println("Index :"+S1.indexOf(ch));
			break;
			case 'u','U' :
				System.out.println(ch+" Vowel is present");
			System.out.println("Index :"+S1.indexOf(ch));
			}
		}	
			
		}

}
