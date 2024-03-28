package chapter10.interfaceex2;

//최상위 부모인터페이스 : 상속목적으로 설계, 객체생성 불가능
public interface Calc {

	//구성요소
	//상수, 추상메서드, default 메서드, stati c메서드 - jdk 1.8
	//private 메서드 - jdk 1.9

	//상수, final, compile을 하면 public Final static 자동으로 붙는다.
	//예 > public Final static double PI = 3.14;
	double PI = 3.14; //상수는 어떤 특정 값을 부르기 위한 이름
	//PI = 7435413; 파이는 3.14가 고정이 되어 있기 때문에 오류가 발생함
	int ERROR = -99999999;
	
	//추상메서드, compile을 하면 public abstract 자동으로 붙는다.
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	//일반메서드는 사용불가능.
	/*
	public void methodA() {
		
	}
	*/
	//jdk1.8부터 default, static메서드가 지원
	default void description () {
		mymethod();
	}
	
	static void myStaticMethod() {
		
	}
	
	//jdk1.9부터 private 메서드가 지원 private 메서드는 접근불가.
	private void mymethod() {
		System.out.println("private 메서드 입니다.");
	}
}
