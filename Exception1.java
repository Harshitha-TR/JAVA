package ExceptionHandling;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=0;
		try{
			System.out.println(a/b);
		}
		catch(ArithmeticException ae) {
			System.out.println("It's an exception");
		}
		catch(Exception e)
		{
			System.out.println("Its an Exception");
		}
		
		finally 
		{
			System.out.println("Final block will always be Executed");
		}
	}

}
