package chapter11.object;

//해시코드(HashCode)
//객체의 해시코드값 확인하기.
//해시코드란 힙영역의 생성된 주소를 참조하는 값이다.
public class HashCodeTest {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");

		//객체의 해시코드값 확인하기.
		//해시코드값을 이용하여, 힙영역의 주소를 참조한다.
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
	}

}
