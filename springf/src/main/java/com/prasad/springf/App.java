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
//        System.out.println( "Hello World!" );
    	ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
    	Vehicle obj1 = (Vehicle)context.getBean("vehicle");
    	obj1.Run();
    }
}
