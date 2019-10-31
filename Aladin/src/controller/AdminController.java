/*
controller 패키지에는 콘솔창을 실행할 MainPrint클래스와
제어를 담당하는 Controller클래스가 있다.
이 클래스는 Admin전용의 클래스이며 로그인할 때 관리자이면 AdminController가 실행된다.
*/
package controller;

import java.util.Scanner;

import service.AdminService;
import service.AdminServiceImpl;
import service.BookFindSearchService;
import service.BookFindSearchServiceImpl;
import service.FAQService;
import service.FAQServiceImpl;
import service.NoticeService;
import service.NoticeServiceImpl;
import service.QNAService;
import service.QNAServiceImpl;
import service.UserService;
import service.UserServiceImpl;

public class AdminController {
	//1.회원정보열람
	//2.공지사항 작성/수정/삭제
	//3.FAQ 추가/삭제
	//4.QNA 답변 권한/질문글 삭제
	//5.책 리스트 삭제
	//6.리뷰 글 삭제
	//0.로그아웃
	
	//위의 목록을 전부 출력하는 기능
	//1.회원정보열람 2.공지사항열람 3.FAQ열람 4.QNA열람 5.(전체)책 리스트 열람 6.전체 리뷰 열람
	
	//1.회원정보 열람 후
	//1.삭제 0.이전화면
	
	//2.공지사항
	//1.글쓰기 2.수정 3.삭제 0.이전화면
	
	//3.FAQ
	//1.글쓰기 2.수정 3.삭제 0.이전화면
	
	//4.QNA
	//1.답변 글쓰기 2.수정 3.질문 글 삭제 4.답변 글 삭제 0.이전화면
	
	//5.책 리스트 열람
	//1.삭제 0.이전화면
	
	//6.리뷰
	//1.삭제 0.이전화면
	
	//0.로그아웃
//	1.회원정보열람 2.공지사항열람 3.FAQ열람 4.QNA열람 5.(전체)책 리스트 열람 6.전체 리뷰 열람
	private static AdminController instance;
		
		private AdminController(){}
		
		public static AdminController getInstance(){
			if(instance == null){
				instance = new AdminController();
			}
			return instance;
		}
		
		UserService userservice = UserServiceImpl.getInstance();
		AdminService adminservice = AdminServiceImpl.getInstance();
		FAQService faqService = FAQServiceImpl.getInstance();
		QNAService qnaService = QNAServiceImpl.getInstance();
		BookFindSearchService bookfindsearchservice = BookFindSearchServiceImpl.getInstance();
		NoticeService noticeservice = NoticeServiceImpl.getInstance();
	

		// 인스턴스화 필요
		
		
		
		public void adminMenu(){
			Scanner s = new Scanner(System.in);
			
			try{
				int adminMenu;

				while(true){
					System.out.println();
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[관리자메뉴]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println();
					System.out.println("\t 1.회원정보 열람");
					System.out.println("\t 2.공지사항 관리");
					System.out.println("\t 3.FAQ 관리");
					System.out.println("\t 4.QNA 관리");
					System.out.println("\t 5.전체 책 리스트 보기");
					System.out.println("\t 6.전체 리뷰 보기");
					System.out.println("\t 0.되돌아가기");
					System.out.println();
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println();
					System.out.print("메뉴에 해당하는 번호 입력>");
					
					adminMenu = Integer.parseInt(s.nextLine());
					
					switch(adminMenu){
						case 1: //회원정보 열람
							Memberlist();
							break;
						case 2: //공지사항 관리
							NoticeManage();
							break;
						case 3: //FAQ 관리
							FaqManage();
							break;
						case 4: //QNA 관리
							QnaManage();
							break;
						case 5: //전체 책 리스트 보기
							BookManage();
							break;

						case 6: //전체 리뷰 보기
							ReviewManage();
							break;
						case 0: 
							System.out.println("프로그램을 종료합니다.");
							System.exit(0);
					}
					if(adminMenu > 6){
						System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
						System.out.println();
					}
				}
			}catch(NumberFormatException ne){
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				adminMenu();
				System.out.println();
			}
		}
		
		// 회원 관리
		void Memberlist(){
			Scanner s = new Scanner(System.in);
			
			try{
				int memberMenu;

				while(true){
					System.out.println();
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[회원정보 열람]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println();
					System.out.println("\t 1.전체 회원정보 열람");
					System.out.println("\t 0.되돌아가기");
					System.out.println();
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println();
					System.out.print("메뉴에 해당하는 번호 입력>");
					
					memberMenu = Integer.parseInt(s.nextLine());
					
					switch(memberMenu){
						case 1: //회원정보 열람
							userservice.userList();
							break;
						
						case 0: 
							System.out.println("프로그램을 종료합니다.");
							System.exit(0);
					}
					if(memberMenu > 1){
						System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
						System.out.println();
					}
				}
			}catch(NumberFormatException ne){
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				adminMenu();
				System.out.println();
			}
		}
		
