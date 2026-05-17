package javaMock; 
 
      
public class staticoverloading {
	  
	  
	    static void consume(int a)  
	    {  
	        System.out.println(a+" consumed!!");  
	    }  
	    static void consume(int a,int b)  
	    {  
	        System.out.println("consumed static "+a);  
	    }  
	    public static void main (String args[])  
	    {  
	    	staticoverloading a = new staticoverloading();  
	        a.consume(10,20);  
	        staticoverloading.consume(20);  
	    }  
	}    
