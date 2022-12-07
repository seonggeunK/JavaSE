package day08.exception;

import day08.mypac.NumberPrinter;

public class MainClass06 {
	public static void main(String[] args) throws InterruptedException {
		NumberPrinter np = new NumberPrinter();
		np.printNumber();
		
		// 강제로 익셉션 발생시키키
		throw new NullPointerException();
	}
}
