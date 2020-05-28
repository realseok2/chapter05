package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class PointApp_TS01 {

	public static void main(String[] args) {

		// <Point>를 사용한 HashSet코드 입니다.
		Set<Point> pSet = new HashSet<Point>();

		// Point에 새로운 변수들을 지정하였습니다.
		Point p01 = new Point(1, 1);
		Point p02 = new Point(2, 2);
		Point p03 = new Point(3, 3);
		Point p04 = new Point(4, 4);
		Point p05 = new Point(5, 5);
		Point p06 = new Point(6, 6);
		Point p07 = new Point(7, 7);
		Point p08 = new Point(5, 5);
		Point p09 = new Point(6, 6);
		Point p10 = new Point(7, 7);

		// HashSet에서는 add를 사용하여 추가합니다.
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		pSet.add(p04);
		pSet.add(p05);
		pSet.add(p06);
		pSet.add(p07);
		pSet.add(p08);
		pSet.add(p09);
		pSet.add(p10);

		// 향상된 for문을 사용하여 전체를 출력합니다.
		// for ( [형식] [사용자지정이름] : [전체틀(관리하는 담겨있는 그릇)]) { }
		for (Point p : pSet) {
			System.out.println(p.toString());
		}

		System.out.println("--------------------------");

		// equals를 사용하여 p05, p06, p07의 값과 p08, p09, p10의 값이 동일한지 확인합니다.
		// p05 = p08, p06 = p09, p07 = p10은 모두 값이 동일하므로 모두 True값을 반환받습니다.
		System.out.println(p05.equals(p08));
		System.out.println(p06.equals(p09));
		System.out.println(p07.equals(p10));

		System.out.println("--------------------------");

		// equals를 사용하여 p01, p02, p03의 값과 p08, p09, p10의 값이 동일한지 확인합니다.
		// p01 = p08, p02 = p09, p03 = p10은 모두 값이 동일하지 않으므로 모두 False값을 반환받습니다.
		System.out.println(p01.equals(p08));
		System.out.println(p02.equals(p09));
		System.out.println(p03.equals(p10));

	}

}

//					출력 결과값
//					
//					Point [x=1, y=1]993
//					Point [x=2, y=2]1025
//					Point [x=3, y=3]1057
//					Point [x=4, y=4]1089
//					Point [x=5, y=5]1121
//					Point [x=6, y=6]1153
//					Point [x=7, y=7]1185
//					--------------------------
//					true
//					true
//					true
//					--------------------------
//					false
//					false
//					false