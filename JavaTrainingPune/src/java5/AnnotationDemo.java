package java5;
@SuppressWarnings("unused")
@Deprecated
public class AnnotationDemo {
	public String message;
	
	@Deprecated
	public AnnotationDemo()
	{
		System.out.println("This is the default constructor");
	}
	@Deprecated
	void myMethod()
	{
		int number=100;
		System.out.println("Number is "+number);
	}
	
	
	void show ()
	{
		String msg="Hello";
		System.out.println("Message is "+msg);
	}
	@Override
	public int hashCode()
	{
		return 10;
	}
	
	@Override
	public String toString()
	{
		return "This is Annotation Class !!! " ;
	}
	public static void main(String[] args) {
		AnnotationDemo demo=new AnnotationDemo();
		System.out.println(demo);
		demo.message="welcome";
		demo.show();
		
	}
}
