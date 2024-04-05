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

		System.out.println(Arrays.stream(greatings).reduce("", (s1, s2) -> {
			//배열이라는 것을 이용하여 스트림을 작업하고 싶으면 Arrays.stream(배열)을 사용해야된다.
			//reduce는 비교목적 / s1 : 안녕하세요 / s2 : hello
			//람다식 문법 작업
			System.out.println("데이터 " + s1);
			System.out.println("데이터 " + s2);
			
			if(s1.getBytes().length >= s2.getBytes().length) return s1;
			else return s2;
		}));
	}

}
