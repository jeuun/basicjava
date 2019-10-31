package e_oop;

public class JVM_Memory {
	/*
	 * << JVM 메모리 구조 >>
	 * - Method Area : 클래스가 저장된다
	 * - Call Stack : 현재 호출되어 있는 메서드가 저장된다.
	 * - Heap : 객체가 저장된다
	 * 
	 * 운영체제 -> 프로그램
	 * 운영체제 -> JVM -> 프로그램 //자바로 만들어진 프로그램은 한 단계를 거치기 때문에 느리다
	 * 							//어떤 운영체제라도 따로 코딩할 필요 없이
	 */
	
	/*
	 * << Method Area >>
	 * - Static
	 * - Math
	 * - System
	 * - PrintStream
	 * - ClassMember : classVariable, classMethod()
	 * 
	 * << Call Stack >>
	 * - main() : cm1
	 * - random() : 삭제
	 * - println() : 삭제
	 * - println() : 삭제
	 * - println() : 삭제
	 * 
	 * << Heap >>
	 * - cm1 = new ClassMember() : instenceVariable, instanceMethod
	 * - cm2 = new ClassMember() : instenceVariable, instanceMethod
	 */

}
