package chapter7.array;

//클래스배열, 객체배열을 만들기 위한 클래스
public class Book {

	//필드에서는 프라이빗을 사용
	private String bookName; //책 제목
	private String author; //저자

	//생성자를 하나도 만들지 않으면 컴파일 과정에서 자동생성이 된다.
	
	//Book() {} 
		//사용X 접근자가 default 의미가 생략됨.

	
	//생성자 중복정의
	//기본 생성자의 형태. 생산자는 리턴타입을 사용하지 않는다.
	public Book() {}
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author= author;
	}
	//getter / setter메서드 작성
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//일반메서드
	public void showBookName(String bookName) {
		this.bookName = bookName;
	}

	public void showBookInfo() {
		// TODO Auto-generated method stub
		
	}
	
	
}
