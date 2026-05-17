package day10jan24;

public class ExceptionDemo {

	public static void main(String[] args) {
		try
		{
			int[] arr= {1,2,3};
			System.out.println(arr[4]);
			//String s=null;
			//System.out.println(s.length());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("AIOBE occured !!!");
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e)
		{
			System.out.println("NPE occured");
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("i am in finally block");
		}
	}
}
