package inner_class;

public class AnonymousInnerClassDemo {
	public static void main(String[] args) {
		Demo demo=new Demo()
		{
	public void show() {
		System.out.println("Inside show () !!!");
	}
	public void display(String msg)
	{
		System.out.println("Inside display(String ) !!!");
		System.out.println("Message is : "+msg);
	}
		};
		demo.show();
		demo.display("Hello");
		
		AbstractClass  obj=new AbstractClass()
		{

			@Override
			void show(String msg) {
				System.out.println("Inside show (String ) !!!");
				System.out.println("Message is "+msg);
				
			}
					
		};
		obj.show("Welcome");
	}	
	
			
}
