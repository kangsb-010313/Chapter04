package com.javaex.ex05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyListApp {

	public static void main(String[] args) {
		//*포인트 포인트별로 관리, 원은 원별로 관리
		
		//ArrayList<Point>() --> LinkedList<Point>()
		//ArrayList에만 있는 plus()사용하면 안된다
		//LinkedList 에는 plus()가 없다
		
		///////////포인트관리//////////////////
		//포인트리스트
		// ArrayList<Point> pList = new ArrayList<Point>(); //ArrayList만가지고 있는 메소드 사용
		//List<Point> pList = new ArrayList<Point>(); //List(인터페이스) 에 정의된 메소드만 사용
		List<Point> pList = new LinkedList<Point>();
		//--> 부모를 인터페이스로 둔 경우 호환성을 염두했을 가능성이 높음
		//--> 섞어쓰기를 해서 인터페이스에 있는 메소드만으로 구현
		
		
		//포인트
		Point p01 = new Point(2,2);
		Point p02 = new Point(3,3);
		Point p03 = new Point(4,4);
		
		//포인트리스트에 포인트 주소를 넣는다
		//메모리를 낭비없이 관리한다
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		//pList.plus(p01, p02, p03); 	ArrayList에만 있는 기능
		
		//System.out.println(pList.toString());
		
		System.out.println(pList.get(0));
		System.out.println(pList.get(0).getX());
		System.out.println(pList.size());
		pList.remove(0);
		
		System.out.println(pList);
		
		
		
	}

}
