package chapter15.innerclass;


//외부클래스
class OutClass {
	//인스턴스 필드
	private int num = 10;
	
	//static이 없으면 인스턴스, static이 있으면 스테틱
	//스태틱 필드
	private static int sNum = 20; //객체생성 전(객체생성과 상관없이) 기억장소가 자동생성된다.	
	
	//내부클래스를 필드선언해서 사용가능
	private InClass inClass;
	
	//생성자
	public OutClass() {
		inClass = new InClass(); //내부클래스 객체 생성
	}
	
	
	//인스턴스 내부클래스 : 외부클래스(OutClass)의 맴버들을 직접 접근이 가능하다.
	class InClass {
		
		int inNum = 100;
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
		}
	}
	
	//일반매서드
	public void usingClass() {
		inClass.inTest();
	}
	
	//스태틱 내부클래스 2
	static class InStaticClass {
		
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
//			number += 10;// 외부 클래스의 인스턴스 변수는 사용할 수 없음
			System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수사용)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
			}
		
		static void sTest() {
			//외부클래스의 인스턴스 멤버는 사용 불가능
//			num += 10;
			//내부클래스의 인스턴스 멤버는 사용 불가능
//			inNum += 10;
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
		}
	}
}
public class innerTest {

	public static void main(String[] args) {
		
		//인스턴스 내부클래스 객체 생성을 할 수 있는 다양한 방법.
		
		//방법 1)
		OutClass outClass = new OutClass(); // OutClass()생성자가 호출되어, 그 안에서 내부 클래스 객체가 생성
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();
		System.out.println();
		
		//방법 2) 외부 클래스를 이용하여 내부 클래스 객체 생성하는 방법.
		OutClass.InClass inClass = outClass.new InClass();
		System.out.println("외부 클래스 변수를 이용하여 내부 클래스 생성");
		inClass.inTest();
		
		//스태틱(static) 내부클래스를 사용할 수 있는 방법
		//외부클래스 객체생성하지 않고 바로 정적 내부클래스 생성
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("정적 내부 클래스 일반메서드 호출");
		sInClass.inTest();
		System.out.println();
		
		// 스태틱멤버 접근: 클래스명.스태틱멤버 접근, 인스턴스 멤버 접급: 객체명.인스턴스멤버 접근
		System.out.println("정적 내부 클래스의 스태틱 메서드 호출");
		OutClass.InStaticClass.sTest();
	}

}
