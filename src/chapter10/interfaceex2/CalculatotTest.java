package chapter10.interfaceex2;

public class CalculatotTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.divide(num1, num2));
		System.out.println(calc.times(num2, num2));
		
		//디폴트 메서드 호출
		calc.description();
		
		//상수접근
		
		
	}

}
