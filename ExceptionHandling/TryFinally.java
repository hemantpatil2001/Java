package ExceptionHandling;

public class TryFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int ans=20/0;
			System.out.println(ans);
		}
		catch(ArithmeticException ae)
		{
			System.err.println(ae);
		}
		catch(Exception e)
		{
			System.out.println("Parent Exception Occured");
		}
		finally
		{
			System.out.println("Finally block is executed...");
		}
		
		System.out.println("End...");
	}
}
