package com.javaex.ex06;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AgeMap {

	public static void main(String[] args) {

		// <String, Integer>를 사용한 HashMap 코드입니다.
		Map<String, Integer> ageMap = new HashMap<String, Integer>();

		Integer i01 = new Integer(39);
		Integer i02 = new Integer(87);
		Integer i03 = new Integer(21);

		// HashMap에서는 add가 아닌 put으로 입력을 합니다.
		ageMap.put("정우성", i01);
		ageMap.put("김태희", i02);
		ageMap.put("김유정", i03);
		System.out.println(ageMap.toString());

		// Remove는 목록에서 삭제 할 때 사용합니다.
		ageMap.remove("김태희");
		System.out.println(ageMap.toString());

		// Hash에서는 중복이 불가능하므로 정우성이 새로 생성이 되는 것이 아니고 덮어쓰기가 됩니다.
		// 같은 방식으로 HashSet에서도 중복이 불가능합니다.
		ageMap.put("정우성", 32912);
		System.out.println(ageMap.toString());

		// 변수의 갯수가 2개뿐이여서 박명수라는 변수를 추가했습니다.
		ageMap.put("박명수", 72);
		System.out.println(ageMap.toString());

		// println을 통해 박명수에 부여된 나이 변수를 출력할 수 있습니다.
		Integer age = ageMap.get("박명수");
		System.out.println(age);

		// ageMap.size();를 통해 현재 변수들의 갯수를 파악할 수 있습니다.
		// count를 println으로 출력했습니다. 현재 남아 있는 변수는 [정우성, 박명수, 김유정] 3명으로 숫자 3이 출력됩니다.
		int count = ageMap.size();
		System.out.println(count);

		// key들을 한 묶음으로 묶어 관리 할 수 있습니다.
		// ageMap.keySet()을 통해 현재 생성되어 있는 key들의 전체 목록을 확인 할 수 있습니다.
		System.out.println(ageMap.keySet());
		System.out.println("-----------------------------");
		Set<String> keys = ageMap.keySet();

		// 향상된 for문을 사용하여 전체를 출력합니다.
		// for ( [형식] [사용자지정이름] : [전체틀(관리하는 담겨있는 그릇)]) { }
		for (String key : keys) {
			System.out.println(key + " : " + ageMap.get(key));
		}

	}

}

//					출력 결과값
//					
//					{정우성=39, 김유정=21, 김태희=87}
//					{정우성=39, 김유정=21}
//					{정우성=32912, 김유정=21}
//					{정우성=32912, 박명수=72, 김유정=21}
//					72
//					3
//					[정우성, 박명수, 김유정]
//					-----------------------------
//					정우성 : 32912
//					박명수 : 72
//					김유정 : 21
