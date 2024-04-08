package chapter15.Stream;

import java.util.Arrays;

//Stream클래스의 reduce()메서드 사용하기
//개발자가 기능을 직접 구현작업

//배열을 스트림클래스 사용하기
//사용법 : Arrays.stream(배열) / 컬렉션 : 컬랙션 객체. stream()
//reduce()메서드 : 컬렉션의 요소들의 값을 비교하고자 할때 사용.
public class ReduceTest {

	public static void main(String[] args) {

		String[] greatings = {"안녕하세요~~", "Hello", "Good Morning", "반갑습니다."};

		//위의 String배열을 대상으로 stream API 작업을 할 경우에는 Arrays.stream(String 배열)
		
		System.out.println(Arrays.stream(greatings).reduce("", (s1, s2) -> {
			
			/*
			 s1 매개변수에 ""에 대입이 되고, s2 매개변수에 "안녕하세요~~" 대입이 된다.
			 
			 s1의 바이트길이와 s2의 바이트길이를 if문에서 대소 비교하여, 큰 길이의 문자열을 s1에 저장하고
			 s2에는 2번째 문자열을("hello")를 대입한다.
			 그리고 다시 바이트 길이 대소비교하는 것을 반복한다.
			 */
			
			/*
			//배열이라는 것을 이용하여 스트림을 작업하고 싶으면 Arrays.stream(배열)을 사용해야된다.
			//reduce는 비교목적 / s1 : 안녕하세요 / s2 : hello
			//람다식 문법 작업
			System.out.println("데이터 " + s1);
			System.out.println("데이터 " + s2);
			
			System.out.println("s1: " + s1.getBytes().length);
			System.out.println("s2: " + s2.getBytes().length);
			*/
			
			if(s1.getBytes().length >= s2.getBytes().length) return s1;
			else return s2;
		}));
	}

}
