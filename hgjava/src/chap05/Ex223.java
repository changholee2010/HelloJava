package chap05;

import java.util.Scanner;

public class Ex223 {

	public static void main(String[] args) {
		// p223 문제6
		// switch문 이용
			// 1.학생수 받아서 => 배열의 크기 잡아줌
			// 2.배열의 크기만큼 학생 점수 입력 받아 줌
			// 3.배열에 저장된 학생 점수 출력해 줌
			// 4.점수 중 최고점수와 평균점수 계산해서 출력해 줌
			// 5.프로그램 종료
		boolean run = true; // 반복문 제어 변수
		int studentNum = 0; // 학생 수 받아줌 => 배열의 크기 결정
		int[] scores = null; // 배열변수 초기화 null => 객체 연결 안함
		Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성 (문자열 입력용)
		
		while(run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------");
			
			//메뉴선택
			System.out.print("선택> "); // 메뉴 1~5 선택
			int selectNo = Integer.parseInt(scanner.nextLine()); //메뉴번호
			
			// 선택 메뉴에 따라 작업
			switch(selectNo) {
			case 1:
				// 학생 수 받아서 => 배열 크기 잡아줌
				System.out.print("학생수> "); // 메뉴 1~5 선택
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum]; // 배열크기 잡아줌
				break;
				
			case 2:
				// 학생 점수 배열에 입력
				for(int i=0; i<studentNum; i++) {
					System.out.printf("scores[%d]> ", i); 
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
				break;
			case 3:
				// 학생 점수 출력
				for(int i=0; i<studentNum; i++) {
					System.out.printf("scores[%d]> %d\n", i, scores[i]);  
				}
				break;
			case 4:
				// 배열의 평균과 최대값 계산
				int sum = 0; // 합 
				int max = 0; // 최대값 
				for( int score : scores) {
					sum += score;
					if(max < score) max = score;
				}
				double avg = (double) sum / scores.length;
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
				break;
			case 5:
				run = false;
				System.out.println("프로그램 종료");
				break;
			default :
				System.out.println("잘못 선택함");
			}
			
		}
		

	}//end main

}// end class
