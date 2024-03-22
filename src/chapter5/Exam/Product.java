package chapter5.Exam;

public class Product {
	String name;
	int price;
	
	//여러개의 생성자를 정의 가능하게 하는 문법? 메서드 오버로딩(method overloading)
	//동일한 생성자를 중복 정의하는 문법
	//규칙 : 매개변수의 개수와 데이터타입을 다르게 해야한다.
	//기본생성자.
	Product() {}
	
	//매개변수가 있는 생성자.
	Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
}
