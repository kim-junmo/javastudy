package chapter5.classpart;

//메서드 만드는 방법, 메서드 정의하기
//메서드 : 기능을 구현하는 코드로 구성이 되어 있는 것을 메서드로 부른다.
//메서드 기본구조
	/*
	 리턴타입 메서드이름 (매개변수 선언) {
	 ***
	 ***
	 ***
	 reture 사용 유무;
	 }
	*/
public class FunctionTest {
	
	//main()메서드 : 자바에서 프로그램을 실행하기 위한 목적으로 만들어 준것.
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		
		int sum = add(n1, n2);
		System.out.println(n1 + " + " + n2 + " = " + sum + "입니다.");
		
		int nu1 = 10;
		int nu2 = 20;
		
		int sub = substract(nu1, nu2);
		System.out.println(nu1 + " - " + nu2 + " = " + sub + "입니다.");
		
		int mul = multyply(n1, n2);
		System.out.println(n1 + " * " + n2 + " = " + mul + "입니다.");
		
		double div = divide(nu1, nu2);
		System.out.println(nu1 + " / " + n2 + " = " + div + "입니다.");
		
		// 이렇게도 사용할 수 있음
		System.out.println(nu1 + " / " + n2 + " = " + divide(nu1, nu2) + "입니다.");

	}
	
	

	//정수형 숫자 2개의 값을 매개변수로 제공받아 더한 값을 리턴하는 메서드.
	// 정수형에서 가장 많이 사용되는 명령어는 int / 실수형은 double
	// 예> 10 + 20 = 30
	//public static 리턴타입
	public static int add(int num1, int num2) {
		
		//2개의 값을 더하는 코드 작성.
		int result = num1 + num2;
		
		return result;
	}
	
	// 뺄셈
	public static int substract(int num1, int num2) {
		
		int result = num1 - num2;
				
		return result;
	}
	
	// 곱셈
	public static int multyply(int a, int b) {
		int result = a * b;
		return result;
	}
	
	// 나눗셈
	
	public static double divide(int num1, int num2) {
		
	//double result = num1 + num2 / 2; 우선순위에 문제가 발생하기 때문에 이렇게 작성 X
	//정수끼리 연산하면 결과는 정수 예> 정수 + 정수 = 정수
	//정수와 실수끼리 연산하면 결과는 실수 예> 정수 + 실수 = 실수(형변환 때문) 해석 : (실수데이터타입)정수 + 실수 = 실수
	//실수끼리 연산하면 결과는 실수 	예> 실수 + 실수 = 실수
		double result = (num1 + num2) / 2.0; 
		
		return result;

	}
}