package dao;

import java.util.ArrayList;
import java.util.HashMap;

import vo.UserVO;

public interface UserDao {
	
	//단일 회원 조회
	UserVO selectUser(String key, String value);
	
	UserVO selectUser(HashMap <String, String> param);
	
	//회원 삽입
	void inserUser(UserVO user);
	
	//전체 회원 조회
	ArrayList<UserVO> selectUserList();
	
	//로그인
	
	//비밀번호 변경
	
	//
	
}
