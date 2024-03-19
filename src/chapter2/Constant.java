package chapter2;

public class Constant {

	public static void main(String[] args) {
		// 상수와 리터럴
		
		//상수를 만드는 키워드 or 상수를 선언하는 키워드 = final
		//final 데이터타입
		//상수이름은 대문자로 작성하는 관례가 있음
		//굳이 안적어도 오류 발생은 되지 않음
		//규칙이 아닌 관례
		//상수이름으로 값을 변경할 수 없음. 주인공은 100이기 때문이다.
		final int MAX_NUM = 100; //final 키워드를 제외하면 변수라고 부른다.
		
		//MAX_NUM = 200; 상수는 값을 변경하면 오류가 발생된다.
		
		final int MIX_NUM;
		MIX_NUM = 0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIX_NUM);
	}

}
