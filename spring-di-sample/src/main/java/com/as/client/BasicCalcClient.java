package com.as.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.server.BasicCalc;
import com.server.CalcIntf;

public class BasicCalcClient {
	private CalcIntf calc = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//BasicCalcClient client = new BasicCalcClient();
		BasicCalc basicCalc = (BasicCalc)getBeanFactoy().getBean("obj1");
		BasicCalcClient client = (BasicCalcClient)getBeanFactoy().getBean("client");
		client.invokeOperations();
	}
	public void invokeOperations(){
		int var1 = calc.add(4,2);
		int var2 = calc.subtract(4,2);
		int var3 = calc.mult(4,2);
		double var4 = calc.div(3,2);
		
		System.out.println("The sum is: "+var1);
		System.out.println("The diff is: "+var2);
		System.out.println("The prod is: "+var3);
		System.out.println("The quot is: "+var4);
	}
	public CalcIntf getCalc(){
		return calc;
	}
	public void setCalc(CalcIntf calc){
		this.calc = calc;
	}
	public static BeanFactory getBeanFactoy(){
		Resource resource = new FileSystemResource("beans.xml");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		return factory;
		
	}

}
