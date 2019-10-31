package e_oop.class_making;

import java.util.Scanner;

public class bank {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("============ 정은 은행 =============\n"
				+ "-- 사용하실 메뉴를 선택해주세요. --\n"+ "(1) 예금조회 \n(2) 예금인출\n(3) 종료");
		
		int menu = Integer.parseInt(sc.nextLine()); 
		
		int total = 1000000;  //초기계좌잔액 설정
		int password = 0;  //패스워드 변수
		int out = 0;  //출금 금액
		
		while(menu!=3) {
				System.out.println("계좌 비밀번호를 입력해주세요."); 
                
				password = Integer.parseInt(sc.nextLine());
				
				while(password != 1234) {
				System.out.println("비밀번호 오류입니다. 다시 입력해주세요.");
				password = Integer.parseInt(sc.nextLine());
                
				}  
				
			if (menu == 1) {
				if (password==1234) {
					System.out.println("고객님의 계좌잔액은 " +total+ "원 입니다.");
					} 
				}
			
			if (menu == 2) {			
				if(password == 1234){
					System.out.println("인출할 금액을 입력해주세요.");
					out = Integer.parseInt(sc.nextLine());
					
					while(out>total) { //인출할 금액이 잔액보다 큰 경우 오류 메시지를 송출
						System.out.println("잔액이 부족합니다ㅠㅠ 다시 입력해주세요.");
						System.out.println("인출할 금액을 입력해주세요."); 
                        //인출 금액을 다시 입력받는다.
						out = Integer.parseInt(sc.nextLine());
						} 
					
					if(out <= total){
						total -= out; 
                        //잔액에서 인출된 금액을 감산한다. 결과적으로 인출을 여러번 실행하면 인출 총액만큼 잔액이 줄어든다.
						System.out.println("출금이 완료되었습니다. 축하드립니다 !");
						}
					}
				}
			
			System.out.println("============ 정은 은행 =============\n "
					+ "사용하실 메뉴를 선택해주세요. \n"
					+ "(1) 예금조회 \n(2) 예금인출\n(3) 종료");
			
			menu = Integer.parseInt(sc.nextLine());
			
            
		}
		
		System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다.");
		
        //사용자가 3.종료를 입력하면 메시지 송출과 함께 프로그램이 종료된다.
	

	}

}
