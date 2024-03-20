package chapter4.loopexample;

//반복문 : for문
public class ForExample {

	public static void main(String[] args) {
		// 1~100까지의 합을 구하라
		// 변수를 처음 만들었을 때의 값, 정수형 데이터타입을 만들면 변수 값 0
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1~100까지의 합은? " + sum);

	}

}
