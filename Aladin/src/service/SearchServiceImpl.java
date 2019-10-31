//도서 서치 기능


package service;

import java.util.ArrayList;
import java.util.Scanner;


import dao.SearchDao;
import dao.SearchDaoImpl;
import data.Database;
import vo.BookVO;
import vo.UserVO;

public class SearchServiceImpl implements SearchService {
	
	String bookTitle = "";		//도서 제목(전역변수). 메소드 
	int menu = 0;

	// 생성자
	private static SearchServiceImpl instance;
	
	private SearchServiceImpl(){
	}
	public static SearchServiceImpl getInstance(){
		if(instance == null)
		{
			instance = new SearchServiceImpl();
		}
		return instance;
	}
	
	// 필요 객체 생성
	SearchDao searchDao = SearchDaoImpl.getInstance();

	@Override
	public void search(){		 //도서 검색 기능
		
		int number = 0; 		//검색 도서 인덱스 번호
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("▷ 검색할 도서의 제목 또는 키워드를 입력해주세요. : ");
		String title = s.nextLine();
		
		BookVO book = new BookVO();
		
		
		ArrayList<BookVO> bookList = searchDao.searchBookList(); //Dao의 searchBookList를 호출, tb_bookList를 불러와 변수에 저장.

		String rtnBook = ""; 		//조건식을 위한 변수 선언
		
		System.out.println("==================================================");
		System.out.println("순번\t도서 제목");
		System.out.println();
		
		for(int i = 0; i < bookList.size(); i++){		//도서 제목을 검색하는 반복문
			BookVO book1 = bookList.get(i);
			String bookName = book1.getTitle().substring(book1.getTitle().lastIndexOf('_') + 1);
				if(bookName.contains(title)){
					rtnBook = bookName;
					if(rtnBook!=""){
						number++;
						this.bookTitle += number + bookName + "_"; 		//키워드에 해당하는 도서 제목을 전역변수로 저장하는 부분
						System.out.println(number + "\t" + bookName);
//						System.out.println(number + "\t" + rtnBook + "\t" + book1.getWriter()+ "\t" + book1.getPublisher()+ "\t" + book1.getPrice()+"원");
					}
				}
		}
		
					//switch 문을 위한 변수 선언
		
		if(rtnBook == ""){ 		//해당 키워드의 도서를 찾지 못했을 경우
			System.out.println("▷ 해당 도서를 찾을 수 없습니다.");
			System.out.println();
			System.out.println("==================================================");
			System.out.println("0.예 / 1.아니오 / 2.판매등록");
			System.out.println("==================================================");
			System.out.print("▷ 다시 입력하시겠습니까?> ");
			int input = Integer.parseInt(s.nextLine());
			if(input == 0){
				System.out.println("==================================================");
				search();
			}else if(input == 1){
				System.out.println("==================================================");
			}else if(input == 2){
								//호출될 판매등록 메서드
				System.out.println("==================================================");
			}else{
				search();
			}
			
			System.out.println();
			System.out.println("==================================================");
			System.out.println();
		}else{				//해당 키워드의 도서를 찾은 경우
				System.out.println();
				System.out.println("\"" + book.getTitle() + "\"총 " + number + "개의 상품이 검색되었습니다.");
				System.out.println();
				System.out.println("==================================================");
				System.out.println("(직접입력).도서 번호(상세) / 0.이전화면 / -1.메인화면(로그인 이후)");
				System.out.println("==================================================");
				System.out.print("메뉴에 해당하는 번호 입력> ");
				this.menu = Integer.parseInt(s.nextLine());			//사용자한테 값 입력받는 부분
				System.out.println("==================================================");
				System.out.println();
				
				switch(this.menu)		//메뉴 선택에 따른 switch 문
				{
				case 0://이전화면
					//controller.start(); //이전화면으로 돌아가야 해서 임시로 퍼블릭으로 바꿈.
					break;
				case -1://메인화면(로그인 이후)
					//controller.start();
					break;
				default:
					searchSelect();
					break;
				}
		}
	}
	
	@Override
	public void searchSelect() { 		//도서 검색 이후 선택지로 넘어가는 메서드. (구매/리뷰/이전화면)
		
		Scanner s = new Scanner(System.in);
		
		ArrayList<BookVO> bookList = searchDao.searchBookList();
		
		System.out.println(this.bookTitle);
		System.out.println(this.menu);
		System.out.println(this.bookTitle.indexOf(this.menu));
		System.out.println(this.bookTitle.indexOf(this.menu + 1));
//		this.bookTitle = this.bookTitle.substring(this.bookTitle.indexOf(this.menu),this.bookTitle.indexOf(this.menu + 1) - 1); //오류나는 부분

		for(int i = 0; i < bookList.size(); i++){		//검색한 도서 제목에 대한 상세 정보 출력
			BookVO book1 = bookList.get(i);
			if(this.bookTitle.equals(book1.getTitle().substring(book1.getTitle().lastIndexOf('_') + 1))){
				System.out.println("도서 제목: " + book1.getTitle().substring(book1.getTitle().lastIndexOf('_') + 1));
				System.out.println("지은이: " + book1.getWriter()); 
				System.out.println("출판사: " + book1.getPublisher()); 
				System.out.println("가격: " + book1.getPrice()+"원");
				System.out.println("재고: " + (int)book1.getStock()+ 1 + "개");
				System.out.println();
				System.out.println("▷ 리뷰보기");
				System.out.println();
			}
		}
		
		System.out.println("==================================================");
		System.out.println("\t1.장바구니 담기 / 2.리뷰보기 / 0.이전화면 ");		//-1.메인화면(로그인 이후)
		System.out.println("==================================================");
		System.out.print("메뉴에 해당하는 번호 입력> ");
		
			int input = Integer.parseInt(s.nextLine());		//사용자 값 입력
			
			
			switch(input)			//메뉴 선택에 따른 switch 문
			{
			case 0://이전화면
				//controller.start();
				break;
			case 1://장바구니 담기
				
				break;
			case 2://리뷰보기
				
				break;
//			case -1://메인화면(로그인 이후)
//				controller.start();
//				break;
			default:
				searchSelect();
				break;
			}
			
			
		//controller.start();		
		
	}
}