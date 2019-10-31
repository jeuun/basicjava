package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import dao.UserDao;
import dao.UserDaoImpl;
import data.Session;
import vo.UserVO;

public class UserServiceImpl implements UserService {

	//private static final boolean UserVO = false;
	
	//우선 싱글턴 패턴으로 만들어준다. 여러 클래스에서 사용할 수 있으므로.
	//여러곳에서 부르다보면 그때마다 객체를 생성해서 메모리 낭비/속도 저하 등의 문제가 있을 수 있다.
	
	//싱글턴 패턴
	private static UserServiceImpl instance;
	
	private UserServiceImpl(){} //생성자 
	
	public static UserServiceImpl getInstance(){
		if(instance == null){
			instance = new UserServiceImpl();
		}
		return instance;
	}
	
	//UserDao userDao; //인터페이스 타입. 객체를 생성하지 않았음. 클래스 사용 못 함.
	UserDao userDao = UserDaoImpl.getInstance(); //객체를 불러온다. 컨트롤러로 가자.
	
	
	//클래스 - 인터페이스를 선택했을 경우 불러오는 부분
	@Override
	public void join() {
		//회원가입 진행
		//사용자 정보 입력
		Scanner s = new Scanner(System.in);
		
		System.out.print("아이디: ");
		String id = s.nextLine();	
		System.out.print("비밀번호: ");
		String password = s.nextLine();	
		System.out.print("이름: ");
		String name = s.nextLine();	
		
		//아이디 중복 검사(아이디가 일치하는 회원 검색)
			//- 가지고 오거나 가져갈 때 VO 사용
			//게터세터 후 VO 객체를 생성해서 담아준다.
		UserVO user = new UserVO(); //UserVO에 담아주는 과정. 변수 하나씩 들고 갈 수 없으니까 객체에 하나씩 담아서 들고 간다. 귀찮다! 해쉬맵.
		user.setId(id);
		user.setPassword(password);
		user.setName(name);
		
			//- 데이터베이스에 접속해서 확인해야 함. (dao 사용)
			//Dao에 selectUser메소드를 만들어준 후 온다.
		UserVO userCheck = userDao.selectUser("ID", user.getId()); //데이터베이스 접속할 때는 항상 userDao!
			//ID: selectUser 메서드를 통해서 유저 검색을 하는데 ID로 검색을 한다.
			//	   여러 메소드를 만들기보다는 파라미터("ID")로 뭘 검색할지, 어떤 아이디를 가지고 있는 값을 검색을 하겠다. (간편히 사용하기 위함)
			// 메소드의 값이 나오면 아래 구문을 시행한다. null, 또는 유저 이름(중복됐을 때).
		
		
		//중복되는 아이디가 없을 경우 사용자 정보 저장
		if(userCheck == null){ //null인 경우 데이터베이스에 저장, 해당 메서드를 Dao에 메서드로 만들어줘야한다. (회원 삽입)
			userDao.insertUser(user);
			System.out.println(user.getName() + "님의 가입을 환영합니다.");
			System.out.println();
		}else{
			System.out.println("이미 존재하는 아이디입니다.");
		}
		//회원가입 종료. Dao로 가서 상속받는 클래스를 만든다. (UserDaoImpl)
	}

	//=====================================================================================================================
	
	@Override
	public void login() {
		//로그인
		//아이디, 비밀번호 입력
		Scanner s = new Scanner(System.in);
		
		System.out.print("아이디: ");
		String id = s.nextLine();
		System.out.print("비밀번호: ");
		String password = s.nextLine();
		
		//아이디와 비밀번호가 일치하는 회원 검색
			//해쉬맵에서 받아서 파라미터로 넘길 것.
		HashMap<String, String> param = new HashMap<String, String>();
		param.put("ID", id);
		param.put("PASSWORD", password);
		
		UserVO user = userDao.selectUser(param); //받은 값을 파라미터로 넘겨줬다. 잘못 입력을 했다면 null이 뜰 것.
		
		//일치하는 사람이 있으면 로그인, 없으면 로그인 실패
		if(user == null){
			System.out.println("아이디 혹은 비밀번호를 잘못 입력하셨습니다.");
		}else{ //Session세션이라는 곳에 로그인 특별한 기능(회원의 기능)이 담긴다.
			Session.loginUser = user;
			System.out.println("로그인 성공");
			System.out.println(user.getName() + "님 환영합니다.");
		}

		
	}

	@Override
	public void userList() {
		//회원 전체 목록 출력
		//회원 전체 검색
			//데이터베이스 접근. 유저다오. 메서드를 만들어야 한다.
		ArrayList<UserVO> userList = userDao.selectUserList();
		
		//출력만 해주면 된다.
		System.out.println("======================");
		System.out.println("번호\t아이디\t이름");
		System.out.println("======================");
		for(int i = 0; i < userList.size(); i++){
			UserVO user = userList.get(i);
			System.out.println(i + 1 + "\t" + user.getId() + "\t" + user.getName());
		}
		System.out.println("======================");
		
	}

}






