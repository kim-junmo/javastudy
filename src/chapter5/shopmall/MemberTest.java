package chapter5.shopmall;

public class MemberTest {

	public static void main(String[] args) {
		
		//클래스 사용법 → 객체생성
		//클래스로 만든 변수를 다른 변수들이랑 구분하기 위하여 객체라고 부른다.
		//클래스명 변수 = new 클래스명();
		//Member() : 클래스 이름으로 만든 메서드를 생성자라고 부른다.
		//new : 메모리 생성 능력을 가지고 있는 연산자라고 부른다, 힙영역에 클래스를 이용하여 메모리를 생성하는 기능.
		//Member mem = new Member(); 이걸 2줄로도 표현이 가능하다.
		//Member mem = null; : 클래스로 만든 객체는 스택(stack)영역에 공간(기억장소)이 생성됨
		//mem = new Member(); : 
		Member mem = new Member();
		System.out.println();
		
	}

}
