package f_oop2;

public class SampleChild extends SampleParent {
	
	int var; //지금 한 클래스의 두 개의 같은 이름의 변수를 사용중이지만 컴파일 에러는 나타나지 않는다.
	//두 개를 구분할 방법 : super
	
	SampleChild(){
		super(); // 부모 클래스의 생성자를 호출하기 위해 사용한다.
		//this();
		
	}
	
	void test(double var){
		System.out.println(var); //지역변수 - 이름이 같을 경우 지역변수 우선
		System.out.println(this.var); //인스턴스 변수
		System.out.println(super.var); //부모클래스의 인스턴스 변수
		//super : 부모 클래스의 멤버와 자식 클래스의 멤버가 이름이 중복될대
		//둘을 구분하기 위해 사용한다.
		System.out.println(this.method(10,20));
		System.out.println(super.method(10,20));
	}
	
	void childMethod(){
		//상속받은 변수와 메서드를 사용할 수 있다.
		System.out.println(var); //상속받은 변수
		int result = method(7, 13); //상속받은 메서드
		System.out.println(result);
	
	}
	
	//메인 메서드 만드는 법 : main이라고 치고 ctrl space
	public static void main(String[] args) {
		SampleChild sc = new SampleChild();
		
		sc.childMethod();
		
		System.out.println(sc.var);
		int result = sc.method(7,13);
		System.out.println(result);
		
		sc.test(10);
		
		SampleParent sp = (SampleParent)new SampleChild(); // 자식클래스에서 부모클래스로 형변환 Up-casting(생략가능)
		System.out.println("sp.var : " + sp.var); //부모클래스
		System.out.println("sc.var : " + sc.var); //자식클래스 
		System.out.println("sp.method() : " +sp.method(5, 10));
		System.out.println("sc.method() : " +sc.method(5, 10));
		//오버라이딩 하게 되면 부모 클래스의 메서드는 무시된다.
		SampleChild s = (SampleChild)sp; //부모클래스에서 자식클래스로 형변환 Down-casting(생략불가)
		s.childMethod();
	}
	
	//상속받은 메서드를 변경하고 싶을때 오버라이딩 할 수 있다.
	
	//오버라이딩 : 상속받은 메서드의 내용을 재정의 하는 것.
	@Override //어노테이션
	int method(int a, int b){ //리턴타입 메서드명 파라미터 모두 같아야 한다.
		return a * b;
	}
	
}
