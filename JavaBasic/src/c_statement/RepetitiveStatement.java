package c_statement;

import java.util.Scanner;

public class RepetitiveStatement {

	public static void main(String[] args) {
		/*
		 * << for문 >>
		 * - for(int i = i; i <= 10, i++){}
		 * - for(1 부터 10 까지 1씩 증가하면서 반복){}
		 * 
		 */
		
		for(int i = 1; i <= 10; i++){
			//for(초기화; 조건식;증감식){}
			//초기화 : 조건식과 증감식에 사용할 변수 초기화
			//조건식 : 연산결과가 true이면 블럭안의 내용을 수행한다.
			//증감식 : 변수를 증가/감소시켜 반복문을 제어한다.
			System.out.println(i + "번째 반복");
			//초기화한 변수를 블럭안에서 사용할 수 있다.
		}
		int sum = 0; //1부터 10까지 합계를 저장
		
		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		sum += 6;
		sum += 7;
		sum += 8;
		sum += 9;
		sum += 10;
		System.out.println(sum);
		
		sum = 0;
		//반복문 사용하면 규칙이 있는 반복되는 작업을 짧게 표현할 수 있다.
		for(int i = 1; i <= 100; i++){  //부등호 주의하기
			sum += i;
		}
		System.out.println(sum);
		
		sum = 0;
		for(int i = 100; i >= 1; i--){//100부터 1까지 1씩 감소하면서 반복한다.}
			sum += i; //sum에 i를 더한다
		}
		System.out.println(sum);
		
		
		//1부터 100까지 짝수의 합을 구해보자
		sum = 0;
		for(int i = 0; i <= 100; i+= 2){
			sum += i;
		}
		System.out.println(sum);
		
		sum =0;
		for(int i = 1; i <= 100; i++){
			if(i % 2 == 0){  //i가 2의 배수일때 조건식을 넣음
				sum += i;
			}
		}
		System.out.println(sum);
		
		//1부터 100까지 홀수의 합을 구하시오
		sum = 0;
		for(int i = 1; i <= 100; i++){   // for(int = ; i <= 100; i += 2) i가 2씩 증가하도록 이렇게도 가능하다
			if(i % 2 == 1){ 
				sum += i;
			}
		}
		System.out.println(sum);
		
		//구구단을 출력해보자
		/*
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 2 * 3 = 6
		 * 2 * 4 = 8
		 * ...
		 */
		for(int i = 1; i <= 9; i++){
			System.out.println( "2 * "+ i + " = " + i * 2 );
		}
		// 7 단
		for(int i= 1; i <= 9; i++){
			System.out.println("7 * "+ i +" = " + i * 7);						
		}
		
		for(int j =2; j <= 9; j++){
			for(int i =1; i <= 9; i ++){ //블럭안에 있는게 지역변수 i는 for문 안의 지역변수 블럭을 벗어나면 없는것과 마찬가지
				System.out.println(j + " * "+ i + " = " + i * j); 
			}
		}
//		//구구단 전체의 짝수단의 홀수줄만 출력해주세요
//		for(int j = 2; j <= 9; j += 2 ){        
//			for(int i =1; i <= 9; i += 2){     //if(i % 2 == 0)
//				System.out.println(j + " * " + i +" = " + i );
//				}
//			}
			//구구단 전체를 가로로 출력해주세요
			/*
			 * 2 * 1 = 2  3 * 1 = 3  4 * 1 = 4 ...
			 * 2 * 2 = 4  3 * 2 = 6  4 * 2 = 6 ...
			 */
			
			for(int j= 1; j <= 9; j++){
				for(int i = 2; i <= 9; i++){
					System.out.printf(i +" * " + j +" = " + j * i + "\t");
				}
				System.out.println();
			}
			/*
			 * << while 문 >>
			 * - while(조건식){}
			 * - 조건식의 결과가 true인 동안 계속해서 반복 
			 * - 반복횟수를 알 수 없을때 사용한다.
			 * 
			 */
			Scanner s = new Scanner(System.in);
			
//			while(true){
//				System.out.println("몇단을 출력할까요?(0 : 종료)");
//				int dan = Integer.parseInt(s.nextLine());
//				
//				if(dan == 0){
//					System.out.println("종료되었습니다.");
//					break;
//				}
//				for(int i = 1; i <= 9; i++){
//					System.out.println(dan +" * " + i +" = " +dan * 1);
//				}
//			}
			
			/*
			 * << do-while 문 >>
			 * - do{}while(조건식);
			 * - 최소한 한번의 수행을 보장한다.
			 */
			
			//숫자 맞추기 게임을 만들어보자.
//			int answer = (int)(Math.random() * 100) + 1;
			//1 ~ 100 사이의 랜덤 수를 발생시킨다 (1부터 100미만의 double타입의 값)
//			int input = 0;
//			
//			do{
//				System.out.println("1 ~ 100 사이의 수를 입력해주세요 >");
//				input =Integer.parseInt(s.nextLine());
//				
//				if(answer < input){
//					System.out.println(input + "보다 작습니다.");
//				}else if(input < answer){
//					System.out.println(input + "보다 큽니다.");
//				}else{
//					System.out.println("정답입니다!!");
//				}
//			}while(input != answer); //세미콜론을 붙여야한다
//			
			//이름붙은 반복문
			outer : for(int i = 2; i <= 9; i++){
				for(int j = 1; j <= 9; j++){
					if(j == 5){
//						break; //가장 가까운 반복문 하나를 빠져나간다.
//						break outer; //outer라는 이름의 반복문의 빠져나간다.
//						continue; //가장 가까운 반복문의 현재 반복회차를 빠져간다. - 증감식으로 간다 (i = 5인 경우가 빠지고 증감)
						continue outer; //outer라는 이름의 현재 반복회차를 빠져나간다. (i = 5인 경우 까지 제외하고 증감)
					}
					System.out.println(i + " * " + j +" = " + i * j);
				}
				System.out.println();
			}
			/*126
			 *  
			 * 136 0S 1B 2O
			 * 217 1S 1B 1O
			 * 123 0S 1B 2O
			 * 318 1S 0B 2O
			 * 517 1S 2B 0O
			 * 715 3S
			 */
			
//			int answer1 = (int)(Math.random() * 9) + 1;
//			int answer2 = (int)(Math.random() * 9) + 1;
//			int answer3 = (int)(Math.random() * 9) + 1;
//			
//			//1 ~ 9 사이의 랜덤 수를 발생시킨다 (1부터 100미만의 double타입의 값)
//			int i = 100;
//			int j = 10;
//			int k = 0;
//			
//			do{
//			System.out.println("1 ~ 9 사이의 수를 입력해주세요 >");
//			answer1 = Integer.parseInt(s.nextLine());
//			answer2 = Integer.parseInt(s.nextLine());
//			answer3 = Integer.parseInt(s.nextLine());
//			
//			baseball :  for(int i = 2; i <= 9; i++){
//						for(int input2 = 1; input2 <= 9; input2++){
//						for (int input3 = i; input3 <= 9; input3 ++){
//					}
//				}
//			}if(answer1 == i && answer2 == 100 && answer3 == input3){
//				System.out.println(i +i +"S" +input2 +"B" +input3 +"O");
//				}else if(answer1 == i || answer2 == input2 || answer3 == input3){
//					System.out.println(i +i +"S" +input2 +"B" +input3 +"O");
//				}else if(answer == i ){
//					
//				}
//			}while(i != answer);
//		
//			
//		}
	}
	}
