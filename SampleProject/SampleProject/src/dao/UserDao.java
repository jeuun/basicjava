package dao;

import java.util.ArrayList;
import java.util.HashMap;

import vo.UserVO;
// 인터페이스 선택 후 finish

public interface UserDao {
	//단일 회원 조회. 그 유저의 리턴을 반환받아야 함.
	
	//유저를 반환받아야 하는 메서드 설정
	UserVO selectUser(String key, String value); //아이디면 아이디, 비밀번호면 비밀번호. 단일 검색만 가능. 로그인은 이걸로는 사용 불가.
	
	// *로그인처럼 파라미터가 늘어날수록 메서드를 만들어줘야 하는데, 그러기 싫으니까 모든 걸 공통적으로 사용할 수 있는 메서드를 만들자. (유동적)
	UserVO selectUser(HashMap <String, String> param); //파라미터가 여러개든 상관이 없다. 이렇게 해줬으면, 위 메서드도 필요가 없다.
	
	//회원 삽입
	void insertUser(UserVO user);

	//전체 회원 조회
	ArrayList<UserVO> selectUserList();
	
	
}
