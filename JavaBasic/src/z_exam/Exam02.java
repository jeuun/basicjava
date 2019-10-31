package z_exam;

public class Exam02 {
	
	/*
	[2-1] 다음 표의 빈 칸에 개의 기본형 을 알맞은 자리에 넣으시오 8 (primitive type) .
	
		크 기  1 byte 2 byte 4 byte 8 byte
		종 류   
		논리형 boolean
		문자형            char
		정수형  byte    short   int   long
		실수형                     float double
		
[2-2] 주민등록번호를 숫자로 저장하고자 한다 이 값을 저장하기 위해서는 어떤 자료형
(data type)을 을 선택해야 할까? regNo라는 이름의 변수를 선언하고 자신의 주민등록번호로
초기화 하는 한 줄의 코드를 적으시오.

long regNo; = 9411172123456L;

[2-3] 다음의 문장에서 리터럴 변수 상수 키워드를 적으시오 , , , .
int i = 100;
long l = 100L;
final float PI = 3.14f;

- 리터럴 : 100, 100L, 3.14f
- 변수 : i, l,
- 키워드 : int, long, float, final
- 상수 : PI

[2-4] 다음 중 기본형 이 아닌 것은 (primitive type) ? 2

a. int
b. Byte       // 앞 글자가 대문자라서 아니다. 
c. double
d. boolean


[2-5] 다음 문장들의 출력결과를 적으세요. 
오류가 있는 문장의 경우, 괄호 안에 '오류' 라고 적으시오.
System.out.println(“1” + “2”) → ( 12) 
System.out.println(true + “”) → (true) 
System.out.println(‘A' + 'B') → (131) -> A라는 문자가 가지고 있는 숫자는 65, B는 66을 가지고 있다.
System.out.println('1' + 2) → (51) 1->49
System.out.println('1' + '2') → (99) 1->49,2->50
System.out.println('J' + “ava”) → (Java) 
System.out.println(true + null) → (오류) -> 문법적으로 연산을 할 수가 없다. 

[2-6] 다음 중 키워드가 아닌 것은 모두 고르시오 ?(b,c,d,e ) 앞글자가 대문자이면 Class
a. if
b. True
c. NULL
d. Class
e. System

[2-7] 다음 중 변수의 이름으로 사용할 수 있는 것은 모두 고르시오 ? (a d e g)
a. $ystem
b. channel#5 ->#은 사용이 어렵다. _$만 사용이 가능하다.
c. 7eleven ->숫자가 처음 사용이 어렵다.
d. If
e. 자바
f. new ->예약어임으로 이름으로 사용이 어렵다.
g. $MAX_NUM
h. hello@com ->특수문자@ 사용이 안됨.

[2-8] 참조형 변수(reference type)와 같은 크기의 기본형(primitive type)은? 
(모두 고르시오) ( a, d )
a. int
b. long
c. short
d. float
e. double

[2-9] 다음 중 형변환을 생략할 수 있는 것은 모두 고르시오 ? ( d, e )

byte b = 10;
char ch = 'A';
int i = 100;
long l = 1000L;

a. b = (byte)i;
b. ch = (char)b;
c. short s = (short)ch;
d. float f = (float)l;
e. i = (int)ch;

표현범위가 작은 타입을 큰 타입으로 변경할때 생략이 가능하다.
형변환에서 표현범위가 byte는 -128~127 char은 0~6500까지 표현할 수 있다.
표현 범위가 다름으로 서로를 표현하기가 어렵다.
float타입이 long타입보다 표현 범위가 크다.

[2-10] char 타입의 변수에 저장될 수 있는 정수 값의 범위는? (10진수로 적으시오)
0 ~ 65535

[2-11] 다음중 변수를 잘못 초기화 한 것은 모두 고르시오 ? (a b c d)
a. byte b = 256;  byte는 256을 표현 할 수없다.
b. char c = '';  char는 반드시 한개의 문자를 표현해야한다.
c. char answer = 'no';  char는 한개의 문자만 표현 할 수 있다.
d. float f = 3.14  접미사f를 붙여야 가능하다.
e. double d = 1.4e3f; 

[2-12] 다음 중 메서드의 선언부로 알맞은 것은 모두 고르시오 main ? (pass)
a. public static void main(String[] args)
b. public static void main(String args[])
c. public static void main(String[] arv)
d. public void static main(String[] args)
e. static public void main(String[] args)

[2-13] 다음 중 타입과 기본값이 잘못 연결된 것은 모두 고르시오 ? (c e f)
a. boolean - false
b. char - '\u0000'
c. float - 0.0 float는 0.0f가 기본값.
d. int - 0
e. long - 0 long은 0l이 기본값.
f. String - ""  String은 참조형 타입. 모든 참조형 타입의 기본값은 null

	 */

}
