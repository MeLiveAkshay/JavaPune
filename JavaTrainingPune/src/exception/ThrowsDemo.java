package exception;

public class ThrowsDemo {
	void division(int num1, int num2) throws ArithmeticException
	{
		System.out.println("Division Result of "+num1+ " and "+ num2 + " is :  "+ (num1/num2));
		System.out.println("End of division !!! ");
	}
}
