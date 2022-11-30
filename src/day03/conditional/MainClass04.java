package day03.conditional;

public class MainClass04 {
	public static void main(String[] args) {
		char ch = 'w';
		
		switch(ch) {
		case 'w':
			System.out.println("앞으로이동");
			break;
		case 'a':
			System.out.println("좌측으로이동");
			break;
		case 's':
			System.out.println("뒤로이동");
			break;	
		case 'd':
			System.out.println("우측으로이동");
			break;
		default:
			System.out.println("공격!!!!!!!");
		}
	}
	
	
	

}
