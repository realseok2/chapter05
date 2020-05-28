package com.javaex.ex03;

import java.util.HashSet;
import java.util.Set;

public class SetApp_TS {

	public static void main(String[] args) {

		Set<Integer> iSet = new HashSet<Integer>();

		Integer i01 = new Integer(5);
		Integer i02 = new Integer(10);
		Integer i03 = new Integer(15);
		Integer i04 = new Integer(20);
		Integer i05 = new Integer(25);
		Integer i06 = new Integer(30);
		Integer i07 = new Integer(35);
		Integer i08 = new Integer(15);
		Integer i09 = new Integer(25);
		Integer i10 = new Integer(35);

		// HashSet에서는 add를 사용하여 값을 입력합니다.
		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);
		iSet.add(i04);
		iSet.add(i05);
		iSet.add(i06);
		iSet.add(i07);
		iSet.add(i08);
		iSet.add(i09);
		iSet.add(i10);

		// 향상된 for문을 사용하여 전체를 출력합니다.
		// for ( [형식] [사용자지정이름] : [전체틀(관리하는 담겨있는 그릇)]) { }
		// i08과 i09, i10의 15, 25, 35는 중복체크되어 적용되지 않습니다.
		for (Integer i : iSet) {
			System.out.println(i.toString());
		}

		System.out.println("--------------------------------------------");

		// i04를 삭제합니다. 그 후 다시 한번 전체 출력을 하여 제대로 삭제되었는지 확인합니다.
		iSet.remove(i04);

		for (Integer j : iSet) {
			System.out.println(j.toString());
		}

	}

}

//					출력 결과값
//					
//					35
//					20
//					5
//					25
//					10
//					30
//					15
//					--------------------------------------------
//					35
//					5
//					25
//					10
//					30
//					15
