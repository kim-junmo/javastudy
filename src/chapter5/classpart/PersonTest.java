package chapter5.classpart;

public class PersonTest {

	public static void main(String[] args) {
		//person 클래스 사용할 것
		//데이터타입(class) 이름 = new 데이터타입(class)이름(); → 클래스를 사용하기 위한 규칙
		//Person클래스 → 사용 기억장소가 생성된 의미.m
		Person ps1 = new Person();
		
		// ps1객체가 가리키는 기억장소표현
		ps1.name = "홍길동";
		ps1.height = 180;
		ps1.weight = 75;
		ps1.gender = 'M';
		ps1.married = true;
		
		System.out.println("이름: " + ps1.name);
		System.out.println("신장(키): " + ps1.height);
		System.out.println("몸무게: " + ps1.weight);
		System.out.println("성별: " + ps1.gender);
		System.out.println("결혼여부: " + ps1.married);
		
		System.out.println("=====================");
		
		ps1.getPersonInfo();
		
		Person ps2 = new Person();
		ps2.name = "박지성";
		ps2.height = 174;
		ps2.weight = 74;
		ps2.gender = 'M';
		ps2.married = true;
		
		System.out.println("=====================");
		ps2.getPersonInfo();
		
		Person ps3 = new Person();
		ps3.name = "차두리";
		ps3.height = 183;
		ps3.weight = 91;
		ps3.gender = 'M';
		ps3.married = true;
		
		System.out.println("=====================");
		ps3.getPersonInfo();
		
		Person ps4 = new Person();
		ps4.name = "손흥민";
		ps4.height = 178;
		ps4.weight = 76;
		ps4.gender = 'M';
		ps4.married = false;
		
		System.out.println("=====================");
		ps4.getPersonInfo();
		
		Person ps5 = new Person();
		ps5.name = "황희찬";
		ps5.height = 173;
		ps5.weight = 80;
		ps5.gender = 'M';
		ps5.married = false;
		
		System.out.println("=====================");
		ps5.getPersonInfo();
		
		
	}

}
