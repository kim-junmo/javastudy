package chapter10.interfaceex;

//인터페이스를 상속받는 클래스는 implements를 사용해야한다.
public class Cat implements Animal {

	//부모인터페이스의 추상메서드를 구현한다.(구현메서드), 재정의메서드라고도 부른다.
	@Override
	public void run() {
		System.out.println("고양이가 달린다.");

	}

	@Override
	public void cry() {
		System.out.println("고양이가 야옹하며 운다.");

	}

}
