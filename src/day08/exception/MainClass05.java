package day08.exception;
/*
 * throws - 예외가 발생하면 상위메소드로 예외를 던진다.
 * 
 * 
 * 
 * 
 * 
 */
import day08.mypac.NumberPrinter;

public class MainClass05 {
	public static void main(String[] args) {
		NumberPrinter np = new NumberPrinter();
				
		try {
			np.printNumber();
		} catch (InterruptedException e) {
			System.out.println("익셉션 발생!");
		}
	}
}
