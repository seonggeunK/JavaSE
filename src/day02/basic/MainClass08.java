package day02.basic;


/*
 * [[문자 리터럴 ]]
 * 
 * 고정된 값
 * 
 * 숫자 예) 10, 10.1
 * 문자 예) 'H','글'
 * 
 * [[ 특수문자 리터럴 ]]
 * 
 * 1. \n : 줄바꿈(개행)
 * 2. \t : 탭가능
 * 3. \\ : \를 문자화
 * 4. \' : '를 문자화
 * 5. \" : "를 문자화
 * 
 * 
 */
public class MainClass08 {
 public static void main(String[] args) {
	String str1 = "JavaStudy";
	System.out.println(str1);
	
	String str2 ="안녕하세요. \n \'강성근\' 입니다.\n \t 반갑습니다.";
	System.out.println(str2);
}
}
