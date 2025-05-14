package com.javaex.ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		
		//HashMap 준비 --> 키(String), 벨류 를 2가지를 정해줘야 한다
		Map<String, Point> pMap = new HashMap<String, Point>();
		
		//포인트
		Point p01 = new Point(2,4);
		Point p02 = new Point(2,4);
		Point p03 = new Point(43,78);
		
		//Map에 포인트(주소)넣기 --> 키를 중복되지 않게 정해준다
		pMap.put("최우식", p01);
		pMap.put("황선우", p02);
		pMap.put("조승연", p03);
		
		//갯수
		System.out.println(pMap.size());
		
		System.out.println("---------------------------");
		//전체 toString()
		System.out.println(pMap.toString());
		
		System.out.println("---------------------------");
		//조승연의 toString()
		System.out.println(pMap.get("조승연").toString());
		System.out.println(pMap.get("조승연").getX());
		
		System.out.println("---------------------------");
		//조승연 삭제ㅜㅜ
		pMap.remove("조승연").getX(); //"조승연" 포인트 삭제
		System.out.println(pMap.toString());
		
		System.out.println("---------------------------");
		Point p04 = new Point(100, 150);
		pMap.put("김우민", p04); //"김우민" 포인트 주소 추가
		System.out.println(pMap.toString());
		
		System.out.println("---------------------------");
		//같은 키값을 사용했을 때 
		Point p05 = new Point(90,80);
		pMap.put("황선우", p05); //"황선우" (중복일 때)
		System.out.println(pMap.toString()); //키 값이 같으면 나중에 넣은 주소값으로 변경됨 
		// => 황선우=Point [x=2, y=4]-->황선우=Point [x=90, y=80]
		
		System.out.println("---------------------------");
		//전체 출력
		
		//1. 키 세트를 달라고 한다
		Set<String> keys = pMap.keySet();
		
		//2. 키 세트의 키 값을 1개 씩 꺼내서 해당 키 값의 정보를 출력한다
		for( String name : keys) {
			System.out.println(pMap.get(name).toString());
		}
		
		System.out.println("---------------------------");
		
		Map<String, String> boardMap = new HashMap<String, String>();
		
		boardMap.put("title", "게시판 제목 입니다.");
		boardMap.put("date", "2025-05-14");
		boardMap.put("id", "최우식");
		boardMap.put("content", "게시판 글 내용입니다.");
		
		System.out.println(boardMap.get("title"));
		System.out.println(boardMap.get("date"));
		
		
		
		
	}

}
