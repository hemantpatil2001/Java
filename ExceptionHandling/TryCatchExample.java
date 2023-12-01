package ExceptionHandling;

public class TryCatchExample {
	
	public static void main(String args[])
	{
		
		try
		{
			int[] arr=new int[5];
			arr[5]=20/0;
		}
		catch(ArithmeticException ae)
		{
			System.err.println(ae);
		}
		catch(ArrayIndexOutOfBoundsException aoe)
		{
			System.err.println(aoe);
		}
		catch(Exception e)
		{
			System.out.println("Parent Exception Occured");
		}
	}
}
