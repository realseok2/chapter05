package com.javaex.ex03;

import java.util.HashSet;
import java.util.Set;

public class SetApp {

	public static void main(String[] args) {

		Set<Integer> iSet = new HashSet<Integer>();

		Integer i01 = new Integer(1);
		Integer i02 = new Integer(2);
		Integer i03 = new Integer(3);
		Integer i04 = new Integer(4);
		Integer i05 = new Integer(5);
		Integer i06 = new Integer(2);
		Integer i07 = new Integer(4);

		// HashSet에서는 add로 값을 입력을 합니다.
		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);
		iSet.add(i04);
		iSet.add(i05);
		iSet.add(i06);
		iSet.add(i07);

		// 향상된 for문을 사용하여 전체를 출력합니다.
		// for ( [형식] [사용자지정이름] : [전체틀(관리하는 담겨있는 그릇)]) { }
		// i06과 i07의 2, 4는 중복체크되어 적용되지 않습니다.
		for (Integer i : iSet) {
			System.out.println(i.toString());
		}

		// i01을 삭제합니다. 그 후 다시 한번 전체출력을 함으로써 제대로 삭제되었는지 확인합니다.
		System.out.println("------------------------------------");
		iSet.remove(i01);

		for (Integer i : iSet) {
			System.out.println(i.toString());
		}

	}

}
