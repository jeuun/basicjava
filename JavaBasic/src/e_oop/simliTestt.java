
package e_oop;

import java.util.Scanner;

public class simliTestt {
	
	//9개의 질문을 9개의 메서드로 만들어주세요.
	String question1 = "나는 금사빠다.(Y/N)";
	String question2 = "연애할 때 끌려다니는 타입이다.(Y/N)";
	String question3 = "데이트 코스는 미리 짜는게 편하다.(Y/N)";
	String question4 = "감정기복이 크지 않다.(Y/N)";
	String question5 = "감정 표현에 솔직한 편이다.(Y/N)";
	String question6 = "활동적인 데이트가 좋다.(Y/N)";
	String question7 = "연락이 없어도 믿고 기다리는 편이다.(Y/N)";
	String question8 = "이성친구는 존재할 수 없다.(Y/N)";
	String question9 = "아무것도 아닌 이렝 쉽게 섭섭함이 쌓인다.(Y/N)";
	
	String typeA = "서로에 대한 신뢰감이 깊고, 존중해주는 어른스로운 연애를 하는 타입!";
	String typeB = "구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!";
	String typeC = "이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!";
	String typeD = "무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입";
	
	Scanner s = new Scanner(System.in);
	
	void start(){
		System.out.println(question1);
		String answer = s.nextLine();
		
		if(answer.equals("Y") || answer.equals("y")){
			question2();
		}else if(answer.equals("N") || answer.equals("n")){
			question4();
		}else{
			start();
		}
	}
	
	void question2(){
		System.out.println(question2);
		String answer = s.nextLine();
		
		if(answer.equals("Y")){
			question5();
		}else if(answer.equals("N")){
			question3();
		}
	}
	
	void question3(){
		System.out.println(question3);
		String answer = s.nextLine();
		
		if(answer.equals("Y")){
			question6();
		}else if(answer.equals("N")){
			question5();
		}
	}
	
	void question4(){
		System.out.println(question4);
		String answer = s.nextLine();
		
		if(answer.equals("Y")){
			question7();
		}else if(answer.equals("N")){
			question5();
		}
	}
	
	void question5(){
		System.out.println(question5);
		String answer = s.nextLine();
		
		if(answer.equals("Y")){
			question8();
		}else if(answer.equals("N")){
			question6();
		}
	}
	
	void question6(){
		System.out.println(question6);
		String answer = s.nextLine();
		
		if(answer.equals("Y")){
			question8();
		}else if(answer.equals("N")){
			question9();
		}
	}
	
	void question7(){
		System.out.println(question7);
		String answer = s.nextLine();
		
		if(answer.equals("Y")){
			System.out.println(typeA);
		}else if(answer.equals("N")){
			question8();
		}
	}
	
	void question8(){
		System.out.println(question8);
		String answer = s.nextLine();
		
		if(answer.equals("Y")){
			question9();
		}else if(answer.equals("N")){
			System.out.println(typeB);
		}
	}
	
	void question9(){
		System.out.println(question9);
		String answer = s.nextLine();
		
		if(answer.equals("Y")){
			System.out.println(typeD);
		}else if(answer.equals("N")){
			System.out.println(typeC);
		}
	}
}
