package com.javaex.ex01;

public class MyList<T> {

//-----------------------------------------						필드
	
	private T[]oArray;
	private int crtPos;
	
//-----------------------------------------						생성자
	
	public MyList() {
		oArray = (T[])new Object[3];
		crtPos = 0;
	}
	
//-----------------------------------------						일반 메소드
	
	public void add(T t) {
		oArray[crtPos] = t;
		crtPos++;
	}
	
	public int size() {
		return crtPos;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
