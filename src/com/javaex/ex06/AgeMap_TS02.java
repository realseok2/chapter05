package com.javaex.ex06;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AgeMap_TS02 {

	public static void main(String[] args) {

		Map<String, Integer> ageMap = new HashMap<String, Integer>();

		Integer a1 = new Integer(47);
		Integer a2 = new Integer(31);
		Integer a3 = new Integer(27);
		Integer a4 = new Integer(19);
		Integer a5 = new Integer(36);
		Integer a6 = new Integer(38);

		ageMap.put("정우성", a1);
		ageMap.put("김태석", a2);
		ageMap.put("아이유", a3);
		ageMap.put("감자탕", a4);
		ageMap.put("김태희", a5);
		ageMap.put("김태희", a6);

		// a4의 감자탕 삭제 & a5의 36 김태희 a6의 38 김태희로 덮어쓰기
		ageMap.remove("감자탕");
		System.out.println(ageMap.toString());

		System.out.println("--------------------------------------------------");
		
		for (String a : ageMap.keySet()) {
			System.out.println(a.toString());
		}

		System.out.println("--------------------------------------------------");
		
		Set<String> keys = ageMap.keySet();
		for (String key : keys) {
			System.out.println(key + " : " + ageMap.get(key));
		}

	}

}

//					출력 결과값
//					
//					{정우성=47, 김태희=38, 김태석=31, 아이유=27}
//					--------------------------------------------------
//					정우성
//					김태희
//					김태석
//					아이유
//					--------------------------------------------------
//					정우성 : 47
//					김태희 : 38
//					김태석 : 31
//					아이유 : 27