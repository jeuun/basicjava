package service;

public interface UserService {
	
	void join(); //회원가입
		
	void login(); //로그인
	
	void userList(); //회원 전체 목록 출력
	
	//3개의 목록을 추상 메서드로 만들어줬다. 구현하는 클래스를 아직 만들진 않았다.
	
	//새로운 클래스를 만들 때 인터페이스에 userService를 넣어서 만들어준다. 그럼 오버라이딩 된 클래스가 나옴.

}