		// 공지사항 관리
		void NoticeManage(){
			Scanner s = new Scanner(System.in);
			
			try{
				int noticeManage;

				while(true){
					System.out.println();
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[공지사항 관리]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println();
					System.out.println("\t 1.FAQ 쓰기");
					System.out.println("\t 2.FAQ 수정");
					System.out.println("\t 3.FAQ 삭제");
					System.out.println("\t 0. 이전화면");
					System.out.println();
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println();
					System.out.print("메뉴에 해당하는 번호 입력 >");
					
					noticeManage = Integer.parseInt(s.nextLine());
					
					switch(noticeManage){
						case 1: 
							adminservice.noticeView();
							break;
						
						case 0: 
							System.out.println("프로그램을 종료합니다.");
							System.exit(0);
					}
					if(noticeManage > 1){
						System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
						System.out.println();
					}
				}
			}catch(NumberFormatException ne){
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				adminMenu();
				System.out.println();
			}
		}
		
		//FAQ 관리
//		1.글쓰기 2.수정 3.삭제 0.이전화면
		void FaqManage(){
			Scanner s = new Scanner(System.in);
			
			try{
				int faqManage;

				while(true){
					System.out.println();
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[FAQ 관리]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println();
					System.out.println("\t 1.FAQ 쓰기");
					System.out.println("\t 2.FAQ 수정");
					System.out.println("\t 3.FAQ 삭제");
					System.out.println("\t 0. 이전화면");
					System.out.println();
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println();
					System.out.print("메뉴에 해당하는 번호 입력>");
					
					faqManage = Integer.parseInt(s.nextLine());
					
					switch(faqManage){
						case 1: //1.FAQ 쓰기
							faqService.FAQAdd();
							break;
						case 2: // 2.FAQ 수정
							faqService.FAQModify();
							break;
						
						case 3: //3.FAQ 삭제
							faqService.FAQDelete();
							break;
						
						
						case 0: 
							System.out.println("프로그램을 종료합니다.");
							System.exit(0);
					}
					if(faqManage > 3){
						System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
						System.out.println();
					}
				}
			}catch(NumberFormatException ne){
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				adminMenu();
				System.out.println();
			}
		}
//		1.답변 글쓰기 2.수정 3.질문 글 삭제 4.답변 글 삭제 0.이전화면
		void QnaManage(){
			
			Scanner s = new Scanner(System.in);
			
			try{
				int qnaManage;

				while(true){
					System.out.println();
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[QNA 관리]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println();
					System.out.println("\t 1.답변 글쓰기");
					System.out.println("\t 2.답변 수정");
					System.out.println("\t 3.질문 글 삭제");
					System.out.println("\t 4.답변 글 삭제");
					System.out.println("\t 0.이전화면");
					System.out.println();
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println();
					System.out.print("메뉴에 해당하는 번호 입력>");
					
					qnaManage = Integer.parseInt(s.nextLine());
					
					switch(qnaManage){
						case 1: //답변 글쓰기
							qnaService.QNAAdd();
							break;
						case 2: //답변 수정
							qnaService.QNAModify();
							break;
						case 3: //질문 글 삭제
							//qnaService.QNADelete();
							break;
						case 4: //답변 글 삭제
							//qnaService.QNADelete();
							break;
						case 0: 
							System.out.println("프로그램을 종료합니다.");
							System.exit(0);
					}
					if(qnaManage > 4){
						System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
						System.out.println();
					}
				}
			}catch(NumberFormatException ne){
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				adminMenu();
				System.out.println();
			}
		}
		//5.책 리스트 열람
		//1.삭제 0.이전화면
		void BookManage(){
			Scanner s = new Scanner(System.in);
			
			try{
				int bookManage;

				while(true){
					System.out.println();
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[책 리스트 열람]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println();
					System.out.println("\t 1.전체 책 리스트 열람");
					System.out.println("\t 0.되돌아가기");
					System.out.println();
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println();
					System.out.print("메뉴에 해당하는 번호 입력>");
					
					bookManage = Integer.parseInt(s.nextLine());
					
					switch(bookManage){
						case 1: //책 리스트 열람
							bookfindsearchservice.bookFind();
							break;
						
						case 0: 
							System.out.println("프로그램을 종료합니다.");
							System.exit(0);
					}
					if(bookManage > 1){
						System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
						System.out.println();
					}
				}
			}catch(NumberFormatException ne){
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				adminMenu();
				System.out.println();
			}
		}
		
		void ReviewManage(){
			Scanner s = new Scanner(System.in);
			
			try{
				int reviewManage;

				while(true){
					System.out.println();
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[리뷰 열람]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println();
					System.out.println("\t 1.리뷰 열람");
					System.out.println("\t 0.되돌아가기");
					System.out.println();
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println();
					System.out.print("메뉴에 해당하는 번호 입력>");
					
					reviewManage = Integer.parseInt(s.nextLine());
					
					switch(reviewManage){
						case 1: //리뷰 삭제
							noticeservice.noticeModify();
							break;
							
						case 2 : //리뷰 수정
							noticeservice.noticeModify();
							break;
						
						case 0: 
							System.out.println("프로그램을 종료합니다.");
							System.exit(0);
					}
					if(reviewManage > 2){
						System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
						System.out.println();
					}
				}
			}catch(NumberFormatException ne){
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				adminMenu();
				System.out.println();
			}
		}
}
