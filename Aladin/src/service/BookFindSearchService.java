//도서 조회·서치 기능 추상메서드(인터페이스)

package service;

public interface BookFindSearchService {
	
	void bookFind();		//도서 조회 기능

	void bookFindSelect();	 //도서 조회 이후 선택지
	
	void search();			 //도서 검색 기능
	
	void searchSelect();	 //도서 검색 이후 선택지
	
}
