package chapter10.interfaceex;

//implements 구현(재정의)
//구현클래스 : 인터페이스를 상속받아서 추상메서드까지 넣어둔 클래스
public class Dog implements Animal {
	
	

	@Override
	public void run() {
		System.out.println("강아지가 달린다.");
		
	}

	@Override
	public void cry() {
		System.out.println("강아지가 멍멍 짖는다.");
		
	}

}
