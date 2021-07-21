package com.prasad.springf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
    	
		/*
		 * Using bean definition in xml 
		 * Vehicle obj1 = (Vehicle)context.getBean("bike");
		 * obj1.Run();
		 */

/*    	
    	using annotaion in class
    	Tyre t = (Tyre)context.getBean("tyre");
    	t.setBrandName("newTyre");
    	System.out.printlnt);
*/
    	
    	//Using constructor
    	Car obj1 = (Car)context.getBean("car");
    	System.out.println(obj1.getCompany());
		/*
		 * notice that unlike tyre class , we havent implemented an overriden toString
		 * method s.o.p(obj1) wont work here
		 */
    		
    }
}
