package chapter6.staticex;

public class StudentTest {

	public static void main(String[] args) {
		//JVM이 main()메서드를 호출하면서, 프로그램이 실행될 때,
		//Student클래스와 static 필드와 메서드를 이용하여,
		//static area에 메모리를 단 1번만 생성한다. 공유의 목적

		Student stu1 = new Student(); 
		//스택영역 : 힙영역에 생성된 주소를 저장 / 힙영역 : 실제 데이터를 저장
		stu1.setStudentName("손흥민");
		// static 메서드는 클래스명.메서드명()으로 호출해야 한다. 
		// 객체.메서드명()으로 호출은 되나, 사용 X 예>stu1.getSerialNum();
		System.out.println(Student.getSerialNum()); // 1로 출력
		
		Student stu2 = new Student();//스택영역과 힙영역에 메모리 생성
		stu2.setStudentName("김민재");
		System.out.println(Student.getSerialNum()); // 2로 출력
		
	}

}
