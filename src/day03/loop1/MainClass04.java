package day03.loop1;
/*
 * for 반복문 연습
 * 주말숙제 2중for문 코드 분석하기
 * 
 * 
2번
			*
		   **
          ***
         ****
        *****
       ******
      *******
 3번
     *
    ***
   *****
  *******
 4번
        *
       ***
      *****
     *******
      *****
       ***
        *
 
 
 */

public class MainClass04 {
public static void main(String[] args) {
//	for(int i= 0; i < 7; i++) {
//		for(int j=0; j <= i; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
	for(int i= 0; i <7; i++) {		// 줄
		for(int j=0; j <= i; j++) { // 열  j < i+1;
			System.out.print("*");
		}
		System.out.println();
	}
	
	
	
	
	
}
}
