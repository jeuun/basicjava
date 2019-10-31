package f_oop2.ex_abstract;

public abstract class Animal {
	
	void run(){
		System.out.println("달려간다아아");
	}
	
	abstract void bark();
	

}

class Dog extends Animal{

	@Override
	void bark() {
		System.out.println("멍멍멍");
		
	}
	
}

class Cat extends Animal{

	@Override
	void bark() {
		System.out.println("냥냥냥");
		
	}
	
}

class Pig extends Animal{

	@Override
	void bark() {
		System.out.println("꿀꿀꿀");
		
	}
	
}