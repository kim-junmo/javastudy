package chapter8.inheritance2;

public class Lion extends Animal {

	//메서드 오버라이딩(재정의)
	@Override
	void run() {
		System.out.println("사자가 달린다.");
	}

	@Override
	void cry() {
		System.out.println("사자가 운다.");
	}
	
	//일반메서드 추가
	void play() {
		System.out.println("사자가 운동을 한다.");
	}

	void method2() {
		super.cry();
	}

	void method3() {
		super.run();
	}
}


