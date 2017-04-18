package com.java;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {

	private Point center;
	private Point center2;
	
	@Override
	public void draw() {
		System.out.println("Circle from Circle Class ");
		System.out.println("center = ("+getCenter().getX()+","+getCenter().getY()+")");
		System.out.println("center2 = ("+getCenter2().getX()+","+getCenter2().getY()+")");

	}
	public Point getCenter() {
		return center;
	}
	
	@Required
	@Autowired
	@Qualifier("circleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}
	public Point getCenter2() {
		return center2;
	}
	@Resource(name="pointB")
	public void setCenter2(Point center2) {
		this.center2 = center2;
	}
	@PostConstruct
	public void myInit() {
		System.out.println("My init method called for Circle.");
		
	}
	@PreDestroy
	public void clearUp() {
		System.out.println("Destroy  method called for Circle.");
		
	}

}
