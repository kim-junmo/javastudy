package chapter11.classex;

// 리플랙션 : https://jeongkyun-it.tistory.com/225
//NewInstance() 메서드를 사용해 클래스 객체 생성하기.
public class NewInstanceTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		//Person 클래스 설계 (디자인) → 객체생성작업
		Person person1 = new Person();
		System.out.println(person1);
		
		//리플렉션 기법. "chapter11.classex.Person"를 이용하여, Person2객체 생성
		Class pClass = Class.forName("chapter11.classex.Person");
		Person person2 = (Person) pClass.newInstance();
		System.out.println(person2);
				
	}

}
