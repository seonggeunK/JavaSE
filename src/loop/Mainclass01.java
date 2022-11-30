package loop;
/*
 * 1. while 문
 * while(조건문) {
 * 	반복 수행할 코드
 * }
 * 
 * 
 * 
 * 
 */
public class Mainclass01 {
	public static void main(String[] args) {
		// while 문을 이용해서 0 ~ 99 까지 출력
		int count = 0; // 카운트를 세기위한 변수
		while(true) {
			System.out.println(count);
			count ++;
			if(count == 100) break;
		}
	}

}
