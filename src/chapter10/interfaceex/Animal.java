package chapter10.interfaceex;

//인터페이스
//추상메서드 목적으로 존재하는 것이다.
//객체생성 불가능하다.
//상속을 목적으로 한다.
public interface Animal {

	//필드, 메서드 사용 불가능
//	String head;
//	int glass;
	
//	void methodA() {}
	
	void run(); //(public abstract) void run();
	
	void cry(); //(public abstract) void cry();
}
