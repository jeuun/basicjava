package e_oop.class_making;

import java.util.Scanner;

public class machine {

	public static void main(String[] args) {

	       
        Scanner sc = new Scanner(System.in);
        int money, choice, change = 0; // 넣은 금액, 메뉴 선택, 잔돈
        String more;
        int cola = 1000; // 콜라
        int sprite = 1000; // 사이다
        int mountaindew = 1000; // 마운틴듀
        int water = 500; // 생수
        int orangejuice = 2000; //오렌지쥬스
        int vitaminWater = 1500; // 비타민워터
        int oneThousandWon, fiveHundredWon, oneHundredWon = 0; // 천원, 오백원, 백원
        
        // 금액 입력
        System.out.println("금액을 입력하세요.");
        money = sc.nextInt();
        
        // 메뉴 입력
        System.out.println("메뉴를 고르세요");
        System.out.print("1.콜라(1000원) 2.사이다(1000원) 3.마운틴듀(1000원) 4.생수(500원) 5.오렌지쥬스(2000원) 6.비타민워터(1500원)>> ");
        choice = sc.nextInt();
 
        // 메뉴 선택 후 잔돈 구하기, 돈이 부족한지 확인
        if (choice==1 && money>cola) {
            change = money - cola;
        } else if (choice==2 && money>sprite) {
            change = money - sprite;
        } else if (choice==3 && money>mountaindew) {
            change = money - mountaindew;
        } else if (choice==4 && money>water) {
            change = money - water;
        } else if (choice==5 && money>orangejuice) {
            change = money - orangejuice;
        } else if (choice==6 && money>vitaminWater) {
            change = money - vitaminWater;
        } else {
            change = money;
            System.out.println("돈이 부족해요");
                   
        }
        
        System.out.println("잔돈 : " + change + "원 입니다");
        
        oneThousandWon = change/1000;
        fiveHundredWon = change%1000/500;
        oneHundredWon = change%1000%500/100;
        
        System.out.print("천원 : " + oneThousandWon + "개, " );
        System.out.print("오백원 : " + fiveHundredWon + "개, ");
        System.out.println("백원 : " + oneHundredWon + "개");
        
    		     
        System.out.println("이용해주셔서 감사합니다");
        System.out.println();
        

		
        System.out.println("뽑으신 음료수는"+ choice +" 이며 거스름돈은"+change+"입니다");

	}
}
