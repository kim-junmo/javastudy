package chapter6.singleton;

//person으로 싱글톤 패턴이 적용된 예제를 작성하라
public class Person {

	private static Person instance = new Person();
	private Person() {};
	
	public static Person getInstance() {
		if (instance == null) {
			instance = new Person();
		}
		return instance;
	}
}
