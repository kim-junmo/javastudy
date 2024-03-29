package chapter11.classex;

public class Person {

	//필드2개
	private String name;
	private int age;
	
	//생성자 3개
	//기본생성자
	public Person () {}
	
	
	//String name; 필드를 사용하는 생성자.
	public Person(String name) {
		this.name = name;
	}
	
	//String name, int age; 2개 매개변수를 이용하는 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	//getter/setter
	public String getName() {
		return name;		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
