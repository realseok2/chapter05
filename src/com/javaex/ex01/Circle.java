package com.javaex.ex01;

public class Circle {

	
//----------------------------------------						필드
	
	private int radius;

//----------------------------------------						생성자

	public Circle() {
		
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
//----------------------------------------						setter, getter
	
	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

//----------------------------------------						draw()

	public void draw() {
		
	}
	
//----------------------------------------						toString()
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
