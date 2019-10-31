package a_variable;

public class ComparisonOperator {

	public static void main(String[] args) {
		/*
		 * << 비교 연산자 >>
		 * - < : 작다
		 * - > : 크다
		 * - <= : 작거나 같다
		 * - >= : 크거나 같다
		 * - == : 같다
		 * - != : 같지 않다
		 */
		
		boolean b = 10 <20; // 비교연산자의 연산결과는 boolean이다.
		//boolean b = true; //연산 결과
		System.out.println(b); //결과가 참이면 true
		b = 10 < 20 - 15; //산술연산후 비교연산을 수행한다.
		System.out.println(b); //결과가 거짓이면 false
		
		b = 10 <= 10.0; //(double)10 <= 10.0
		//이항 연산자는 타입을 일치시킨 후 연산한다.
		System.out.println(b); //true
		b = 65 >= 'B'; // 65 >= (int)'B' char-> int타입으로 형 변환
		System.out.println(b); //false
		
		b = 10.0f == 10.0; //같다 
		System.out.println(b); //true
		b = 10.1f == 10.1; //다르다 float(-7자리까지 표현가능)과 double(-15자리까지 표현가능)은 정확한 값을 표현하지 못한다.
		System.out.println(b); //false
		System.out.printf("%21.20f%n", 10.1f); //10.10000038146972700000
		System.out.printf("%21.20f%n", 10.1); //10.10000000000000000000
		//float과 double은 정밀도가 달라 float을 double로 형변환하면
		//소수점을 정확하게 비교할 수 없다.		
		System.out.printf("%21.20f%n", (double)10.1f); 
		System.out.printf("%21.20f%n", (float)10.1); 
		//double을 float으로 형변환해야 정확하게 비교할 수 있다.
		b = 10.1f == (float)10.1;
		System.out.println(b);
		
		//대소비교는 boolean을 제외한 기본형 타입만 비교할 수 있지만
		//등기비교 (같다,같지않다)는 모든 타입을 비교할 수 있다. 
		b = 'A' == 65;
		System.out.println(b);
		b = true != false;
		System.out.println(b);
		
		b = "abc" == "abc"; //참조형타입 abc엔 값을 가지고 있지 않고 주소를 가지고 있다. 같은 주소임으로 true
		System.out.println(b); //같은 스트링 리터럴은 같은 주소를 갖는다.
		b = "abc" == new String("abc"); //new는 새로운 주소를 생성한다.
		System.out.println(b);
		//참조형 타입은 저장된 메모리 주소를 비교하기 때문에
		//String은 등가비교 연산자로 내용을 비교할 수 없다.
		
		b = "abc".equals(new String("abc")); //equals를 사용하면 String의 내용을 비교할 수 있다. (.)은 참조연산자 
		System.out.println(b); //true
		b = !"abc".equals("ABC"); 
		//같지 않다의 결과를 얻기 위해서는 !(NOT) 을 앞에 붙여준다.
		System.out.println(b); //true
		//sysout ctrl + space
		
		//다음의 문장을 코드로 표현해주세요.
		//1보다 2가 크다.
		b = 1 < 2;
		//0은 100보다 작거나 같다.
		b = 0 <= 100;
		//3.14f와 3.14는 같지 않다.
		b = 3.14f != (float)3.14;
		//"남자"와 "여자"는 다르다.
		b = !"남자".equals("여자");		
		
		

	}

}
