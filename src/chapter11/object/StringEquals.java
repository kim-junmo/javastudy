package chapter11.object;

//문자열 비교.
public class StringEquals {

	public static void main(String[] args) {
		
		//기본데이터타입 사용법처럼 사용가능. int a = 100;
		String name = "홍길동";
		
		//String은 클래스이므로, 참조타입처럼 사용
		String str1 = new String("abc");
		String str2 = new String("abc");

		// == 비교연산자는 주소값으로 비교하는 기능을 가지고 있다.
		System.out.println(str1 == str2); //false
		// object클래스의 equals()메서드를 String클래스가 힙영역의 값 비교로 재정의해서 제공되고 있다.
		System.out.println(str1.equals(str2)); //true
		
		//앞으로 데이터 비교시 
		/*
		 - 기본데이터타입은 ==로 비교
		 - 문자열데이터타입(String)은 equals()메서드를 사용
		 */
		
		int a = 100;
		int b = 100;
		
		//숫자 데이터 비교
		if(a == b) {
			System.out.println("a와 b는 데이터가 동일하다.");
		}else {
			System.out.println("a와 b는 데이터가 동일하지않다.");
		}
		String name7 = "손흥민";
		String name17 = "손흥민";
		
		//String클래스이므로 == 주소값 비교가 진행된다. 
		if(name7 == name17) {
			System.out.println("name7와 name17는 데이터가 동일하다.");
		}else {
			System.out.println("name7와 name17는 데이터가 동일하지않다.");
		}
		
		//재정의되어, 문자열 데이터 비교가 진행된다.
		if(name7.equals(name17)) {
			System.out.println("name7와 name17는 데이터가 동일하다.");
		}else {
			System.out.println("name7와 name17는 데이터가 동일하지않다.");
		}
		
	}

}
