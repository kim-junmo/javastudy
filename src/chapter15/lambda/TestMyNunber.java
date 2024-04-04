package chapter15.lambda;

//인터페이스를 이용한 구현클래스
class Test implements MyNumber {

	@Override
	public int getMax(int num1, int num2) {
		if(num1 > num2) {
			return num1;
		}else {
			return num2;
		}
	}
	
}
	
public class TestMyNunber {
	
	public static void main(String[] args) {
		
		//방법 1) 인터페이스를 설계하고, 상속받아 구현클래스를 만들고 사용하는 기본적인 형태
		Test t1 = new Test();
		System.out.println(t1.getMax(10,20));
		
		//방법 2) 함수형 인터페이스일 경우에만 람다식 문법으로 추상메서드를 구현할 수 있다.
		//함수형 인터페이스의 추상메서드를 람다식 문법으로 표현
		/*
		 인터페이스 변수 = 추상메서드를 구현한 람다식 문법 코딩
		 */
		//MyNunber max = 람다식으로 getMax() 추상메서드를 구현작업;
		//MyNunber max = (int x, int y) -> { return (x >= y) ? x: y;}; 타입과 중괄호, return은 생략가능
		MyNumber max = (x, y) -> (x >= y) ? x: y;
		System.out.println(max.getMax(10, 20));
	}

}


