package day09.thread;

import day09.mythread.MyThread;

/*
 * [[ Thread ]]
 *  메인 메소드가 추가되서 같이 동작한다고 생각하면 된다.
 *  병렬 실행
 *  비동기 실행
 *  
 *  
 *  [[ 새로운 스레드를 시작 시키는 방법 ]]
 *  
 *  1.Thread 객체를 생성할수 있는 클래스를 정의한다.
 *  2.정의한 클래스를 이용해서 객채를 생성
 *  3. 생성된 객채의 start() 메소드를 호출한다.
 *  	!주의 run() 메소드 호출아님!!
 * 
 * 
 * 
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작");
		MyThread thread1 = new MyThread();
		thread1.start();
		System.out.println("메인쓰레드가 종료됩니다.");
	}
}
