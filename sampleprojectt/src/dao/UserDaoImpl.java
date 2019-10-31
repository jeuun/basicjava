package dao;
//인터페이스 dao.UserDao 선택. 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import data.Database;
import vo.UserVO;

public class UserDaoImpl implements UserDao {
		//해쉬맵(추상메서드), 유저 다오에 만들어줬는데 임플에는 추상메서드를 구현하지 않았다.
		//그냥 클래스이기 때문에 추상메서드를 가지고 있으면 안 된다. 임플러먼티드 메서드를 클릭.
		//Add implements method 클릭
		
		//전체 회원 조회할 때 오류가 한 번 더 뜬다. 한 번 더 클릭
	
	
	
	//여러 곳에서 사용할 수 있는 클래스이기 때문에 싱글턴으로 만들어준다.
	private static UserDaoImpl instance;
	
	private UserDaoImpl(){} //생성자
	
	public static UserDaoImpl getInstance(){
		if(instance == null){
			instance = new UserDaoImpl();
		}
		return instance;
	}//하고 data의 Database 클래스로 간다.
	
//	UserDao userDao;
	
	
	Database database = Database.getInstance();

	@Override
	public UserVO selectUser(String key, String value) { //아이디 중복 검사를 하기 위해서.
		for(int i = 0; i < database.tb_user.size(); i++){ //데이터베이스에 있는 유저 테이블을 뒤져서 같은 아이디가 있는지 검색.
			UserVO user = database.tb_user.get(i);
			
			if(key.equals("ID")){ 
				if(user.getId().equals(value)){ //value와 값이 맞으면 리턴 /서비스 임플로 돌아간다.
					return user;
				}
			}
		}//같은 아이디를 가진 유저가 하나도 없으면
		return null;
	}

	@Override
	public void insertUser(UserVO user) {
		database.tb_user.add(user); //유저를 저장해준다.
	}

	
	//Add implements method를 클릭하면 생긴다.
	@Override
	public UserVO selectUser(HashMap<String, String> param) { //다수의 조건을 만족하는 유저를 찾는다.
		UserVO rtnUser = null;
		
		//찾기 위해서는 데이터베이스를 뒤져야 한다.
		for(int i = 0; i < database.tb_user.size(); i++){
			UserVO user = database.tb_user.get(i);
			
			//어떤 값이 와야 만족하는지 경우의 수가 많을 경우에는, 만족하지 않는 경우를 걸러낸다.
			Set<String> keys = param.keySet();
			
			boolean flag = true;
			
			for(String key : keys){
				String value = param.get(key);
				if(key.equals("ID")){
					if(!user.getId().equals(value)){
						flag = false;
					}
				}else if(key.equals("PASSWORD")){
					if(!user.getPassword().equals(value)){
						flag = false;
					}
				}else if(key.equals("NAME")){
					if(!user.getName().equals(value)){
						flag = false;
					}
				}
				
				}
			if(flag){
				rtnUser = user;
			}
			
		}
		return rtnUser;
	} //까지 하면 로그인 끝

	@Override
	public ArrayList<UserVO> selectUserList() {
		return database.tb_user;
	}

	
	
}
