package chapter5.constructor;

public class PersonTest {

	public static void main(String[] args) {
		
		//Person(); 생성자 person.class안에 있는 코드가 실행됨.
		//Person p1 = new Person();
		Person p1 = new Person("홍길동");
		
		//생산자를 만들지 않았을 때
		//p1.height = 50f;
		
		//힙 영역에에 생성된 person class의 필드값을 확인
		System.out.println(p1.name); // null
		System.out.println(p1.height); // 0.0
		System.out.println(p1.weight); // 0.0
		// 이 값은 힙 영역에 저장이 됨
		
		Person p2 = new Person(50.0f);
		System.out.println(p2.height);
		//public Person(float h)여기 데이터 크기는 4byte이므로, 크기를 맞춰주어야함.
	}
}
