package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class HashSetLotto_TS {

	public static void main(String[] args) {

		//	<Integer>를 사용한 HashSet코드 입니다.
		Set<Integer> lottoSet = new HashSet<Integer>();

		System.out.println("Lotto번호를 생성하는 프로그램입니다.");
		System.out.println("마지막에 생성되는 번호는 보너스 번호 입니다.\n");

//------------------------------------------------------------------
//		//	랜덤으로 로또 번호를 생성하는 코드
//		(int)(Math.random()*45)+1;

		//	lottoSet.size, 즉 생성되는 로또 번호의 숫자가 7개가 되면 생성작업을 중단합니다.
		while (true) {
			if (lottoSet.size() == 7) {
				break;
			}
		//	1부터 45까지의 숫자 중 랜덤으로 숫자를 생성합니다.
			int num = (int) (Math.random() * 45) + 1;
			lottoSet.add(num);
		}
		
		//	생성된 7개의 번호를 향상된 for문을 통해 출력합니다.
		for (Integer i : lottoSet) {
			System.out.println("생성된 번호는 [ " + i + " ] 입니다.");

		}

//------------------------------------------------------------------

	}

}

//					출력 결과값
//					
//					Lotto번호를 생성하는 프로그램입니다.
//					마지막에 생성되는 번호는 보너스 번호 입니다.
//					
//					생성된 번호는 [ 19 ] 입니다.
//					생성된 번호는 [ 6 ] 입니다.
//					생성된 번호는 [ 22 ] 입니다.
//					생성된 번호는 [ 39 ] 입니다.
//					생성된 번호는 [ 8 ] 입니다.
//					생성된 번호는 [ 42 ] 입니다.
//					생성된 번호는 [ 30 ] 입니다.