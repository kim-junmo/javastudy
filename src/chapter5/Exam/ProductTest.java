package chapter5.Exam;

public class ProductTest {

	public static void main(String[] args) {
		Product p1 = new Product(); //기본생성자
		System.out.println("p1의 제품의 이름은 ? " + p1.name);
		System.out.println("p1의 TV의 가격은 ? " + p1.price);
		
		
		Product p2 = new Product("TV", 500000); //매개변수가 있는 생성자
		System.out.println("p2의 제품의 이름은? " + p2.name);
		System.out.println("p2의 제품의 이름은? " + p2.price);

	}

}
