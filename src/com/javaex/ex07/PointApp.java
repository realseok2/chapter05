package com.javaex.ex07;

import java.util.HashMap;
import java.util.Map;

public class PointApp {

	public static void main(String[] args) {

		Map<String, Point> pMap = new HashMap<String, Point>();

		Point p01 = new Point(2, 4);
		Point p02 = new Point(10, 15);
		Point p03 = new Point(20, 25);

		//	HashMap에서는 add가 아닌 put으로 값을 입력합니다.
		pMap.put("정우성", p01);
		pMap.put("이정재", p02);
		pMap.put("현빈", p03);

		// 정우성이라는 key값의 y좌표 값을 불러오기 위한 방법입니다.
		// 두가지 모두 같은 방법이지만 첫 번째 방식보다는 두 번째 방식을 사용(선호)하도록 합니다.
		System.out.println(pMap.get("정우성").getY());

		Point p = pMap.get("정우성");
		System.out.println(p.getY());

	}

}

//					출력 결과값
//					
//					4
//					4
