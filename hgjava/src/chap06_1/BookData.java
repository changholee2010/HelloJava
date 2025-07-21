package chap06_1;

import java.util.Scanner;

public class BookData {
	
	//필드
	Scanner sc = new Scanner(System.in);
	//생성자: 기본생성자 => 컴파일 자동 생성
	//메소드
	Book[] bookData(int n){
		Book[] books = new Book[n];
		

		for(int i=0; i<n; i++) {
			System.out.printf("%d번째 도서 정보 입력>", i+1);
			
			System.out.print("도서번호>");
			int bookNo = Integer.parseInt(sc.nextLine());
			
			System.out.print("도서제목>");
			String title =sc.nextLine();
			
			System.out.print("도서가격>");
			int price = Integer.parseInt(sc.nextLine());
			
			books[i] = new Book(bookNo, title, price);
		}
			
			return books;
		}
}
