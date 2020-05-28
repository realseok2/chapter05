package com.javaex.ex06;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AgeMap_TS {

	public static void main(String[] args) {

		// <String, Integer>를 사용한 HashMap 코드입니다.
		Map<String, Integer> ageMap = new HashMap<String, Integer>();

		Integer a01 = new Integer(10);
		Integer a02 = new Integer(20);
		Integer a03 = new Integer(30);
		Integer a04 = new Integer(40);
		Integer a05 = new Integer(50);

		// HashMap에서는 add가 아닌 put을 사용합니다.
		ageMap.put("김유정", a01);
		ageMap.put("지윤미", a02);
		ageMap.put("변정하", a03);
		ageMap.put("김태희", a04);
		ageMap.put("김수미", a05);
		System.out.println(ageMap.toString());
		System.out.println("--------------------------------------------------------------");

		// Remove로 선택된 값을 목록에서 삭제 할 수 있습니다.
		// Remove를 사용할 시 입력 key값은 미리 지정해둔 값으로 입력해야 합니다.
		// ex) ageMap.remove("지윤미") --> O
		// ex) ageMap.remove(a02) --> X
		ageMap.remove("지윤미");
		System.out.println(ageMap.toString());
		System.out.println("--------------------------------------------------------------");

		// HashMap은 중복이 불가능합니다.
		// 따라서 김수미 값이 새로 생성되는 것이 아니고 기존의 값에 덮어쓰기가 됩니다.
		// 같은 방식으로 HashSet 역시 중복이 되지 않습니다.
		// 하지만 HashSet은 덮어쓰기가 아닌 중복으로 입력된 새로운 값만 삭제됩니다.
		ageMap.put("김수미", 86);
		System.out.println(ageMap.toString());
		System.out.println("--------------------------------------------------------------");

		// Integer (사용자지정이름) = ageMap.get(key);
		// 사용자가 age라는 이름을 새로 지정하여 "변정하" 값에 담긴 Integer 값을 출력 할 수 있습니다.
		// 따라서 변정하로 지정되어 a03에 담긴 30이 출력됩니다.
		Integer age = ageMap.get("변정하");
		System.out.println(age);
		System.out.println("--------------------------------------------------------------");

		// 코드 작성을 편리하고 간결하게 하기 위해 int count를 새로 생성하여 ageMap.size()를 담았습니다.
		// ageMap.size()를 사용하여 현재 생성되어 있는 변수들의 크기(갯수)를 출력합니다.
		// 현재 [지윤미]는 위에서 삭제되었고 [김유정, 변정하, 김태희, 김수미] 4개가 생성되어 있으므로 4가 출력됩니다.
		int count = ageMap.size();
		System.out.println(count);
		System.out.println("--------------------------------------------------------------");

		// ageMap.keySet()을 출력함으로써 현재 생성되어 있는 모든 key의 이름을 보여줍니다.
		System.out.println(ageMap.keySet());

		// 향상된 for문을 사용하여 전체를 출력합니다.
		// for ( [형식] [사용자지정이름] : [전체틀(관리하는 담겨있는 그릇)]) { }
		// 사용자지정이름 : 사용자지정이름이 가지고 있는 age값
		Set<String> keys = ageMap.keySet();
		for (String key : keys) {
			System.out.println(key + " : " + ageMap.get(key));
		}
		System.out.println("--------------------------------------------------------------");

	}

}

//					출력 결과값
//					
//					{김유정=10, 김수미=50, 김태희=40, 지윤미=20, 변정하=30}
//					--------------------------------------------------------------
//					{김유정=10, 김수미=50, 김태희=40, 변정하=30}
//					--------------------------------------------------------------
//					{김유정=10, 김수미=86, 김태희=40, 변정하=30}
//					--------------------------------------------------------------
//					30
//					--------------------------------------------------------------
//					4
//					--------------------------------------------------------------
//					[김유정, 김수미, 김태희, 변정하]
//					김유정 : 10
//					김수미 : 86
//					김태희 : 40
//					변정하 : 30
//					--------------------------------------------------------------
