package inner_class;

public class MethodLocalInnerClassDemo {
	private int number;
	private static String msg;
	
	void myMethod()
	{
		int count =100;
		class MethodLocalClass{
			void setData(int num,String message)
			{
				number=num;
				msg=message;
			}
			void displayData()
			{
				System.out.println("Number is "+number);
				System.out.println("Message is "+msg);
				System.out.println("Local Variable count is : "+count);
			}
		}
		MethodLocalClass demo=new MethodLocalClass();
		demo.setData(100, "hi");
		demo.displayData();
	}
	public static void main(String[] args) {
		MethodLocalInnerClassDemo demo=new MethodLocalInnerClassDemo();
		demo.myMethod();
	}
}
