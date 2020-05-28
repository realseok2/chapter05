package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class HashSetLotto {

	public static void main(String[] args) {

		//	<Integer>를 사용한 HashSet코드 입니다.
		
		//	Set을 하기 위해 Set으로 시작하였습니다.
		//	Map을 하기 위해서는 Map으로 시작하여야 합니다.
		Set<Integer> lottoSet = new HashSet<Integer>();

		System.out.println("Lotto 번호를 생성하는 프로그램입니다.");
		System.out.println("마지막에 생성되는 번호는 보너스 번호입니다.\n");

//--------------------------------------------------------------------------

		// while문을 사용하여 7개가 출력되면 중지하도록 설정합니다.
		while (true) {
			if (lottoSet.size() >= 7) {
				break;
			}
		// 1부터 45 사이의 범위에서 랜덤으로 숫자를 선정합니다.
			int no = (int) (Math.random() * 45) + 1;
			lottoSet.add(no);
		}

		// 향상된 for문을 사용하여 전체를 출력합니다.
		// for ( [형식] [사용자지정이름] : [전체틀(관리하는 담겨있는 그릇)]) { }
		for (Integer i : lottoSet) {
			System.out.println("생성된 숫자는 [ " + i + " ] 입니다.");
		}

//--------------------------------------------------------------------------	

	}

}

//					출력 결과값
//					
//					Lotto 번호를 생성하는 프로그램입니다.
//					마지막에 생성되는 번호는 보너스 번호입니다.
//					
//					생성된 숫자는 [ 16 ] 입니다.
//					생성된 숫자는 [ 20 ] 입니다.
//					생성된 숫자는 [ 8 ] 입니다.
//					생성된 숫자는 [ 9 ] 입니다.
//					생성된 숫자는 [ 27 ] 입니다.
//					생성된 숫자는 [ 11 ] 입니다.
//					생성된 숫자는 [ 45 ] 입니다.
