package data;

import java.util.ArrayList;
import vo.UserVO;


public class Database {
	
	
	//싱글턴 패턴
	private static Database instance;
		
		private Database(){} //생성자
		
		public static Database getInstance(){
			if(instance == null){
				instance = new Database();
			}
			return instance;
		}
	
	//데이터베이스를 만들었으므로, user를 여러 명 저장할 수 있는 테이블을 만들어야 한다.
	public ArrayList<UserVO> tb_user = new ArrayList<UserVO>();
	//임플로 돌아간다.
	
	
	
	{
		UserVO user = new UserVO();
		user.setId("admin");
		user.setPassword("admin");
		user.setName("관리자");
		
		tb_user.add(user);
		
	}
	
	
}
