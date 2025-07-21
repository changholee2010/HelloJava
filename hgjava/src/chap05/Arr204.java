package chap05;

public class Arr204 {

	public static void main(String[] args) {
		// 배열 생성 , 배열데이터 활용
		//p204 예제
		int sum2 = add(new int[] {83, 90, 87});
		System.out.println("배열의 합 = " + sum2);
		
		//int 형의 배열  선언 , 크기 : 5
		// 배열에 50~100사이의 수 5개 입력
		// 배열의 합 계산
		int[] rans = new int[5];
		// 배열의 값
		for(int i=0; i<rans.length; i++) {
			rans[i] = (int)(Math.random() * 51) + 50;
		}
		// 배열의 합
		int result  = add(rans);
		System.out.println("배열합 = " + result);
		System.out.println("배열합 = " + add(rans));
		
		
	
	}//end main

	public static int add(int[] is) {
		// 배열의 합
		int sum = 0;
		for(int i=0; i<is.length; i++) {
			sum += is[i];
		}
		return sum;
	}// end add

}//end class
