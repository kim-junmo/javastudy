package chapter7.array;

public class BookArray1 {

	public static void main(String[] args) {
		
		//stack 영역에 주소 → 힙 영역에 데이터
		// 메모리 구조 표현
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
		//위 3줄과 같은 의미임.
		//클래스 배열, 객체배열
		//stack 영역에 주소 → 힙영역에 주소 → 힙 영역에 데이터
		// 메모리 구조 표현
		Book[] bookArray = new Book[3]; // 이 줄의 의미는 힙영역에서 실제 데이터가 생성되는 주소를 참조하는 기억장소
		bookArray[0] = new Book(); //실제 데이터가 관리되는 힙영역의 기억장소 생성작업.
		bookArray[1] = new Book();
		bookArray[2] = new Book();
		
		
	}

}
