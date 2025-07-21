package chap06;

import java.util.Scanner;

public class SungjukMain {

	public static void main(String[] args) {
		//객체 생성 => 배열 데이터 받아 옴
		Scanner sc = new Scanner(System.in);
		StudentDao stdao = new StudentDao();
		boolean run = true;
		int studentNum = 0;
		Student[] students = null;
		
		
		
		while(run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------");
			
			//메뉴선택
			System.out.print("선택> "); // 메뉴 1~5 선택
			int selectNo = Integer.parseInt(sc.nextLine()); //메뉴번호
			
			// 선택 메뉴에 따라 작업
			switch(selectNo) {
			case 1:
				// 학생 수 받음 
				System.out.print("학생수> "); // 메뉴 1~5 선택
				studentNum = Integer.parseInt(sc.nextLine());
				break;
				
			case 2:
//				StudentDao stdao = new StudentDao();
				students = stdao.stData(studentNum);
				break;
			case 3:
				// 학생 점수 출력
				for(int i=0; i<students.length; i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\t%s\n",
							students[i].name,
							students[i].kor, 
							students[i].eng, 
							students[i].math, 
							students[i].tot(), 
							students[i].avg(), 
							students[i].grade());
				}
				break;
			case 4:
				// 배열의 평균과 최대값 계산
				double sum = 0; // 합 
				double max = 0; // 최대값 
				for( int i=0;i<students.length; i++) {
					sum += students[i].avg();
					if(max < students[i].avg()) max = students[i].avg();
				}
				double avg = sum / studentNum;
				System.out.println("평균 최고 점수 : " + max);
				System.out.println("전체 평균 점수 : " + avg);
				break;
			case 5:
				run = false;
				System.out.println("프로그램 종료");
				break;
			default :
				System.out.println("잘못 선택함");
			}
			
		}
		
		//객체 사용
		
		
		sc.close();
		
	}//end main
}//end class
