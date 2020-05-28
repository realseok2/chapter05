package com.javaex.ex07;

public class Point {

//----------------------------------------						필드

	private int x;
	private int y;

//----------------------------------------						생성자

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

//----------------------------------------						getter, setter

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

//----------------------------------------						draw()

	public void draw() {
		System.out.println("[Point]  x _ [ " + x + " ],   y _ [ " + y + " ] 를 그렸습니다.");
	}

//----------------------------------------						toString()

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]" + this.hashCode();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

//	@Override // Set이 이용할 것 같아서.
//	public boolean equals(Object obj) {
//
//		Point p = (Point) obj;
//		if (this.x == p.x && this.y == p.y) {
//			return true;
//		} else {
//			return false;
//		}
//	}
}
