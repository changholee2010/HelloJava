package chap06;

import java.util.Scanner;

public class StudentDao {
	//학생데이터 생성
	//필드
	Scanner sc = new Scanner(System.in);
	//생성자: 기본생성자 => 컴파일 자동 생성
	//메소드
	Student[] stData(int n){
		Student[] students = new Student[n];
		

		for(int i=0; i<n; i++) {
			System.out.printf("%d번째 학생 이름>", i+1);
			String name = sc.nextLine();
			
			System.out.printf("%d번째 학생 국어 점수>", i+1);
			int kor = Integer.parseInt(sc.nextLine());
			
			System.out.printf("%d번째 학생 영어 점수>", i+1);
			int eng = Integer.parseInt(sc.nextLine());
			
			System.out.printf("%d번째 학생 수학 점수>", i+1);
			int math = Integer.parseInt(sc.nextLine());
			
			students[i] = new Student(name, kor, eng, math);
		}
		
		return students;
	}
}
