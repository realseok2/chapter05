package com.javaex.ex07;

import java.util.HashMap;
import java.util.Map;

public class PointApp_TS {

	public static void main(String[] args) {

		// <String, Point>를 사용한 HashMap코드입니다.
		Map<String, Point> pMap = new HashMap<String, Point>();

		Point p01 = new Point(1, 1);
		Point p02 = new Point(2, 2);
		Point p03 = new Point(3, 3);
		Point p04 = new Point(4, 4);
		Point p05 = new Point(5, 5);
		Point p06 = new Point(4, 4);
		Point p07 = new Point(5, 5);

		// HashMap에서는 add가 아닌 put으로 값을 입력합니다.
		pMap.put("a", p01);
		pMap.put("b", p02);
		pMap.put("c", p03);
		pMap.put("d", p04);
		pMap.put("e", p05);
		pMap.put("f", p06);
		pMap.put("g", p07);

		// c와 e라는 key값을 지닌 좌표의 y값을 불러오기 위한 방법입니다.
		// 두가지 방법 모두 사용 가능한 코드이지만 첫번째 방식보다는 두번째 방식을 사용(선호)하도록 합니다.
		System.out.println(pMap.get("c").getY());

		Point p = pMap.get("e");
		System.out.println(p.getY());

		// 향상된 for문을 사용하여 전체 값을 출력합니다.
		// for ( [형식] [사용자지정이름] : [전체틀(관리하는 담겨있는 그릇)]) { }
		// 사용자지정이름(i) : 사용자지정이름(i)이 가지고 있는 좌표값
		for (String i : pMap.keySet()) {
			System.out.println(pMap.get(i).toString());
		}

	}

}

//					출력 결과값
//					
//					3
//					5
//					Point [x=1, y=1]993
//					Point [x=2, y=2]1025
//					Point [x=3, y=3]1057
//					Point [x=4, y=4]1089
//					Point [x=5, y=5]1121
//					Point [x=4, y=4]1089
//					Point [x=5, y=5]1121