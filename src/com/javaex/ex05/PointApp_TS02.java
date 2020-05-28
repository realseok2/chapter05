package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class PointApp_TS02 {

	public static void main(String[] args) {

//		[문제]
//		같은 Point는 등록하지 않습니다.
//		같은 Point의 조건은 두 점의 x값과 y의 값이 같아야 합니다.
//		(HashSet을 사용하여 중복제거, equals() 재정의)
		
		
		Set<Point> pSet = new HashSet<Point>();
		
		Point p1 = new Point(1,1);
		Point p2 = new Point(2,2);
		Point p3 = new Point(3,3);
		Point p4 = new Point(1,1);
		
		pSet.add(p1);
		pSet.add(p2);
		pSet.add(p3);
		pSet.add(p4);
		
		pSet.remove(p2);
		System.out.println(pSet.toString());
		
		for(Point p : pSet) {
			System.out.println(p.toString());
		}
		
		System.out.println(p1.equals(p4));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
