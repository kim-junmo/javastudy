package chapter8.inheritance2;

public class Dog extends Animal {

	@Override
	void run() {
		System.out.println("강아지가 달린다.");
	}

	@Override
	void cry() {
		System.out.println("강아지가 멍멍짖는다.");
	}
	


}
