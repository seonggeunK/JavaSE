package day09.mythread;

import java.util.Iterator;

public class CountThread extends Thread {
@Override
public void run() { //메인메소드 비슷
	for (int i = 0; i < 10; i++) {
		System.out.println(i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	System.out.println("카운트 종료.");
}
}
