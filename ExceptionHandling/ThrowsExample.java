package ExceptionHandling;
import java.io.*;  
class Demo1{  
	void check()throws IOException
	{  
		throw new IOException("device error");  
	}  
}  
public class ThrowsExample {
	public static void main(String args[])
	{  
	    try{  
	    	Demo1 obj=new Demo1();  
	    	obj.check();  
	    }catch(Exception e)
	    {
	    	System.out.println("exception handled");
	    }     
	  
	    System.out.println("normal flow...");  
	}  
}  


