package chapter10.interfaceinheritance;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass mClass = new MyClass();
		
		//다형성때문에 직접 해당 객체로 x()를 호출하지 않는다.
		//mClass.x(); 단 하나만 값을 호출할 시 
		
		//다형성
		//할아버지 인터페이스와 나(손자) 자신의 클래스 객체
		X xClass = mClass;
		xClass.x(); // 구현된 메서드 호출
		
		//부모 인터페이스와 나(아들) 자신의 클래스 객체
		MyInterFace iCalss = mClass;
		iCalss.myMethod();
		iCalss.x();
		iCalss.y();
		
	}

}
