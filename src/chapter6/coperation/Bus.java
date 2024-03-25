package chapter6.coperation;

//학생이 통학운송수단으로 사용한 버스- 버스번호, 승객수, 수입
public class Bus {

	public int busNumber; // 버스번호
	public int passengerCount; // 승객수
	public int money; // 버스 수입액
	
	//매개변수가 있는 생산자. 힙이라는 영역에 생성된 기억장소에 값을 먼저주고 시작하고 싶어서 만듬
	//셍성자를 만들 때 규칙은 생성자는 리턴타입은 없음, 생성자메서드이름은 클래스이름을 사용하라는 규칙이 있음
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	//버스에 승객을 태우는 기능
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	//버스의 수입액과 승객인원수 확인
	public void showInfo() {
		System.out.println("버스 " + busNumber + "번 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
	}
	
	
}
