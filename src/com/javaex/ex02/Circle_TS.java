package com.javaex.ex02;

public class Circle_TS {

//---------------------------------------------------					필드	

	private int radius;

//---------------------------------------------------					생성자

	public Circle_TS() {

	}

	public Circle_TS(int radius) {
		this.radius = radius;
	}

//---------------------------------------------------					getter, setter

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

//---------------------------------------------------					draw()

	public void draw() {
		System.out.println("[원]   Radius : " + radius + " 입니다.");
	}

//---------------------------------------------------					toString()
	@Override
	public String toString() {
		return "Circle_TS [radius=" + radius + "]";
	}

}
