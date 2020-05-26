package com.javaex.ex01;

public class MyList<T> {

//-----------------------------------------						필드
	
	private T[] tArray;
	private int crtPos;
	
//-----------------------------------------						생성자
	
	public MyList() {
		tArray = (T[])new Object[3];
		crtPos = 0;
	}
	
//-----------------------------------------						일반 메소드
	
	public void add(T t) {
		tArray[crtPos] = t;
		crtPos++;
	}
	
	public int size() {
		return crtPos;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
