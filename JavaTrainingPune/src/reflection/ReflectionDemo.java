package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {
	public static void main(String[] args) {
		Empolyee empolyee=new Empolyee();
		Class demo = empolyee.getClass();
		
		System.out.println("constructor : ");
		
		Constructor[] constructors=demo.getConstructors();
		
		for(Constructor c :constructors ) {
			System.out.println(c);
		}
		System.out.println("------------------------------------------------");
		System.out.println("Method : ");
		//to get all the method of the Empolyee along inherited method
		//
		Method[] methods=demo.getMethods();
		for(Method method: methods) {
			System.out.println(method);
		}
		System.out.println("------------------------------------------------");
		System.out.println("Fields : ");
		Field [] fields=demo.getFields();
		for(Field field:fields ) {
			System.out.println(field);
		}
	}
}
