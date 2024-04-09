package chapter15.exception;

class Person {
	
	int a;
	
}




public class NullException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person ps = null;
		
//		ps = new Person(); // 이 구문이 실행이 되어야 힙 영역에 int a에 대한 기억장소가 생성된다.
		
		try {
		System.out.println(ps.a); //힙 영역에 ps.a 기억장소가 존재하지 않아, 없는 기억장소를 접근하고 있어 실행시 오류발생.
		}catch(NullPointerException ex) { //예외클래스 중 가장 상위 클래스인 Exception을 사용해도 됨.
			System.out.println(ex);
			System.out.println("예외발생");
		}
		System.out.println("프로그램 종료");
		
	}

}
