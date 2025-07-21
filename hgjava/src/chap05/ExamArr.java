package chap05;

public class ExamArr {

	public static void main(String[] args) {
		// 배열 과제1
		// 배열생성 , 크기 10, 데이터 1~100사이 난수
		int[] nums = new int[10];
		for(int i=0; i<10; i++) {
			nums[i] = (int)(Math.random() * 100) + 1;
		}
		// 배열의 값 출력
		// 배열의 합, 최대값, 최소값 출력
		int sum = 0;
		int max = nums[0];
		int min = nums[0];
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + "  ");
			sum += nums[i];
			if(max < nums[i]) max = nums[i];
			if(min > nums[i]) min = nums[i];
		}
		System.out.println();
		System.out.printf("합=%d\n최대값=%d\n최소값=%d\n", sum, max, min);
		
		// 배열의 요소 중 4의 배수 출력
		// 4의 배수 갯수 출력
		
		//2차원 배열
		//배열 선언
		int [][] twoArr = {
				{80, 90},
				{70, 60, 50}
		};
		// 2차원 출력
		for(int i=0; i<twoArr.length; i++) {
			for(int j=0; j< twoArr[i].length; j++) {
				System.out.printf("| %d ", twoArr[i][j]);
			}
			System.out.println();
		}
		
		// 과제2
		
		

	}//end main

}//end class
