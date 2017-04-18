package com.java;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;



public class TestDrive {

	public static void main(String[] args){
		
		/*BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle t = (Triangle)factory.getBean("triangle");*/
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		
		//Triangle t = (Triangle)context.getBean("triangle");
		//t.getTriangle();
		//System.out.println(t.getType()+" triangle height is "+t.getHeight());
		
		Shape shape1= (Triangle)context.getBean("triangle");
		Shape shape2 = (Circle)context.getBean("circle");
		
		shape1.draw();
		shape2.draw();
		
		ApplicationContext context2 = new ClassPathXmlApplicationContext("spring2.xml");
		TriangleCollection t2 = (TriangleCollection)context2.getBean("triangleC1");
		t2.draw();
		
	}
}
