package chapter7.otherarray;

import chapter7.array.Book;

public class BookTest {

	public static void main(String[] args) {

		//생산자의 접근자 이해때문에 작성.
		//default는 동일패키지 접근, 다른패키지 접근 불가
		//동일한 패키지는 default일 경우는 접근가능
		//다른 패키지는 public 경우에 접근가능.
		//public 패키지 상관없이 모두 접근 가능.
		Book b1 = new Book();

	}

}
