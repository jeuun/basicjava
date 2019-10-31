package controller;

import java.util.Scanner;

import service.UserService;
import service.UserServiceImpl;

public class Controller {
	
	//UserService userService; // 다른 패키지에 있기 때문에 import가 필요하다. 객체가 없다!
	UserService userService = UserServiceImpl.getInstance(); //객체 생성

	public static void main(String[] args) {
		
		/*
		 * 조 소개 → 주제 소개 → 주제 선정 배경 → 프로그램 구조 → 시연
		 * 발표자 1명, 도우미 1명
		  
		 * Controller: 메뉴 선택
		 * Service: 메뉴 기능 수행
		 * Dao(DataAccessObject): 데이터베이스 접속
		 * VO(ValueObject): 데이터를 담는 클래스
		 
		 * VO의 장점: 무엇이 저장되어 있는지 쉽게 알 수 있다.
		 * HashMap의 장점: 클래스를 많이 만들 필요가 없다.
		 */
		
		new Controller().start();
		
		
		
		
	}

	public void start() {
		
		Scanner s = new Scanner(System.in);
		
		int menu; //유저가 어떤 선택을 했는지 저장
		
		do{ //종료하고 싶을 때까지 계속 사용할 수 있기 때문에
			
			//사용자가 입력할 수 있도록 어떤 메뉴들이 있는지 출력
			System.out.println("=========메뉴==========");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원목록");
			System.out.println("0. 프로그램 종료");
			System.out.println("======================");
			System.out.println("메뉴에 해당하는 번호 입력>");
			
			menu = Integer.parseInt(s.nextLine());
			//int 타입의 메소드가 있긴 한데 버그가 있어서 따로 변경을 해줄 것.
			//s.nextInt(); : 버그가 있으므로 사용하지 말자.
			
			switch (menu) {
			case 1: //회원가입
				userService.join(); //클래스는 처음에 가지고 있지 않지만 처음에 먼저 호출을 할 수 있다.
				break;
			case 2: //로그인
				userService.login();
				break;
			case 3: //회원목록
				userService.userList();
				break;
			case 0: //프로그램 종료
				System.out.println("프로그램 종료");
			default:
				break;
			}
			
		}while(menu != 0);
		
	}

	
	
	
	
}





