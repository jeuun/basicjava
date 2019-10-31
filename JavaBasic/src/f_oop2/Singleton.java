package f_oop2;

//싱글톤 패턴 :  객체의 생성을 제한하여 하나의 객체만 사용하게 하는 디자인 패턴
//객체들 간에 객체를 공유하기 위해 사용한다.


public class Singleton {
	
	private static Singleton instance;
	
	//생성자의 접근제어자를 private으로 만들어 다른 클래스에서 객체 생성하는 것을 막는다.
	private Singleton(){ //외부에서 접근하지 못하게 private
		
	}
	
	public static Singleton getInstance(){ //getInstance 객체 생성 메서드 , static은 객체생성 하지 않고 사용할때 사용한다.
		//static은 객체들간에 객체를 공유하기 위하여 사용한다.
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
	
}
