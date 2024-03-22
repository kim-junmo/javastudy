package chapter5.hiding2;

import chapter5.hiding.MyDate;

//default 필드는 다른 패키지에서 접근이 안된다.
public class MyDateTest {

	public static void main(String[] args) {
		//chapter5.hiding.MyDate 
		//다른 패키지에 있는 값을 가지고 올때 fm으로 사용하는 방법
		//다만 import chapter5.hiding.MyDate;을 사용하면 생략가능할수가있다.
		//import의 값은 자동으로 들어가기 때문에 mydate 스페이스바로 들어가면 된다.
		MyDate date1 = new MyDate();
		MyDate date2 = new MyDate();
		MyDate date3 = new MyDate();
		MyDate date4 = new MyDate();
		MyDate date5 = new MyDate();
		
		date1.day = 1; // public
		// date1.month = 10; //default
		
	}
}
