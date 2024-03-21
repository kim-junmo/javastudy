package chapter5.classpart2;

public class StudentTest1 {

	public static void main(String[] args) {
		
		/*
		메모리구조 : https://lucas-owner.tistory.com/38
		운영체제로부터 JVM 메모리 할당을 위임받아서 메모리를 여러개의 영역으로 나누어 관리한다.
		메모리 영역 : 여려개로 나누어진다.
		1>stack Area 2> Heap Area 3>method Area(static Area) 암기할 것 
		
		 - stack Area : 
		메서드 안에 변수 및 매개변수를 선언하거나, 메서드가 실행이 될때 변수 및 매개변수의 이 영역에 기억장소가 생성,
		또 Student stu1; 클래스로 객체를 선언하면, 이 영역에 기억장소가 생성
		 - Heap Area : 클래스로 객체를 선언하고 실행이 될때 이 영역에 기억장소가 생성,
		  			   new키워드가 클래스의 내용을 가지고 이 영역에 기억장소가 생성
		*/
		//기본데이터 타입 8개 정수형 : byte, short, int, long 실수형 : float, double 논리형 : boolean
		//기본데이터 타입을 이용하여 메서드안에서 변수를 선언하면, 기억장소는 스택영역에 생성한다. 
		//클래스로 변수(객체)로 선언하면, 스택영역에 4바이트로 생성한다.
		//생선된 기억장소에는 앞으로 힙영역에 생성될 주소가 저장된다.
		//스택 영역에 생성된 기억장소에는 차후에 생성될 힙영역의 주소가 저장이 된다.
		//예> Person ps1; pa1 객체에 null이 초기값으로 갖게 된다.
		int a = 10; // stack area에 생성된다.
		char b = '가'; // stack area에 생성된다.
		
		//객체생성 : new 키워드.
		//new 키워드 : 힙영역의 공간에 메모리(기억장소)를 생성하는 연산자. 
		//Student stu1(객체선언) 
		//stu1 = new Student();(객체생성)
		//new [Student();] : 생성자 
		Student stu1 = new Student(); 
		stu1.studentName = "손흥민";
		
		Student stu2 = new Student();
		stu2.studentName = "황의찬"; 
		
		// [chapter5.classpart2](패키지명).[Student](클래스명)[@75a1cd57](주소값)
		//주소값을 해시코드(hash code) 값이라고도 한다.
		System.out.println(stu1); //chapter5.classpart2.Student@75a1cd57
		System.out.println(stu2); //chapter5.classpart2.Student@515f550a

		
		}

}
