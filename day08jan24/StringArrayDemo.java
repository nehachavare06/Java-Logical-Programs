package day08jan24;

import java.util.Arrays;

public class StringArrayDemo {
	public static void main(String[] args) {
		String[] str = new String[3];
		str[0] = "neha";	
		str[1] = "komal";	
        str[2] = "neha1";
        System.out.println(Arrays.toString(str));
        System.out.println("--------------------");
        
        String[] str1 = {"neha","neha1","neha2"} ;
        for(String x: str1) {
        System.out.println(x);
        }
        
        System.out.println("---------------------");
        for(int i=0; i<=str.length-1;i++)
        {
        	System.out.println(str[i]);
        }

		
		
	}

}
