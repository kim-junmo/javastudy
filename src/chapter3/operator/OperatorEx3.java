package chapter3.operator;

// 관계연산자 : >, <, ==, >=, <=, !=
// 논리연산자 : &&(논리곱 and), ||(논리합 or), !(부정)
public class OperatorEx3 {
	
	// && 논리 and연산자
	// 2개의 입력조건이 true일때만 결과가 true가 된다.
	// 1개라도 입력조건이 false가 되면 결과가 false가 된다.
	// 좌측의 false이면, 우측의 코드는 실행되지 않게 설계가 되어져있다. (규칙)
	
	// || 논리 or연산자
	// 2개의 입력조건이 true일때만 결과가 true가 된다.
	// 1개라도 입력조건이 true가 되면 결과가 true가 된다.
	// 2개의 입력조건이 false일때만 결과가 false가 된다.
	// 좌측의 코드가 true이면, 우측의 코드는 true or false든 상관없이 결과가 true값으로 설계가 되어져있다. 우측코드는 실행되지 않는다. (규칙)
	// 좌측값이 true면 어차피 값이 true가 되기 때문에 우측코드는 실행되지 않는다. (규칙)
	
	// 코드가 실행을 할려면 main()메서드 안에 작성되어야 한다.
	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value = (num1 = num1 +10) < 10 && (i = i + 2 ) < 10;
		//boolean value = [(num1 = num1 +10) < 10] && [(i = i + 2 ) < 10;]
		//위에 코드가 어떻게 동작이 되는지 이해하기 위해 위 변수의 값을 출력한다.
		//[(num1 = num1 +10) < 10] → (num1=10+10) <10 → false / num1=20
		//[(i = i + 2 ) < 10;] → (i = 2+2) <10 → true / i = 2 (좌측의 코드가 false이기 때문에 실행x)
		// false && true → false 
		
		System.out.println(value); // false
		System.out.println(num1); // 20
		System.out.println(i); //우측의 코드가 실행이 되면 i변수값은 4가 되지만, 실행이 되지 않는 규칙 때문에 i변수값은 2로된다.

		System.out.println("====================================================================");
		
		value = (num1 = num1 + 10) > 10 || (i = i + 2 ) < 10;
		System.out.println(value); //true
		System.out.println(num1); // 30
		System.out.println(i); // 2 우측의 코드가 실행이 되면 i변수값은 4가 되지만, 실행이 되지 않는 규칙 때문에 i변수값은 2로된다.
	}

}
