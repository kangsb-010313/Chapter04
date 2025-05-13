package com.javaex.ex01;

import java.util.Arrays;

public class MyListApp {

	public static void main(String[] args) {
		
		/*
		//배열
		//미리 갯수를 결정해야한다(낭비, 수정)
		//갯수가 고정(변동폭이 작을 때) 유리하다
		Point[] pArray = new Point[3];
		
		//포인트
		Point p01 = new Point(2,2);
		Point p02 = new Point(3,3);
		Point p03 = new Point(4,4);
		
		//배열에 포인트 주소 담기
		pArray[0] = p01;
		pArray[1] = p02;
		pArray[2] = p03;
		
		for(int i=0; i<pArray.length; i++) {
			System.out.println(pArray[i]); //toString 생략	
		}
		
		//System.out.println(pArray.toString());
		//System.out.println(Arrays.toString(pArray));
		*/
		
		//리스트(포인트 관리)
		PointList pList = new PointList();
		
		//포인트
		Point p01 = new Point(2,2);
		Point p02 = new Point(3,3);
		Point p03 = new Point(4,4);
		
		//리스트에 포인트 주소 추가
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("-------------------------------------");
		
		//리스트(원)
		CircleList cList = new CircleList();
		
		//원
		Circle c01 = new Circle(3);
		Circle c02 = new Circle(4);
		Circle c03 = new Circle(5);
		
		//리스트에 원 주소 추가
		cList.add(c01);
		cList.add(c02);
		cList.add(c03);
		
		for(int i=0; i<cList.size(); i++) {
			System.out.println(cList.get(i).toString());
		}
		
		
		
	}

}
