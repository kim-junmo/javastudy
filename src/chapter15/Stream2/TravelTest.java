package chapter15.Stream2;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		
		/*
		객체이름 이름, 나이, 여행비용
		customerLee "이순신", 40, 100
		customerKim "김유신", 20, 100
		customerHong "홍길동", 13, 100
		*/
		
		TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("김유신", 20, 80);
		TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);
		
		//list컬렉션 구현클래스 ArrayList 사용 customerlist 이름으로 위의 객체를 3개추가 작성

		List<TravelCustomer> customerlist = new ArrayList<TravelCustomer>();
		customerlist.add(customerLee);
		customerlist.add(customerKim);
		customerlist.add(customerHong);
		
		System.out.println("--- 고객명단 추가된 순서대로 출력 ---");
		System.out.println();
		//map() : 객체일부를 참조할 때 사용한다.
		customerlist.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		
		System.out.println();
		
		System.out.println("--- 고객나이를 추가된 순서대로 출력 ---");
		System.out.println();
		customerlist.stream().map(c -> c.getAge()).forEach(age -> System.out.println(age));
		
		System.out.println();
		
		System.out.println("--- 고객 여행비용을 추가된 순서대로 출력 ---");
		System.out.println();
		customerlist.stream().map(c -> c.getPrice()).forEach(pr -> System.out.println(pr));
		
		System.out.println();
		
		System.out.println("--- 고객 총 여행비용을 추가된 순서대로 출력 ---");
		System.out.println();
		//총 여행비용 (100+80+50=230)
		int total_price = customerlist.stream().mapToInt(c ->  c.getPrice()).sum();
		System.out.println("총 여행비용: " + total_price); // 230
		
		System.out.println();
		
		System.out.println("--- 나이가 20세이상인 고객명단을 정렬하여 출력 ---");
		//조건을 이용할 때 stream API 작업
		System.out.println();
		customerlist.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
	}

}
