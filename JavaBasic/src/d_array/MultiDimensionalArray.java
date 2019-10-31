package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
	/*
	 * << 다차원 배열 >>
	 * - 배열안에 배열이 저장되어 있는 형태이다.
	 */
	int[][] numbers = new int[2][3];
	//2칸짜리 배열안에 각 칸마다 3칸짜리 배열이 생성된다.
	int numbers2[][] = new int[][]{{1, 2, 3},{4, 5, 6}};
	//값의 개수로 배열의 길이가 정해진다.
	int[]number3[] = {{1, 2, 3}
					 ,{4, 5, 6}
					 ,{7, 8, 9} }; //선언과 초기화를 동시에 해야한다
	
	int[][] number4 = new int[3][]; //가변 배열
	number4[0] = new int[3];
	number4[1] = new int[4];
	number4[2] = new int[10];  //길이를 다르게 지정할 수 있다.
	
//	numbers[0] = 10;  //1차원에 값을 저장할 수 없다.
	numbers[0] = new int[5]; //1차원에 배열을 저장할 수 있다.
	numbers[0][0] = 10; //2차원에 값을 저장할 수 있다.
	numbers[0][1] = 20;
	numbers[0][2] = 100;
	numbers[0][3] = 100;
	numbers[0][4] = 100;

	numbers[1][0] = 10;
	numbers[1][1] = 20;
	numbers[1][2] = 100;
	
	System.out.println(numbers.length);  //1차원 배열의 길이
	System.out.println(numbers[0].length); //2차원 배열의 길이
	
	for(int i = 0; i < numbers.length; i++){
		for(int j = 0; j < numbers[i].length; j++){
			System.out.println(numbers[i][j]);
		}
	}
	
	System.out.println(Arrays.toString(numbers)); //주소가 출력된다.
	
	for(int i = 0; i < numbers.length; i++){
		System.out.println(Arrays.toString(numbers[i]));
		//2차원까지 접근해야 값이 출력된다.
	}
	
	for(int[] numberArr : numbers){ //numberArr은 변수명 
		for(int number : numberArr){
			System.out.println(number);
		}
	}
	
	int[][] scores = new int[3][5]; //int[학생수][과목수]
	int[] sum = new int[scores.length]; //합계
	double[] avg = new double[scores.length]; //평균
	
	for(int i = 0; i < scores.length; i++){
		for(int j = 0; j < scores[i].length; j++){
			scores[i][j] = (int)(Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(scores[i]));
	}
	
	//합계와 평균을 구해주세요.
	
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores[i].length; j++){
				sum[i] += scores[i][j];
			}
				avg[i] = (double)sum[i] /scores[i].length;
				
			System.out.println("합계" +sum[i]+ "/평균 : " +avg[i]);
		}
	
	}
	}	

