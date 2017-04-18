package com.java;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;

public class Triangle implements Shape,InitializingBean,DisposableBean{
	
	/*public void getTriangle(){
		System.out.println("This is a Triangle");
	}*/
	
	private String type;
	private int height;
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Triangle(){
		super();
	}
	public Triangle(String type){
		this.type = type;
	}
	public Triangle(int height){
		this.height = height;
	}
	public Triangle(String type, int height) {
		super();
		this.type = type;
		this.height = height;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Point getPointA() {
		return pointA;
	}
	
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	public void draw(){
		System.out.println("Triangle from Triangle Class ");
		System.out.println("pointA = ("+getPointA().getX()+","+getPointA().getY()+")");
		System.out.println("pointB = ("+getPointB().getX()+","+getPointB().getY()+")");
		System.out.println("pointC = ("+getPointC().getX()+","+getPointC().getY()+")");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean init method called for triangle.");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean destroy method called for triangle.");
		
	}
	public void myInit() {
		System.out.println("My init method called for triangle.");
		
	}
	
	public void clearUp() {
		System.out.println("My ClearUp  method called for triangle.");
		
	}
	

}
