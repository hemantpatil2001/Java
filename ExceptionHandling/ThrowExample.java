package ExceptionHandling;

public class ThrowExample {
	public static void checkAge(int age) {  
        if(age<18) {  
            throw new ArithmeticException("Person is not eligible to vote");    
        }  
        else {  
            System.out.println("Person is eligible to vote");  
        }  
    }  
    public static void main(String args[]){  
        checkAge(25); 
        System.out.println("End...");    
  }    

}
