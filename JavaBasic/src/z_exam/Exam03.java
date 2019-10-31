package z_exam;

/*public class Exam03 {

	public static void main(String[] args)  {
	
[3-1] 다음 연산의 결과를 적으시오.

[연습문제]/ch3/Exercise3_1.java

class Exercise3_1 {
public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		
			System.out.println(1 + x << 33); => 6 - int는 32비트 임으로 왼쪽으로 한칸만 이동하면 된다.
			System.out.println(y >= 5 || x < 0 && x > 2); =>true
			System.out.println(y += 10 - x++); => 13 //여기서 x의 값이 1증가
			System.out.println(x+=2); //=> 5
			System.out.println( !('A' <= c && c <='Z') ); =>false
			System.out.println('C'-c); => 2 //67-65
			System.out.println('5'-'0'); =>5 //53-48
			System.out.println(c+1); => 66 //65(A)-int로 형변환 +1(int)
			System.out.println(++c); => B
			System.out.println(c++); => B //B가 출력된 후에 C가 저장된다
			System.out.println(c); => C
		}
}

[3-2] 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다 만일 
	  사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니
	  가 필요할 것이다. (1)에 알맞은 코드를 넣으시오.
	  
[연습문제] /ch3/Exercise3_2.java
	class Exercise3_2 {
		public static void main(String[] args) {
			int numOfApples = 123; // 사과의 개수
			int sizeOfBucket = 10; // 바구니의 크기 (바구니에 담을 수 있는 사과의 개수)
			int numOfBucket = ( (1) ); // 모든 사과를 담는데 필요한 바구니의 수
					
			System.out.println("필요한 바구니의 수 :"+numOfBucket);
		}	
	}	
	[실행결과] 
	13
	 
	=> numOfApples / sizeOfBucket + (numOfApples % sizeOfBucket == 0 ? 0 : 1);
	//사과의 개수에서 바구니의 크기를 나눗셈 했을때 10의 배수면 +0, 10배수가 아니면 +1
	
[3-3] 아래는 변수 의 값에 따라 num ‘양수’, ‘음수’, ‘0’을 출력하는 코드이다 
삼항 연산자를 이용해서 (1)에 알맞은 코드를 넣으시오.

[Hint] 삼항 연산자를 두 번 사용하라.
[연습문제]/ch3/Exercise3_3.java
	class Exercise3_3 {
		public static void main(String[] args) {
			int num = 10;
			System.out.println(  (1)  );
		}
	}
	
	=> num > 0 ? "양수":(num < 0 ? "음수" : "0")
	
[3-4] 아래는 변수 num 의 값 중에서 백의 자리 이하를 버리는 코드이다 만일 변수 num
의 값이 ‘456’이라면 ‘400’이 되고, ‘111’이라면 ‘100’이 된다.  (1) 에 알맞은 코드를 넣으시오.

[연습문제]/ch3/Exercise3_4.java
	class Exercise3_4 {
		public static void main(String[] args) {
				int num = 456;
				System.out.println(  (1)  );
		}
	}
[실행결과]
400

=> (num/100)*100;
//나눗셈 연산자에서는 반올림을 하지않고 버림을 한다.

[3-5] 아래는 변수의 값 중에서 일의 자리를 1로 바꾸는 코드이다 만일 변수 num의 값이 333 
이라면 331이 되고, 777이라면 771이 된다. (1)에 알맞은 코드를 넣으시오.

[연습문제]/ch3/Exercise3_5.java
	class Exercise3_5 {
		public static void main(String[] args) {
			int num = 333;
			System.out.println(  (1)  );
		}
	}
[실행결과]
331

=> num/10*10+1

[3-6] 아래는 변수 num의 값보다 크면서도 가장 가까운의 배수에서 변수 num의 값을 
뺀 나머지를 구하는 코드이다. 예를 들어 24의 크면서도 가장 가까운 10의 배수는 30이다.
19의 경우 20이고 81의 90이 된다. 30에서 24를 뺀 나머지는 6이기 때문에 변수 num의 값이
24라면 6을 결과로 얻어야 한다. (1)에 알맞은 코드를 넣으시오.
[Hint] 나머지 연산자를 사용하라.

[연습문제]/ch3/Exercise3_6.java
	class Exercise3_6 {
		public static void main(String[] args) {
				int num = 24;
				System.out.println(  (1)  );
		}
	}

[실행결과]
6

=> 10 - num%10 
//num%10 나머지는 4 , 10 - 4 = 6

[3-7] 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다. 변환공식이 'C =
5/9 ×(F - 32)라고 할 때, (1)에 알맞은 코드를 넣으시오. 단, 변환 결과값은 소수점
셋째자리에서 반올림해야한다. (Math.round() 를 사용하지 않고 처리할 것.)

[연습문제]/ch3/Exercise3_7.java
	class Exercise3_7 {
		public static void main(String[] args) {
			int fahrenheit = 100;
			float celcius = (  (1)  );
			
			System.out.println("Fahrenheit:"+fahrenheit);
			System.out.println("Celcius:"+celcius);
		}
	}

[실행결과]
Fahrenheit:100
Celcius:37.78

=> (int)(5/9f * (fahrenheit-32) * 100 + 0.5) / 100f ;

float나 double로 해야만 실수형태의 결과를 얻을 수 있다
C = 5/9f ×(100 - 32)
1. 값에 100을 곱한다. // 37.77778 * 100 - 소숫점 3째자리에서 반올림
2. 1의 결과에 0.5를 더한다. 3777.778 + 0.5 
3. 2의 결과를 int타입으로 변환한다. (int) 9778.278 -> 3778.0
4. 3의 결과를 100f로 나눈다.(100으로 나누면 소수점 아래의 값을 잃는다.) 3778/100f ->37.78

[3-8] 아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.
[연습문제]/ch3/Exercise3_8.java
	class Exercise3_8 {
		public static void main(String[] args) {
			byte a = 10;
			byte b = 20;
			byte c = a + b;
			char ch = 'A';
			ch = ch + 2;
			float f = 3 / 2;
			long l = 3000 * 3000 * 3000;
			float f2 = 0.1f;
			double d = 0.1;
			boolean result = d==f2;
			System.out.println("c="+c);
			System.out.println("ch="+ch);
			System.out.println("f="+f);
			System.out.println("l="+l);
			System.out.println("result="+result);
		}
	}

[실행결과]
c=30
ch=C
f=1.5
l=27000000000
result=true

=> 
byte c = a + b; →  int c = a + b; or byte c = (byte) a + b;
변수 a와 b는 모두 byte타입이므로 이항연산인 덧셈연산을 하기 전에 int타입으로 자동 형변환

ch = ch + 2; → ch = (char)(ch + 2);
char타입이 덧셈연산의 과정을 거치면서 int타입으로 변환되므로
char타입의 변수에 저장하기 위해서는 char타입으로 형변환

float f = 3 / 2; → float f = 3 / 2f;

int와 int의 연산결과는 int이기 때문에 3/2의 결과는 1이 된다. 
연산결과를 실수로 얻고 싶으면, 적어도 두 피연산자 중 
한 쪽이 실수타입(float와 double중의 하나)이어야 한다.

long l = 3000 * 3000 * 3000; → long l = 3000 * 3000 * 3000L;

int*int*int의 결과는 int이므로 int타입의 최대값인 약 2*10의 9제곱을 넘는 결과는 
오버플로우가 발생하여 예상한 것과는 다른 값을 얻는다. 
그래서 피연산자 중 적어도 한 값은 long타입이어야 최종결과를 long타입의 값으로 얻기 때문에 
long타입의 접미사 'L'을 붙여서 long타입의 리터럴로 만들어줘야 한다.

boolean result = d==f2; → boolean result = (float)d==f2;
비교연산자도 이항연산자이므로 연산 시에 두 피연산자의 타입을 맞추기 위해 형변환이 발생한다.
그래서 double과 float의 연산은 double과 double의 연산으로 자동형변환 되는데, 
실수는 정수와 달리 근사값으로 표현을 하기 때문에 float를 double로 형변환 했을 때 오차가 발생할 수 있다. 
그래서 float값을 double로 형변환 하기 보다는 double값을 
유효자리수가 적은 float로 형변환해서 비교하는 것이 정확한 결과를 얻는다.


[3-9] 다음은 문자형 변수 ch가 영문자 대문자 또는 소문자 이거나 숫자일 때만 변수 b
의 값이  true가 되도록 하는 코드이다. (1)에 알맞은 코드를 넣으시오.

[연습문제]/ch3/Exercise3_9.java
	class Exercise3_9 {
		public static void main(String[] args) {
			char ch = 'z';
			boolean b = (  (1)  );
			System.out.println(b);
		}
	}
	
[실행결과]
true

=> 'a' <= ch || <= 'A'
('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z') || ('0' <= ch && ch <= '9')



[3-10] 다음은 대문자를 소문자로 변경하는 코드인데 문자 ch에 저장된 문자가 대문자
인 경우에만 소문자로 변경한다. 문자코드는 소문자가 대문자보다 만큼 더 크다. 
예를들어 'A'의 코드는 65이고 'a'의 코드는 97이다. (1)-(2)에 알맞은 코드를 넣으시오.

[연습문제]/ch3/Exercise3_10.java
	class Exercise3_10 {
		public static void main(String[] args) {
			char ch = 'A';
			char lowerCase = (  (1)  ) ? (  (2)  ) : ch;
			System.out.println("ch:"+ch);
			System.out.println("ch to lowerCase:"+lowerCase);
		}
	}
[실행결과]
ch:A
ch to lowerCase:a

=> ('A' <= ch && ch <= 'Z' ) ? (char)(ch + 32) : ch ;
      boolean형타입
대문자인 경우에만 문자코드의 값을 32만큼 증가시키면 소문자가 된다.
문자 ch의 문자코드를 32증가시키기 위해서는 덧셈연산을 해야하는데, 
이 때 덧셈연산의 결과가 int이므로 char타입으로의 형변환이 필요하다.

*/





		

