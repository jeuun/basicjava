package f_oop2.access;

import f_oop2.AccessModifier;

public class AccessTest extends AccessModifier {

	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
/*		System.out.println(am.protectedVar);
		am.protectedMethod();*/
	}
	
	void protectedTest(){
		System.out.println(protectedVar); // 밖에서 접근이 어렵지만 안에서 내 것처럼 사용이 가능.
		protectedMethod();
		
/*		System.out.println(defaultVar);
		defaultMethod();
		
		System.out.println(pricateVar);
		privateMethod();*/
	}

}
