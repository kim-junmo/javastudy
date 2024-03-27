package chapter8.inheritance2;

public class Cat extends Animal {


//run()메서드의 내용을 내 클래스의 용도에 맞게 새롭게 구성
//overriding : 상속관계에서 부모클래스의 메서드명 그대로 사용하여, 내용을 재구성하는 작업 
	
	@Override
	void run() {
		//새로운 작업
		//super.run();는 부모클래스 내용을 호출.
		System.out.println("고양이가 달린다.");
	}

	@Override //@이름 : Annotation이라고 함
	void cry() {
		//새로운 작업
		System.out.println("고양이가 야옹야옹한다.");
	}
	
	void method1() {
		super.run();
	}
}
