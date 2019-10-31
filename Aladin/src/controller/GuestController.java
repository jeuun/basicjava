package controller;

import java.util.Scanner;

public class GuestController {
	
	//1.구매 - 도서조회, 검색//책 정보 열람, 장바구니에 넣기, 리뷰
			//2.판매등록
			//3.고객센터 - 공지사항 열람, FAQ 열람, QNA질문글 작성
			//4.MyPage - 구매이력, 장바구니, 회원정보수정
			//0.로그아웃
	//1.구매
	//1.도서조회 2.검색 0.이전화면
	
	//1.도서조회
		//1. 2. 3. 4. 5.
		//선택하면 해당 카테고리 출력
		//책 선택 후 //책 정보열람, 장바구니에 넣기, 리뷰 목록 선택화면 출력
	
	//2.검색
		//검색내용과 일치하는 책리스트를 출력
		//책 선택 후 //책 정보열람, 장바구니에 넣기, 리뷰 목록 선택화면 출력
	
		//리뷰 전체 출력
		//내용 볼 수 있도록 처리
	
	//2.판매등록
		//5개의 카테고리를 출력 후 유저에게 어떤 종류의 책인지 답변받을것.
		//책 제목 답변받기
		//책 저자 답변받기
		//출판사 답변받기
		//몇권을 팔것인지
		//희망 가격 답변받기
		//책 번호 BookDao에서 리스트 개수 반환받아 책번호에 넣을것. 
	

	
	
	
	void userMenu(){
		Scanner s = new Scanner(System.in);
		
		try{
			int userMenu;

			while(true){
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[관리자메뉴]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.println("\t 1.도서 구매");
				System.out.println("\t 2.도서 판매등록");
				System.out.println("\t 3.고객센터");
				System.out.println("\t 4.마이페이지");
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.print("메뉴에 해당하는 번호 입력>");
				
				userMenu = Integer.parseInt(s.nextLine());
				
				switch(userMenu){
					case 1: //도서 구매
						Bookbuy();
						break;
					case 2: //도서 판매등록
						SellBook();
						break;
					case 3: //고객센터
						Center();
						break;
					case 4: //마이페이지
						MyPage();
						break;
					
					case 0: 
						System.out.println("프로그램을 종료합니다.");
						System.exit(0);
				}
				if(userMenu > 5){
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					System.out.println();
				}
			}
		}catch(NumberFormatException ne){
			System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			userMenu();
			System.out.println();
		}
	}
	
	
	void Bookbuy(){
		Scanner s = new Scanner(System.in);
		
		try{
			int bookBuy;

			while(true){//TODO
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[관리자메뉴]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.println("\t 1.도서 구매");
				System.out.println("\t 2.도서 판매등록");
				System.out.println("\t 3.고객센터");
				System.out.println("\t 4.마이페이지");
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.print("메뉴에 해당하는 번호 입력>");
				
				bookBuy = Integer.parseInt(s.nextLine());
				
				switch(bookBuy){
					case 1: //도서 구매
						Bookbuy();
						break;
					case 2: //도서 판매등록
						SellBook();
						break;
					case 3: //고객센터
						Center();
						break;
					case 4: //마이페이지
						MyPage();
						break;
					
					case 0: 
						System.out.println("프로그램을 종료합니다.");
						System.exit(0);
				}
				if(bookBuy > 5){
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					System.out.println();
				}
			}
		}catch(NumberFormatException ne){
			System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			userMenu();
			System.out.println();
		}
	}
	//2.판매등록
			//5개의 카테고리를 출력 후 유저에게 어떤 종류의 책인지 답변받을것.
			//책 제목 답변받기
			//책 저자 답변받기
			//출판사 답변받기
			//몇권을 팔것인지
			//희망 가격 답변받기
	
	void SellBook(){
		Scanner s = new Scanner(System.in);
		
		try{
			int SellBook;

			while(true){//TODO
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[관리자메뉴]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.println("\t 1.도서 구매");
				System.out.println("\t 2.도서 판매등록");
				System.out.println("\t 3.고객센터");
				System.out.println("\t 4.마이페이지");
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.print("메뉴에 해당하는 번호 입력>");
				
				SellBook = Integer.parseInt(s.nextLine());
				
				switch(SellBook){
					case 1: //도서 구매
						Bookbuy();
						break;
					case 2: //도서 판매등록
						SellBook();
						break;
					case 3: //고객센터
						Center();
						break;
					case 4: //마이페이지
						MyPage();
						break;
					
					case 0: 
						System.out.println("프로그램을 종료합니다.");
						System.exit(0);
				}
				if(SellBook > 5){
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					System.out.println();
				}
			}
		}catch(NumberFormatException ne){
			System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			userMenu();
			System.out.println();
		}
	}
	//3.고객센터
	//1.공지사항 제목 출력
		//번호 선택하면 내용 출력
	//2.FAQ 제목 출력
		//번호 선택하면 내용 출력
	//3.QNA 제목 출력
		//번호 선택하면 내용 열람
		//글쓰기 기능
	
	void Center(){
		Scanner s = new Scanner(System.in);
		
		try{
			int Center;

			while(true){//TODO
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[관리자메뉴]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.println("\t 1.공지사항 보기");
				System.out.println("\t 2.FAQ 보기");
				System.out.println("\t 3.QNA 보기");
				System.out.println("\t 0.되돌아가기");
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.print("메뉴에 해당하는 번호 입력>");
				
				Center = Integer.parseInt(s.nextLine());
				
				switch(Center){
					case 1: //도서 구매
						Bookbuy();
						break;
					case 2: //도서 판매등록
						SellBook();
						break;
					case 3: //고객센터
						Center();
						break;
					
					case 0: 
						System.out.println("프로그램을 종료합니다.");
						System.exit(0);
				}
				if(Center > 5){
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					System.out.println();
				}
			}
		}catch(NumberFormatException ne){
			System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			userMenu();
			System.out.println();
		}
	}

	//4.MyPage
		//1.구매이력
			//제목이 출력된 후 번호를 선택하면 구매이력 리스트가 출력됨
		//2.장바구니
			//1.선택 2.전부선택 3.선택취소 4.전부선택취소 5.삭제 6.구매
		//3.회원정보 수정
			//비밀번호를 먼저 받아 인증
			//1.비밀번호 수정 2.주소 수정 3.전화번호 수정 4.이메일 수정
	
	void MyPage(){
		Scanner s = new Scanner(System.in);
		
		try{
			int MyPage;

			while(true){//TODO
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[관리자메뉴]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.println("\t 1.구매이력 보기");
				System.out.println("\t 2.장바구니 보기");
				System.out.println("\t 3.회원정보 수정");
				System.out.println("\t 0.되돌아가기");
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.print("메뉴에 해당하는 번호 입력>");
				
				MyPage = Integer.parseInt(s.nextLine());
				
				switch(MyPage){
					case 1: //도서 구매
						Bookbuy();
						break;
					case 2: //도서 판매등록
						SellBook();
						break;
					case 3: //고객센터
						Center();
						break;
					
					case 0: 
						System.out.println("프로그램을 종료합니다.");
						System.exit(0);
				}
				if(MyPage > 5){
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					System.out.println();
				}
			}
		}catch(NumberFormatException ne){
			System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			userMenu();
			System.out.println();
		}
	}
}
