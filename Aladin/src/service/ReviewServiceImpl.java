package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import vo.BookVO;
import vo.ReviewVO;
import dao.BookFindSearchDao;
import dao.BookFindSearchDaoImpl;
import dao.ReviewDao;
import dao.ReviewDaoImpl;
import data.Session;

public class ReviewServiceImpl implements ReviewService {
	
	
	// 생성자
	private static ReviewServiceImpl instance;
	
	private ReviewServiceImpl(){
	}
	public static ReviewServiceImpl getInstance(){
		if(instance == null)
		{
			instance = new ReviewServiceImpl();
		}
		return instance;
	}
	
	
	//필요한 객체 생성
	ReviewDao reviewDao = ReviewDaoImpl.getInstance();

	@Override
	public void ReviewFind(int param) {		//리뷰 보기
		
		Scanner s = new Scanner(System.in);
		
		BookVO book = new BookVO();
		ReviewVO review = new ReviewVO();
		ArrayList<ReviewVO> reviewList = reviewDao.searchReviewList();
		
		String bookName = reviewDao.rtnBookTitle(param);		//도서 제목 불러오는 메서드
		
		System.out.println("==================================================");
		System.out.println("▷ 책: " + bookName);
		System.out.println();
		
		int grade = (int)reviewDao.grade(param);
		int grade1 = 0;
		String gradeStar = "";
		
//		
//		for(int i = 1; i <= 5; i++){		//전체 평점 부분 (추후 가능하면 수정)
//			grade1 = (int)grade - 1;
//			System.out.println(grade1);
//			if(grade >= 1){
//				gradeStar += "★";
//			}else{
//				gradeStar += "☆";
//			}
//		}
//		
//		System.out.println("전체 평점: " + gradeStar + "(" + grade1 + ")");
		System.out.println("--------------------");
		
		for(int i = reviewList.size() - 1; i >= 0; i--){		//리뷰 최근 것부터 불러오는 반복문
			ReviewVO review1 = reviewList.get(i);
			if(param == review1.getBookNumber()){
				System.out.println("작성자: " + review1.getWriter());
				System.out.println("내용: " + review1.getContents());
				System.out.println("평점: " + review1.getRating());
				System.out.println("날짜: " + review1.getDate());
				System.out.println("--------------------");
			}
		}
		
		System.out.println("==================================================");
		System.out.println("1.리뷰작성 / 2.장바구니 담기 / 0.돌아가기");
		System.out.println("==================================================");
		System.out.print("메뉴에 해당하는 번호 입력> ");
		
		int menu = Integer.parseInt(s.nextLine());
		
		switch(menu){
		case 1: 		//리뷰작성
			ReviewWrite(param);
		case 2:			//장바구니 잠기
			
		case 0:			//돌아가기
//			controller.start();
		default:		//리뷰쓰기로 다시 돌아감
			ReviewFind(param);
		}
		
		
		

	}

	@Override
	public void ReviewWrite(int param) {		//리뷰 작성
		
		Scanner s = new Scanner(System.in);
		SimpleDateFormat ymd = new SimpleDateFormat("yyyy-MM-dd");		//오늘 일자를 불러오기 위함
		Date today = new Date();										//오늘 일자를 불러오기 위함

		ReviewVO review = new ReviewVO();
		ArrayList<ReviewVO> reviewList = reviewDao.searchReviewList();
		
		int menu = 0;
		
		//세션 로그인을 시험해봤어야 하는데 로그인이 안 돼서 아직 시험해보지 못함.
		//세션을 로그인하고 리뷰를 재작성하려 할 때 수정 문구가 떠야 함.
	
		
//		if(review.getWriter() == Session.loginUser.getId()){
//			System.out.println("==================================================");
//			System.out.println("0.예 / 1.아니오");
//			System.out.println("==================================================");
//			System.out.print("▷ 입력하신 내용을 수정하시겠습니까?> ");
//			menu = Integer.parseInt(s.nextLine());
//			switch(menu){
//			case 0:
//				review.setWriter("1");
//				ReviewWrite(param);
//				break;
//			case 1:
//				ReviewFind(param);
//				break;
//			default:
//				ReviewWrite(param);
//				break;
//			}
//			
//		}else{
			
			//리뷰 작성 부분
			System.out.println("==================================================");
			System.out.println();
			System.out.print("리뷰 내용을 작성해주세요.> ");
			
			String reviewContents = s.nextLine();
			int reviewGrade = 0;
			
			do{		//평점 1~5를 입력하지 않았을 경우 시행되는 반복문
				System.out.print("평점을 입력해주세요.(1 ~ 5)> ");
				reviewGrade = Integer.parseInt(s.nextLine());
				double reviewGrade2 = reviewGrade; 
			}while(!(reviewGrade > 0 && reviewGrade < 6));
			
			//VO 저장
			review.setBookNumber(param);
			review.setReviewNumber(reviewList.size() + 1);
			review.setContents(reviewContents);
			review.setRating((double)reviewGrade);
			review.setDate(ymd.format(today));
			
			//Review 데이터베이스에 추가
			reviewDao.insertreview(review);
			
			System.out.println();
			System.out.println("==================================================");
			System.out.println();
			System.out.println("작성자: " + review.getWriter());
			System.out.println("내용: " + review.getContents());
			System.out.println("평점: " + review.getRating());
			System.out.println("날짜: " + review.getDate());
			System.out.println();
			System.out.println("▷ 리뷰가 등록되었습니다.");
			System.out.println();
			System.out.println("==================================================");
			System.out.println("1.리뷰보기 / 2.장바구니 담기 / 0.돌아가기");
			System.out.println("==================================================");
			System.out.print("메뉴에 해당하는 번호 입력.> ");
			menu = Integer.parseInt(s.nextLine());
			
			switch(menu){
			case 1: 
				ReviewFind(param);
			case 2:
				
			case 0:
//				controller.start();
			default:
				ReviewFind(param);
			}
			
			
		
//		}
		
	}

	
	
}
	
	
