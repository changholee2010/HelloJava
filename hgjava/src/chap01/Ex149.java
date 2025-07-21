package chap01;

import java.util.Scanner;

public class Ex149 {

	public static void main(String[] args) {
		// p149 문제1
		// 이유 주석으로 표시, 오류 수정
		
		
		//윤년 계산
		Scanner sc = new Scanner(System.in);
		System.out.print("##년도 입력 : ");
		int year = Integer.parseInt(sc.nextLine());
		if(year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)) {
//			if(year % 400 == 0 || year % 100 != 0) {
				System.out.println(year + "년 윤년");
//			}else {
//				System.out.println(year + "년 평년");
//			}
		}else {
			System.out.println(year + "년 평년");
		}

	}

}
