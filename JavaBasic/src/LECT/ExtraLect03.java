package LECT;
	
	//기억장소 바꾸기
	//영어단어를 키보드로 입력 받아 단어에 포함된 철자를 
	//섞어 출력하시오

	//Scanner class 사용절차
	//(1)Scanner class import - class외부에서 선언
	//(2)Scanner class 객체 생성 - 사용하는 메서드 내부
	//(3)메시지 출력 (System.out.print()등을 사용)
	//(4)변수에 Scanner class 내부메서드를 사용하여 입력받은 자료 저장
	
	import java.util.Scanner; //1번째 단계
	
	public class ExtraLect03 {
	
	 public static void main(String[] args) {
		 
	  Scanner sc = new Scanner(System.in); //2번째 단계
	  
	  String word="orange";
	  System.out.print("정답 입력 : ");//3번째
	/*  String word = sc.nextLine();*/
	  
	  int len = word.length();
	  char str[]=word.toCharArray();//문자열을 배열로 변환, 지금의 값의 타입은 char
	 
	  for(int i=1; i<=100000;i++){
	   int r =(int)(Math.random()*str.length); //(int)이 순간만 형변환을 해줌
	   char temp = str[0];
	   str[0]=str[r];
	   str[r]=temp;
	  }
	  /*String s1 = new String(str); //s1을 당장 쓸것이 아니라 따로 이렇게 사용하지않고 밑에서 처럼 바로 사용 가능
	*/  System.out.println("제시어 : "+new String(str)); //str은 문자배열 메개변수로 받아서 문자열로 저장
	  
	  System.out.println("정답 입력 :");
	  String answer=sc.next();
	  
	  if(answer.equals(word)){
	   System.out.println("정답입니다");
	  }else{
	   System.out.println("틀렸습니다"); 
	  }
	  
	/*  for(int i=0; i<str.length; i++){
	   System.out.print(str[i]);
	  }*/
	  /*char str[]=new char[len]; //word.toCharArray(); //문자열을 배열로 변환
	  for(int i = 0; i <len; i++){
	   str[i]=word.charAt(i);
	  }*/
	  System.out.println(word+","+len);
	  
	  
	  
	 }
	
	} 
