package com.javaex.ex02;

import java.util.ArrayList;

public class CircleApp_TS {

	public static void main(String[] args) {

		ArrayList<Circle_TS> cList = new ArrayList<Circle_TS>();

		Circle_TS c1 = new Circle_TS(3);
		Circle_TS c2 = new Circle_TS(6);
		Circle_TS c3 = new Circle_TS(9);
		Circle_TS c4 = new Circle_TS(12);
		Circle_TS c5 = new Circle_TS(15);
		Circle_TS c6 = new Circle_TS(18);
		Circle_TS c7 = new Circle_TS(21);
		Circle_TS c8 = new Circle_TS(24);
		Circle_TS c9 = new Circle_TS(27);
		Circle_TS c10 = new Circle_TS(30);

		// Circle 추가
		cList.add(c1);
		cList.add(c2);
		cList.add(c3);
		cList.add(c4);
		cList.add(c5);
		cList.add(c6);
		cList.add(c7);
		cList.add(c8);
		cList.add(c9);
		cList.add(c10);

		// 갯수 확인
		System.out.println("-------------------------------------------		갯수확인");
		System.out.println(cList.size());

		// 특정 Circle 정보 읽기
		System.out.println("-------------------------------------------		특정 Circle 정보 읽기");
		Circle_TS c = cList.get(6);
		System.out.println(c.getRadius());
		c.draw();
		System.out.println(c.toString());

		// Circle 전체 draw() 실행하기
		System.out.println("-------------------------------------------		Circle 전체 draw() 실행하기");
		for (int i = 0; i < cList.size(); i++) {
			cList.get(i).draw();
		}

		// 향상된 for문
		System.out.println("-------------------------------------------		향상된 for문");
		for (Circle_TS cc : cList) {
			cc.draw();
		}

		// Circle 제거 (index)
		System.out.println("-------------------------------------------		Circle 제거 (index)");
		cList.remove(3);
		for (int i = 0; i < cList.size(); i++) {
			cList.get(i).draw();
		}

		// Circle 제거 (Object)
		System.out.println("-------------------------------------------		Circle 제거 (Object)");
		cList.remove(c1);
		for (int i = 0; i < cList.size(); i++) {
			cList.get(i).draw();
		}

		// index 값 알아내기
		System.out.println("-------------------------------------------		index 값 알아내기");
		System.out.println(cList.indexOf(c5));

		// cList의 toString()
		System.out.println("-------------------------------------------		cList의 toString()");
		System.out.println(cList.toString());

	}

}
