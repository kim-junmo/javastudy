package chapter3.operator;

// 증가연산자 ++, --
// 변수 앞 또는 변수 뒤에 사용되는 냐에 따라 동작(해석)이 달라짐
public class OperatorEx2 {

	public static void main(String[] args) {
		// main 컨트롤 스페이스바를 누르면 메인메서드를 만들 수 있음
		
		int gameScore = 150;
		
		// ++변수 앞에 사용되면, +1을 변수에 적용한 후 값을 읽어온다.
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1); // ++gameScore; 151
		
		// --변수 앞에 사용되면, -1을 변수에 적용한 후 값을 읽어온다.
		int lastScore2 = --gameScore;
		System.out.println(lastScore2); // --gameScore150
	}

}
