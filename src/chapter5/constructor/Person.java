package chapter5.constructor;

//생성자 예제 (constructor)
//constructor : 생선자
public class Person {
	
	//필드
	String name;
	float height;
	float weight;
	
	//생성자
	//컴파일 과정에서 person.class파일에 기본 생성자(byte코드)가 자동생성된다.
	
	//생성자를 만들 수 있음
	//생상자 메서드 이름을 만들때는 클래스 이름을 사용해야 한다.(규칙)
	/*
	public 생성자이름름(클래스명을 사용해야됨)() {
	}
	*/
	//생산자를 수동으로 정의하면, 
	//컴파일 과정에서 Person.class 파일에 기본생성자가 자동으로 생성이 안된다.
	
	/*public Person() {
		//생상자를 수동으로 정의를 하는 이유는 코드를 작성하려는 목적이 있음
		System.out.println("생산자 호출");
	}*/
	//매개변수가 있는 생상자를 정의하면, 
	//컴파일 과정에서 Person.class 파일에 기본생성자가 자동으로 생성이 안된다.
	//힙영역에 생성된 기억장소에 값을 주고자 할때 사용한다. 
	public Person(String n) {
		name = n;
	}
	public Person(float h) {
		height = h;
		
	}
}
