package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class PointApp_TS03 {

	public static void main(String[] args) {

		Set<Point> pSet = new HashSet<Point>();
		
		Point p1 = new Point(1,1);
		Point p2 = new Point(2,2);
		Point p3 = new Point(3,3);
		Point p4 = new Point(4,4);
		Point p5 = new Point(1,1);
		
		pSet.add(p1);
		pSet.add(p2);
		pSet.add(p3);
		pSet.add(p4);
		pSet.add(p5);
		
		pSet.remove(p3);
		System.out.println(pSet.toString());
		
		for(Point p : pSet) {
			System.out.println(p.toString());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
