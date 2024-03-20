package chapter3.operator;

// 증가연산자 ++, --
// 변수 앞 또는 변수 뒤에 사용되는 냐에 따라 동작(해석)이 달라짐
public class OperatorEx2_2 {

	public static void main(String[] args) {
		// main 컨트롤 스페이스바를 누르면 메인메서드를 만들 수 있음
		
		int gameScore = 150;
		
		// 변수++ 뒤에 사용되면, 변수의 값을 먼저 읽어 좌측에 대입하고, 나중에 변수에 +1을 적용한다.
		int lastScore1 = gameScore++;
		System.out.println(lastScore1); // gameScore++; 150
		
		// 변수-- 뒤에 사용되면, 변수의 값을 먼저 읽어 좌측에 대입하고, 나중에 변수에 -1을 적용한다.
		int lastScore2 = gameScore--;
		System.out.println(lastScore2); // gameScore--151
	}

}
