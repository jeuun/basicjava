package e_oop;

import java.util.Scanner; 

public class SimLiTest {

	//9개의 질문을 9개의 메서드로 만들어 주세요.
	
	Scanner input = new Scanner(System.in);
	
	void a(String z){
		
		System.out.println("나는 금사빠다");
		
		z = input.nextLine();		
		
		if (z. equals ("y")){
			System.out.println("연애할 때 끌려다니는 타입이다");
		}else{
			System.out.println("감정기복이 크지 않다");
		}
	}
	
	void b(String z){
		
		System.out.println("연애할때 끌려다니는 타입이다");	
		
		if (z. equals ("y")){
			System.out.println("감정 표현에 솔직한 편이다");
		}else{
			System.out.println("데이트 코스는 미리 짜는게 편하다");
		}
	}
	
	void c(String z){
			
			System.out.println("데이트코스는 미리짜는게 편하다");
			
			if (z. equals ("y")){
				System.out.println("활동적인 데이트가 좋다");
			}else{
				System.out.println("감정 표현에 솔직한 편이다");
			}
		}
	
	void d(String z){
		
		System.out.println("감정기복이 크지 않다");
		if (z. equals ("y")){
			System.out.println("연락이 없어도 믿고 기다리는 편이다");
		}else{
			System.out.println("감정 표현에 솔직한 편이다");
		}
	}
	
	void e(String z){
			
			System.out.println("감정 표현에 솔직한 편이다");
			if (z. equals ("y")){
				System.out.println("이성친구는 존재할 수 없다");
			}else{
				System.out.println("활동적인 데이트가 좋다");
			}
		}
	
	void f(String z){
		
		System.out.println("활동적인 데이트가 좋다");
		if (z. equals ("y")){
			System.out.println("이성친구는 존재할 수 없다");
		}else{
			System.out.println("아무일도 아닌 일에 쉽게 섭섭함이 쌓인다");
		}
	}
	
	void g(String z){
			
			System.out.println("연락이 없어도 믿고 기다리는 편이다");
			if (z. equals ("y")){
				System.out.println("type A");
			}else{
				System.out.println("이성친구는 존재할 수 없다");
			}
		}
		
	void h(String z){
			
		System.out.println("이성친구는 존재할 수 없다");
		if (z. equals ("y")){
			System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
		}else{
			System.out.println("type B");
		}
	}

	void i(String z){
		
		System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
		if (z. equals ("y")){
			System.out.println("type D");
		}else{
			System.out.println("type C");
		}
	}

}
