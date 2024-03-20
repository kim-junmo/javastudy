package chapter3.operator;

// 산술연산자 : +, -, *, /, %
public class OperatorEx1 {

	public static void main(String[] args) {
		
		int mathScore = 90;
		int engScore = 75;
		
		int totalScore = mathScore + engScore;
		//sysout + 컨트롤 스페이스바를 누르면 System.out.println();이게 만들어짐
		System.out.println(totalScore); // 165
		
		// int형끼리 연산하면 결과는 int가 된다. 
		//double avgScore = totalScore / 2; →→(int) totalScore / (int) 2; 
		// 82.5가 아닌 82.0으로 나옴
		// 즉, int끼리 계산이 되었으므로 소수점까지는 계산이 되지 않아 82로 나옴
		
		double avgScore = totalScore / 2.0; //해석 : (double)totalScore / 2.0;
		System.out.println(avgScore);

	}

}
