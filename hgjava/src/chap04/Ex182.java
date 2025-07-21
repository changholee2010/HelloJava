package chap04;

public class Ex182 {

	public static void main(String[] args) {
		// p182 문제2
		//1에서 100까지 정수 중 3의 배수 합, 3의 배수의 갯수
		int sum = 0;
		int cnt = 0;
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0) {
				sum += i;
				cnt++;
			}
		}
		System.out.println("합=" + sum);
		System.out.println("갯수=" + cnt);
		
		//문제3
		// 추가 : 몇 번만에 탈출했는지 출력
		// 횟수 체크 변수 선언
		// 반복문 
			// 주사위 2개 생성
			// 순서쌍 출력
			// 횟수 체크
			// 합이 5가 되었는 지 체크 
			// 5면 탈출, 아니면 반복
		// 반복 횟수 출력
		
		//문제4
		// 조건 : 0 < x <= 10, 0 <y <= 10
		// 4 * x + 5 * y = 60 이 되는 (x,y)
		
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				int result = 4 * x + 5 * y;
				if(result == 60) {
					System.out.printf("(%d,%d)\n", x, y);
				}
			}
		}
		
		//문제6번
		for(int i=1; i<=4; i++) {
			for(int j=4; j>=1; j--) {
				if(i < j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		
	}//end main

}//end class
