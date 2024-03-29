package chapter11.classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//jdk에서 제공하는 클래스
//클래스 이름 : class 클래스
//class 클래스 사용법
public class StringCalssTest {

	public static void main(String[] args) throws ClassNotFoundException {

		//String.class의 구성요소를 참조가 가능해진다.
		Class strClass = Class.forName("java.lang.String"); // java.lang.String.class
		
		//이 데이터 안에는 STring 클래스의 생성자 정보를 다 확인할 수 있다.
		Constructor[] cons= strClass.getConstructors();
		
		for(Constructor c : cons) {
			System.out.println(c);
		}
		
		System.out.println();
		
		//String클래스의 필드 정보를 확인
		Field[] fields = strClass.getFields();
		for(Field f : fields) {
			System.out.println(f);
		}
		
		System.out.println();

		
		//String클래스의 메서드 정보를 확인
		Method[] methods = strClass.getMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
		
		System.out.println();
	}

}
