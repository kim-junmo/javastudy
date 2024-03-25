package chapter6.singleton;

public class CompanyTest {

	public static void main(String[] args) {
		// com1 객체 생성
		
		//싱글톤 패턴 클래스로 객체생성 불가능
		//Company com1 = new Company(); : private Company이기 때문에 생성자 사용 X
		//static성격이기 때문에 객체가 힙, 스택 영역에 있지 않고 스테이틱 영역에 있어서 사용불가.
		// com1, com2, com3은 미리생성된 동일한 객체의 주소를 갖게 된다.
		//싱글톤 클래스는 getInstance를 자주 사용한다.
		Company com1 = Company.getInstance();
		Company com2 = Company.getInstance();
		Company com3 = Company.getInstance();
		
		System.out.println(com1 == com2); // true
	}
}
