package LECT;
	
	//정수 하나를 설정하고 
	//키보드로 정수 값을 입력 받아 두 수를 비교하여
	//같은 값인지를 판단한는 프로그램을 작성하시오
	//단, 동등성을 판단하는 코드는 별도의 메서드로 작성하시오
	
	public class ExtraLect04 {
	
	 public static void main(String[] args){ 
	 
	  java.util.Scanner sc=new java.util.Scanner(System.in);
	  int num1=1234;
	  System.out.println("4자리 정수 입력 : ");
	  int num2=sc.nextInt();
	  
	  if(isEqual(num1,num2)){
	   System.out.println("같은 값");
	  }else{
	   System.out.println("다른 값");
	  }
	  
	  if(num1==num2){
	   System.out.println("같은 값");
	  }else{
	   System.out.println("다른 값");
	  }
	 }
	 public static boolean isEqual(int a,int b){
	  boolean res=false;
	  if(a==b){
	   res=true;
	  }else{
	   res=false;
	  }return res;
	 }
	}
	 
