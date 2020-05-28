package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {

		Set<Point> pSet = new HashSet<Point>();

		// Point에 새로운 변수들을 지정하였습니다.
		Point p01 = new Point(1, 2);
		Point p02 = new Point(3, 4);
		Point p03 = new Point(5, 6);
		Point p04 = new Point(7, 8);
		Point p05 = new Point(9, 10);
		Point p06 = new Point(5, 6);

		// HashSet에서는 add를 사용하여 추가합니다.
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		pSet.add(p04);
		pSet.add(p05);
		pSet.add(p06);

		// 향상된 for문을 사용하여 전체를 출력합니다.
		// for ( [형식] [사용자지정이름] : [전체틀(관리하는 담겨있는 그릇)]) { }
		for (Point i : pSet) {
			System.out.println(i.toString());
			System.out.println("------------------------");
		}

		// equals를 사용하여 p03의 값과 p06의 값이 동일한지 확인합니다. True.
		System.out.println(p03.equals(p06));

	}

}

//					출력 결과값
//					
//					Point [x=1, y=2]994
//					------------------------
//					Point [x=3, y=4]1058
//					------------------------
//					Point [x=5, y=6]1122
//					------------------------
//					Point [x=7, y=8]1186
//					------------------------
//					Point [x=9, y=10]1250
//					------------------------
//					true
