package chapter15.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//스트림 예제 : 컬렉션에 스트림 기능을 사용.
//추가, 읽기, 제거 메서드 
public class ArrayListStreamTest {

	private static Iterable<String> stream;

	public static void main(String[] args) {
		
		// list컬렉션
		List<String> sList = new ArrayList<String>(); // 구현클래스를 사용해야함.
		sList.add("손흥민");
		sList.add("김민재");
		sList.add("이강인");
		
		//1) 일반for문. ArrayList클래스는 컬렉션 형태의 기억장소를 0,1,2 등의 인덱스 형태로 관리
		for(int i=0; i<sList.size(); i++) {
			
			//정렬작업을 하고 싶으면 if문으로 작업
			System.out.println(sList.get(i));
		}

		System.out.println();
		
		//2) 향상된 for문
		//for(변수선언 : 배열 또는 컬렉션) {
		for(String s : sList) {
			System.out.println(s);
		}
		System.out.println();
		
		//3) 스트림 사용
		//3-1)컬렉션객체의 데이터를 순차적으로 출력
		//forEach(Consumer<T> 함수형 인터페이스)
		//매개변수를 사용하고 리턴을 하지 않는 함수형태로 이용한다)
		Stream<String> stream = sList.stream(); // 컬렉션 객체.stream()
		//stream.forEach(람다식문법);
		//for문과 동일
		stream.forEach(s -> System.out.println(s + " "));
		
		System.out.println();
		
		//3-2)컬렉션 객체의 데이터를 순차적으로 정렬.
		//sorted()메서드가 지원되지 않으면, for문 안에서 대소 비교하여, 정렬코드작업을 해야만한다.
		sList.stream().sorted().forEach(s -> System.out.println(s + ""));
	}

}
