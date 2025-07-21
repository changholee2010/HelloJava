package chap06_1;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		//객체 생성 => 배열 데이터 받아 옴
		Scanner sc = new Scanner(System.in);
		BookData bookdao = new BookData();
		boolean run = true;
		int bookNum = 0;
		Book[] books = null;
		
		
		
		while(run) {
			System.out.println("-------------------------------------------------------------------");
			System.out.println("1.도서수 입력| 2.도서정보 등록 | 3.도서정보 전체조회 | 4.도서정보 분석 | 5.종료");
			System.out.println("-------------------------------------------------------------------");
			
			//메뉴선택
			System.out.print("선택> "); // 메뉴 1~5 선택
			int selectNo = Integer.parseInt(sc.nextLine()); //메뉴번호
			
			// 선택 메뉴에 따라 작업
			switch(selectNo) {
			case 1:
				// 학생 수 받음 
				System.out.print("학생수> "); // 메뉴 1~5 선택
				bookNum = Integer.parseInt(sc.nextLine());
				break;
				
			case 2:
				books = bookdao.bookData(bookNum);
				break;
			case 3:
				// 학생 점수 출력
				for(int i=0; i<books.length; i++) {
					System.out.printf("도서번호 : %d 가격 : %d원",books[i].getBookNo(),books[i].getPrice());
				}
				break;
			case 4:
				// 배열의 평균과 최대값 계산
				int sum = 0; // 합 
				int max = 0; // 최대값 
				int min = 0; // 최소값 
				for( int i=0;i<books.length; i++) {
					sum += books[i].getPrice();
					if(max < books[i].getPrice()) max = books[i].getPrice();
					if(min > books[i].getPrice()) min = books[i].getPrice();
				}
				
				System.out.println("최고 가격 : " + max + "원");
				System.out.println("최소 가격 : " + min + "원");
				System.out.println("평균 가격은 : " + ((double)sum / bookNum));
				break;
			case 5:
				run = false;
				System.out.println("프로그램 종료");

			}
			
		}
		
		
		sc.close();

	}// end main

}// end class
