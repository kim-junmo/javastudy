package chapter15.Stream2;

//스트림 AIP를 학습하기 위한 클래스
public class TravelCustomer {

	private String name;
	private int age;
	private int price;
	
	//3개 필드의 값을 사용하기 위한 생성자
	public TravelCustomer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}
	
	//3개 필드를 이용한 getter메서드
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getPrice() {
		return price;
	}

	//툴을 이용한 toString()메서드 재정의
	@Override
	public String toString() {
		return "TravelCustomer [name=" + name + ", age=" + age + ", price=" + price + "]";
	}
	
	
}
