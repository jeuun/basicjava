package dao;

import java.util.ArrayList;

import data.Database;
import vo.BookVO;
import vo.UserVO;

public class SearchDaoImpl implements SearchDao {

	
	private static SearchDaoImpl instance;
	
	private SearchDaoImpl(){}
	
	public static SearchDaoImpl getInstance(){
		if(instance == null){
			instance = new SearchDaoImpl();
		}
		return instance;
	} //SearchDaoImpl의 싱글턴 타입의 생성자 생성
	
	
	Database database = Database.getInstance();

	
	@Override
	public ArrayList<BookVO> searchBookList() {		//tb_bookList를 불러올 메서드
		return database.tb_bookList;
	}

}
