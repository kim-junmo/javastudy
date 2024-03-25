package chapter6.singleton;

//디자인 패턴 중 싱글톤 패턴으로 구성하는 클래스이다.
//싱글톤 디자인 패턴의 목적 : 단 하나의 객체만 생성을 하고자 하는 목적.
public class Company {

	// 1. 클래스 안에서 자신을 private static 멤버로 객체생성.
	private static Company instance = new Company();

	// 2. 생성자를 디폴트 생선자로 생성되지 않게 하고, 프라이빗 접근자를 사용하라
	private Company() {};
	
	// 3. public getter메서드 정의 : 
	//instance가 private이므로 클래스 외부에서 접근이 막아져있어 getter 메서드 사용
	//프라이빗 클래스이기 때문에 instance을 위한 게터메서드를 생성
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
