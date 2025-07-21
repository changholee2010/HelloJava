package chap04;

public class Gugudan {

	public static void main(String[] args) {
		// 구구단
		//단 반복
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("** " + dan + "단 **");
			for(int gob = 1; gob <=9; gob++) {
				System.out.printf("%d x %d = %d\n", dan, gob, dan * gob);
			}
			System.out.println();
		}
		
		// 구구단2
		
		// 별찍기
		for(int i=1; i<=4; i++) { //줄수
			for(int j=1; j<=i; j++) { //별수
				System.out.print("*");
			}
			System.out.println();
		}
		
	}//end main

}//end class
