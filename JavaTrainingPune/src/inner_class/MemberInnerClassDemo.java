package inner_class;

public class MemberInnerClassDemo {
	private int number;
	private static String msg;
	
	
	class MemberInnerClass{
		void setData(int num,String message)
		{
			number=num;
			msg=message;
		}
		void displayData()
		{
			System.out.println("Number is "+number);
			System.out.println("Message is "+msg);
		}
	}
	public static void main(String[] args) {
		MemberInnerClassDemo  demo=new MemberInnerClassDemo();
		MemberInnerClass obj=demo.new MemberInnerClass();
		obj.setData(10, "welcome");
		obj.displayData();
	}
}
