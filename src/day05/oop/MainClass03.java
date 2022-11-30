package day05.oop;

import day05.mypac.MathUtil;

public class MainClass03 {
	public static void main(String[] args) {
		// 반지름
		int r = 5;
		
		MathUtil mu = new MathUtil();
		double area = mu.getArea(r);
		
		System.out.println("원의 넓이는 : " + area);
		
		int result = mu.sum(6, 4);
		System.out.println("6+4=" + result);
		
		System.out.println("5 + 9 + 1= " + mu.sum(5, 9, 1));
	}
}
