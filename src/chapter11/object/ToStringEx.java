package chapter11.object;

class Book /*extends Object*/ {
	
	//필드
	int bookNumber;
	String bookTitle;
	
	// 매개변수가 있는 생성자
	public Book(int bookNumber, String bookTitle) {
		super(); //부모클래스의 기본 생성자를 호출
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}





	//재정의 (Object 클래스 안에 있는 것을 재정의함)
	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookTitle=" + bookTitle + "]";
	}


}


//스프링에서 많이 사용할 작업
public class ToStringEx {

	public static void main(String[] args) {
		
		Book book1 = new Book(200, "개미");
		
		//toString()메서드를 재정의 안하면, object 클래스의 toString()메서드는
		//다음과 같이 출력된다. chapter11.object.Book@75a1cd57
		//재정의 한 경우에는 Book [bookNumber=200, bookTitle=개미]이게 출력된다.
		System.out.println(book1); //System.out.println(book1.toString());

	}

}
