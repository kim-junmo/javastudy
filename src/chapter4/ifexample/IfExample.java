package chapter4.ifexample;

//단일 if문
public class IfExample {
	public static void main(String[] args) {
		//true, false를 가지게 되는 변수는 is로 시작하는것이 관습
		boolean isMarried = true;
				
		if(isMarried) {
			System.out.println("기혼입니다.");
			}
		boolean isEven;
		int num = 10;
				
		// 해석 : (num % 2 == 0) 코드가 true이면 true가 대입되고 아니면 false가 대입된다.
		// % 나머지 연산자 : 10을 2로 나누면 5가 되고 나머지는 0이 됨 / 11을 2로 나누면 값은 1, 11을 3으로 나누면 값은 2가 된다.
		isEven = (num % 2 == 0) ? true:false;
		System.out.println(isEven);
	}
}
