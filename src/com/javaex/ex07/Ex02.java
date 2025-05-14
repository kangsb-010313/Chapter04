package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {

		//번호 계속 생성
		//번호가 6개면 끝 --> Set의 갯수가 6개면 끝
		
		//로또 번호 프로그램 작성
		//Set
		
		Set<Integer> iSet = new HashSet<Integer>();
		
		while (true) {
			if(iSet.size() == 6) { //iSet 에 숫자가 6개면 끝
				break;
			}
			
			int no = (int)(Math.random()*45)+1;
			iSet.add(no);	//중복이면 안 들어간다
			System.out.println(no);
		}
		
		System.out.println("----------------------------------");
		
		//출력
		for(int no : iSet) {
			System.out.print(no + "\t");
		}
		
		/*
		int l01 = (int)(Math.random()*45)+1;
		int l02 = (int)(Math.random()*45)+1;
		int l03 = (int)(Math.random()*45)+1;
		int l04 = (int)(Math.random()*45)+1;
		int l05 = (int)(Math.random()*45)+1;
		int l06 = (int)(Math.random()*45)+1;
		
		lotto.add(l01);
		lotto.add(l02);
		lotto.add(l03);
		lotto.add(l04);
		lotto.add(l05);
		lotto.add(l06);
		
		
		while(lotto.size() < 6) {
			int lNum = (int)(Math.random()*45)+1;
			lotto.add(lNum);
		}
		
		System.out.println(lotto.size());
		System.out.println("---------------------");
		for(Integer i : lotto) {
			System.out.print(i.toString() + "\t");
		}
		*/
		
		
		
		
	}

}
