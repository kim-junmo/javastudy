package chapter11.string;

//문자열 데이터를 관리하는 클래스
//1)String
//2)StringBuliderTest
//3)StringBuffer클래스
//String클래스와 StringBuliderTest클래스의 데이터 관리의 다름점
public class StringBuliderTest {

	public static void main(String[] args) {
		
		String str1 = "";
		
		//String클래스로 문자열을 연결작업을 하면, 새로운 기억장소를 생성하여 관리한다.
		//for문이 돌때마다 1 / 1,2/ 1,2,3 이처럼 기억장소가 만들어짐.
		for(int i=1; i<=10; i++) {
			str1 += i + " 번째 문자열\n";
			System.out.println(System.identityHashCode(str1));
		}
		
		System.out.println(str1);

		System.out.println("=================");
		
		//처음 생성된 힙영역에 기억장소를 이용하여, 문자열데이터가 관리된다.(이런 경우에는 성능이 좋다)
		//for문이 돌때 같은 기억장소에서 값이 출력된다.
		StringBuilder sb = new StringBuilder("시작");
		
		for(int i=1; i<=10; i++) {
			sb.append(i + "번째 문자열\n");
			System.out.println(System.identityHashCode(sb));
		}
		System.out.println(sb);
	}

}
