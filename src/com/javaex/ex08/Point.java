package com.javaex.ex08;

import java.util.Objects;

public class Point {

	//필드
	private int x;
	private int y;
	
	
	//생성자
	public Point() {
		super();
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	//메소드 gs
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	//메소드 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	/*
	@Override
	public boolean equals(Object obj) {
		
		boolean result;
	
		Point p = (Point)obj;
		
		if(this.x == p.x && this.y == p.y) {
			//result = true;
			return true;
		}else {
			//result = false;
			return false;
		}
		
		//return result;
	}
	
	
	@Override
	public int hashCode() {
		int code = this.x + this.y;
		return code;
	}
	*/
	
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) //진짜 주소가 같은 경우
			return true;
		if (obj == null) //비교할 상대가 없는 경우
			return false;
		if (getClass() != obj.getClass()) //다른 종족을 비교할 경우
			return false;
		Point other = (Point) obj; //진짜 비교해야 할 경우
		return x == other.x && y == other.y;
	}
	
	
	
	
	
	
}
