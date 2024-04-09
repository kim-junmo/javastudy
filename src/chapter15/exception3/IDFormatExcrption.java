package chapter15.exception3;

//jdk에서 제공하는 예외관련 클래스들은 프로그래밍적인 관련 예외특징을 가지고 있다.
//사용자 정의 예외 - 기업체 업무적인 기능을 구현하면서 동작할때 발생되는 특징을 처리하기 위한 목적으로 만드는 클래스이다.

public class IDFormatExcrption extends Exception {

	//매개변수가 있는 생성자. 예외관련 메세지를 출력
	public IDFormatExcrption(String message) {
		super(message);
	}
}
