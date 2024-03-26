package chapter7.array;

//향상된 for문 배열
public class EnhancedForLoop {

	public static void main(String[] args) {
		
		//String배열 혹은 문자열 배열이라고 함.
		//출력하는 방법은 총 2개
		String[] strArray = {"인공지능", "머신러닝", "딥러닝"};
		
		//전통적인 for문으로 출력
		for(int i=0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		System.out.println("=============");
		//향상된 for
		for(String ai : strArray) {
			System.out.println(ai);
		}
	}
}
