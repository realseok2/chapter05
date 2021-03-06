package com.javaex.ex02;

import java.util.ArrayList;

public class PointApp {

	public static void main(String[] args) {

		ArrayList<Point> pList = new ArrayList<Point>();

		Point p1 = new Point(2, 2);
		Point p2 = new Point(3, 3);
		Point p3 = new Point(4, 4);

		// Point 추가
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);

		// 갯수 확인
		System.out.println("[ 갯수 확인 ]");
		System.out.println(pList.size());

		System.out.println("--------------------------------------------------");

		// 특정 Point 정보 읽기
		System.out.println("[ 특정 Point 정보 읽기 ]");
		Point p = pList.get(0);
		System.out.println(p.getX());
		p.draw();
		System.out.println(p.toString());

		System.out.println("--------------------------------------------------");

		// Point 전체 draw() 실행하기
		System.out.println("[ Point 전체 draw() 실행하기 ]");
		for (int i = 0; i < pList.size(); i++) {
			pList.get(i).draw();
		}

		System.out.println("--------------------------------------------------");

		// 향상된 for문
		System.out.println("[ 향상된 for문 ]");
		for (Point pp : pList) {
			pp.draw();
		}

		System.out.println("--------------------------------------------------");

		// Point 제거(index)
		System.out.println("[ Point 제거 (index) ]");
		pList.remove(1);
		for (int i = 0; i < pList.size(); i++) {
			pList.get(i).draw();
		}

		System.out.println("--------------------------------------------------");

		// Point 제거(Object)
		System.out.println("[ Point 제거 (Object) ]");
		pList.remove(p1);
		for (int i = 0; i < pList.size(); i++) {
			pList.get(i).draw();
		}

		System.out.println("--------------------------------------------------");

		// index값 알아내기
		System.out.println("[ index값 알아내기 ]");
		System.out.println(pList.indexOf(p3));

		System.out.println("--------------------------------------------------");

		// pList의 toString()
		System.out.println("[ pList의 toString() ]");
		System.out.println(pList.toString());

	}

}
