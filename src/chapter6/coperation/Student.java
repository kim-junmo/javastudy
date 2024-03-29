package chapter6.coperation;

public class Student {

	//bus, subway 클래스를 먼저 작업하고, student클래스를 이후에 작업해야한다.
	public String studentName;
	public int grade;
	public int money;
	
	//매개변수가 있는 생성자.
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	//학생이 이용하는 교통수단
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}
}
