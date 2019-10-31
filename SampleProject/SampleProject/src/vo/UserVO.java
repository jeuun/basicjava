package vo;

public class UserVO {
	// 사용자 정보에 대한 변수를 만들어준다.
	// getter-setter를 만들어줘야 한다.VO는 이렇게 만들어줘야함.
	
	private String id;
	private String password;
	private String name;
	
	// getter-setter을 선택한 다음에 생기는 화면
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
