package chapter6.reference2;


public class PrductTest {
	public static void main(String[] args) {
		Product p1 = new Product("Tv", 500000);
		
		Product p2 = p1;
		//힙 영역의 주소가 p1에 의하여 p2에 복사가 되서, 힙영역의 기억장소를 공유하게 된다.
		
		p2.price = 100000;
		System.out.println("p1.price필드의 값은? " + p1.price); // 100000
	}
}
