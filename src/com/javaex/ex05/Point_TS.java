package com.javaex.ex05;

public class Point_TS {

//--------------------------------------					필드

	private int x;
	private int y;

//--------------------------------------					생성자

	public Point_TS() {

	}

	public Point_TS(int x, int y) {
		this.x = x;
		this.y = y;
	}

//--------------------------------------					getter, setter

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

//--------------------------------------					equals()

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
//--------------------------------------					hashcode()

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

//--------------------------------------					toString()

	@Override
	public String toString() {
		return "Point_TS [x=" + x + ", y=" + y + "]";
	}

}
