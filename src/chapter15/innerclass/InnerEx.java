package chapter15.innerclass;

//내부클래스 : 클래스안에 클래스를 정의.
//내부클래스는 다른 클래스에서 사용하지 않을 때, 만들어서 사용할 수 있다.
//이 안에 메서드 명은 같거나 달라고 상관이 없다.
//윈도우 그래픽(GUI) 응용프로그램 혹은 자바 기반의 안드로이드 개발에서 자주 사용이 된다.

//외부클래스
class A {
	int a = 100;
	void methodA() {
		System.out.println(a);
	}
	//내부클래스
	//파일명도 A$B.class로 저장이 된다.
	class B {
		int x = 100;
		void methodB() {
			System.out.println(x);
			//A클래스의 멤버를 직접접근 가능.
			System.out.println(a);
			
			methodA();
			
			//내부클래스가 아니면 이렇게 사용해야함.
//			A a = new A();
//			System.out.println(a.a);
//			a.methodA();
		}
	}
//	B b = new B();
}



public class InnerEx {

	public static void main(String[] args) {
		

	}

}
