package chapter15.lambda;

public class TestStringConCat {

	public static void main(String[] args) {
		
		
		String s1 = "Hello";
		String s2 = "World";
		
		// 1)StringConcat인터페이스를 구현한 클래스를 객체생성하여 사용. (기본적인 사용방법)
		StringConCatImpl concat1 = new StringConCatImpl();
		concat1.makeString(s1, s2);
		
		// 2) 함수형 인터페이스이므로 람다식 문법으로 사용. 
		//StringConcat 함수형 인터페이스의 makeString() 추상메서드를 람다식 문법으로 구현
		//StringConcat concat2 = (String s1, String s2) -> {System.out.println(s1 + " , " + s2);};
		StringConcat concat2 = (s, v) -> System.out.println(s1 + ", " + s2);
		concat2.makeString(s1, s2);

		//3)익명 구현 객체로 사용 (일회성) : 다른 파일에서 아래 내용을 참조할 수 없다.
		StringConcat concat3 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + ", " + s2);
				
			}
		};
		
		concat3.makeString(s1, s2);
	}

}
