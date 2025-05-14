package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {

		Set<Integer> lotto = new HashSet<Integer>();
		
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
		
		System.out.println(lotto.size());
		System.out.println("---------------------");
		for(Integer i : lotto) {
			System.out.print(i.toString() + "\t");
		}
		
		
		
		
		
	}

}
