package chapter6.ThisEx;

//this 키워드
class BirthDay {
	//아래 3개의 필드는 접근자가 생략이 되어 있어 default라고 한다.
	//default는 동일한 패키지에서는 접근이 가능하다. (public)
	int day;
	int month;
	int year;
	
	//year 필드에 대한 setter메서드
	public void setYear(int year) {
		this.year = year;
	}
	
	//this : 힙 영역에 생성되는 BirthDay클래스 객체.
	public void printThis() {
		System.out.println(this);
	}
}

public class BirthDayTest {

	public static void main(String[] args) {
		
		BirthDay bDay = new BirthDay();
		
		//bDay.year = 2024;
		bDay.setYear(2024);
		
		System.out.println(bDay); //chapter6.ThisEx.BirthDay@75a1cd57
		bDay.printThis(); //chapter6.ThisEx.BirthDay@75a1cd57
	}

}
