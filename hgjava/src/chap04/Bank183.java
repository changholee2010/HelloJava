package chap04;

import java.util.Scanner;

public class Bank183 {

	public static void main(String[] args) {
		// 은행업무
		// 잔고 변수 생성
		// 실행제어 변수
		// 업무 1 : 예금, 2:출금, 3:조회, 4:종료
		// 종료가 될 때까지 반복
		
		int balance = 0;
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		int money;
		
		while(run) {
			System.out.println("----------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.조회 | 4.종료");
			System.out.println("----------------------------------------");
			
			System.out.print("선택 >");
			int selNum = Integer.parseInt(sc.nextLine());
			
			switch(selNum) {
			case 1 :
				System.out.print("예금액 >");
				money = Integer.parseInt(sc.nextLine());
				balance += money;
				break;
			case 2 :
				// 출금액이 부족할 경우 잔액 부족 출력
				// 출금 가능 금액 출력
				// 가능하면 출금 처리
				
			case 3 :
				
			default :
				run = false;
			}
		}
		System.out.println("프로그램 종료");

	}//end main

}//end class
