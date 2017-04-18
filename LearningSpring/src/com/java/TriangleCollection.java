package com.java;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class TriangleCollection implements ApplicationContextAware,BeanNameAware{

	private List<Point> points;
	ApplicationContext context = null;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	public void draw(){
		System.out.println("Triangle from TriangleCollection ");
		for(Point point : points){
			System.out.println("point: ("+point.getX()+","+point.getY()+")");
		}
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
		
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean name is: "+beanName);
		
	}
}
