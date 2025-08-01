package inner_class;

public class NestedClassDemo {
	private int number;
	private static String msg;
	static class NestedClass{
		
		void setData(int num,String message)
		{
			//number=num;
			msg=message;
		}
		
		void displayData()
		{
			System.out.println("Message is "+msg);
		}
	}
	public static void main(String[] args) {
		NestedClassDemo.NestedClass obj=new NestedClassDemo.NestedClass();
		obj.setData(10, "hello");
		obj.displayData();
	}

}
