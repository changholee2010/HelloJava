package chap04;

public class Exam162 {

	public static void main(String[] args) {
		// 주사위 게임
		// 주사위를 2개 던져서 
		int dice1 = (int)(Math.random() * 6) + 1;
		int dice2 = (int)(Math.random() * 6) + 1 ;
		// 합이 10을 넘으면 두수를 더하고 > 덧셈결과 : 000
		// 아니면 두수를 곱한 결과를 출력 > 곱셈결과 : 000
		int result = dice1 + dice2;
		if(result > 10) {
			System.out.printf("%d + %d = %d\n" , dice1, dice2, result);
		}else {
			System.out.printf("%d * %d = %d\n" ,dice1, dice2, dice1 * dice2);
		}
		
		
		// 오전시간(9~12) 일정 출력
		// 현재 시간 확인
		int time = (int) (Math.random() * 4 ) + 9;
		System.out.println("현재 시간 : " + time);
		// 9시 : 출근합니다
		// 10시 : 회의합니다
		// 11시 : 업무를 봅니다
		// 12시 : 외근을 나갑니다
		
		switch(time) {
		case 9 :
			System.out.println("출근합니다");
		case 10 :
			System.out.println("회의합니다");
		case 11 :
			System.out.println("업무를 봅니다");
		case 12 :
			System.out.println("외근을 나갑니다");
		}
		System.out.println("오늘 일정 끝");
		
		//p169 문제3 => switch문으로 변경
		int score = 85;
		switch(score / 10) {
		case 10 :
		case 9 : 
			System.out.println("A");
			break;
		case 8 :
			System.out.println("B");
			break;
		case 7 :
			System.out.println("C");
			break;
		default :
			System.out.println("D");
		}
		
		// 주사위 게임
		// 주사위 2개 던져서 합이 10이 되면 탈출
		  // 주사위 순서쌍 출력 (5,2)
		// 5회이상이 되면 게임오버 출력
		
		// 주사위 2개를 5회 던진다(for)
		for(int i=1 ; i<=5 ; i++) {
			//주사위 2개 눈 발생
			dice1 = (int) (Math.random() * 6) + 1;
			dice2 = (int) (Math.random() * 6) + 1;
			//순서쌍 출(2,10)
			System.out.printf(" (%d , %d )\n", dice1, dice2);
			// 두개의 합이 10이면 탈출 => 게임오버
			if(dice1 + dice2 > 10) {
				System.out.println("탈출성공!!!!");
				break;
			}
		}
		System.out.println("게임오버");
		// 5회이상이면 게임 오버
		
		
		// 반복문
		int i;
		for(i=1; i<=5; i++) {
			System.out.println(" i = " + i);
		}
		System.out.println("탈출 1 ~ " + (i-1) + "까지");
		
		

	}//end main

}//end class
