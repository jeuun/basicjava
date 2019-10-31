//책을 검색할 수 있는 기능

package dao;

import java.util.ArrayList;

import vo.BookVO;
import vo.UserVO;

public interface SearchDao {
	
	ArrayList<BookVO> searchBookList();
	
}
