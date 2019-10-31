package f_oop2;

public class SampleParent extends Object { 
	//아무것도 상속받지 않는 클래스는 전부 Object 클래스를 상속받고 있음 적혀있지 않으면 자동으로 상속.
	//Object class는 모든 클래스의 조상이라고도 한다.
	
	String var;
	
	{
		var = "초기화 블럭은 물려주지 않는다.";
	}
	
	SampleParent(){
		var = "생성자도 물려주지 않는다.";
	}
	
	int method(int a, int b){
		return a+b;
	}
}
