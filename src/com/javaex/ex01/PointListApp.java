package com.javaex.ex01;

public class PointListApp {

	public static void main(String[] args) {

		//	Point  관리
		MyList<Point> pList = new MyList<Point>();
		Point p1 = new Point(3, 3);
		Point p2 = new Point(4, 4);
		
		pList.add(p1);
		pList.add(p2);
		
		System.out.println(pList.size());
		
		//	Circle 관리
		MyList<Circle> cList = new MyList<Circle>();
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(7);
		
		cList.add(c1);
		cList.add(c2);
		
		System.out.println(cList.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		// Point 관리
//		PointList pList = new PointList(); // 배열 [3], crtPos = 0
//
//		Point p1 = new Point(3, 3);
//		Point p2 = new Point(4, 4);
//
//		pList.add(p1);
//		pList.add(p2);
//
//		System.out.println(pList.size());
//
//		// Circle 관리
//		CircleList cList = new CircleList();
//
//		Circle c1 = new Circle(5);
//		Circle c2 = new Circle(10);
//
//		cList.add(c1);
//		cList.add(c2);
//
//		System.out.println(cList.size());

	}

}
