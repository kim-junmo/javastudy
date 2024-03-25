package chapter6.coperation;

//학생의 통학수단으로 사용한 지하철 - 지하철 호선, 인원수, 수입
public class Subway {

	//필드
	public String lineNumber;
	public int passengerCount;
	public int money;
	
	//매개변수가 있는 생성자. // 지하철 노선을 초기화.
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money = money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println(lineNumber + "의 승객은 " + passengerCount + "명의고, 수입은" + money + "입니다.");
	}
}
