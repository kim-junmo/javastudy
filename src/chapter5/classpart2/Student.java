package chapter5.classpart2;

//Student 클라스에 main() 메서드 사용하기.
public class Student {

	//학생정보
	//필드
	int studentID;
	String studentName;
	int grade;
	String address;
	
	//메서드
	//기억장소에 있던 내용을 읽어오고자 하는 메서드
	public String getStudentName() {
		
		return studentName;
	}
	
	//Student클래스의 멤버가 아니다.
	//학생 정보와 상관없이 별도로 작동한다.
	//일반적으로 main()메서드는 독립적인 파일로 사용한다.
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.studentName = "홍길동";
		
		// "홍길동"이 저장된 데이터를 출력하는 방법이 2가지가 있음
		System.out.println(stu1.studentName); //필드를 사용하는 방법
		System.out.println(stu1.getStudentName()); //메서드를 사용하는 방법

	}

}
