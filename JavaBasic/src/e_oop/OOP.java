package e_oop;

public class OOP {

	public static void main(String[] args) {
		/*
		 *   << 객체지향 프로그래밍 >>
		 *   - 프로그래밍을 단순히 코드의 연속으로 보는것이 아니라 
		 *     객체간의 상호작용으로 보는것
		 *   - 코드의 재사용성이 높고 유지보수가 용이하다
		 *   
		 *   << 객체 생성(인스턴스화) >>
		 *   - 클래스를 사용하기 위해 메모리(Heap영역)에 올려놓는 것
		 *   - new 클래스명(); -> 객체가 저장된 메모리 주소 반환
		 *   - 객체 뒤에 참조연산사(.)를 붙여 객체의 변수와 메서드에 접근할 수 있다.
		 *   - 객체는 생성될때 마다 새로운 객체가 생성되고 
		 *     여러개의 객체가 동시에 존재할 수 있다.
		 */

		SampleClass sc = new SampleClass();
		
		sc.method1(); //파라미터도 리턴타입도 없는 메서드
		
		sc.method2(10); //10를 사용해 명령을 수행하는 메서드
		
		String returnString = sc.method3(); //명령 수행 후 결과물을 돌려주는 메서드
		System.out.println(returnString);
		 
		int returnInt = sc.method4(7, 15); //7,15를 사용해 명령을 수행하고 결과물을 돌려주는 메서드
		System.out.println(returnInt); //22
		
		sc.test1();
		
		ClassMaker b = new ClassMaker();
		
		b.aa();
		
		System.out.println(b.aaa());
		
		b.aaaa(10);
		
		System.out.println(b.aaaaa(10,20));
		
		//문제1 다음을 한줄씩 계산해서 최종 결과값을 출력해주세요
		//1. 123456 + 654321
		//2. 1번의 결과값 * 123456
		//3. 2번의 결과값 / 123456
		//4. 3번의 결과값 -654321
		//5. 4번의 결과값 % 123456
		
		Calculator c = new Calculator();
				
		double result = c.add(123456, 654321);
		result = c.minus(result, 123456);
		result = c.multiply(result, 123456);
		result = c.divide(result, 654321);
		result = c.remainder(result, 123456);
		System.out.println(result);
	}
	
}
