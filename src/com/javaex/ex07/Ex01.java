package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		
		//HashSet<Integer> iSet = new HashSet<Integer>();
		Set<Integer> iSet = new HashSet<Integer>();
		
		// Integer i01 = new Integer(3);
		Integer i01 = 3;
		
		iSet.add(i01); //3 		//주소를 넣는다
		iSet.add(6); //자동 박싱
		iSet.add(9); //자동 박싱
		
		iSet.add(9); //숫자를 중복되게 넣을 수 없다 -->같은 수를 넣을 시 튕겨 버려짐
		
		System.out.println("------------------------------");
		System.out.println(iSet.size()); // 방이 3개
		
		System.out.println("------------------------------");
		//방번호(순서) 개념이 없다 -> 일반적 for문을 사용할 수 없다
		for(Integer i : iSet) { // for(하나짜리 : 전체) {} 		// 향상된 for문
			System.out.println(i.toString());
		}
		
		
		
		
		
		
		
	}

}
