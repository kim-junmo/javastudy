package chapter6.staticex;

//이 예제는 JVM이 운영체제로부터 메모리 활당을 위임받아서, 
//자바프로그램을 실행할 때, 사용되는 메모리의 영역을 학습하는 예제 
//static area(method area) : 정적영역, 클래스변수라고도 읽는다.
//책은 예제의 단숨함을 위하여, 필드의 접근자를 public을 사용했으나,
//실제 개발에서 필드는 pricate, public getter/setter 메서드를 사용한다. 
public class Student {

	//필드선언
	//필드가 private접근자일때만 getter / setter메서드를 정의한다.
	//문법 : 접근자[static선택] 데이타타입 변수;
	
	//자바프로그램이 실행될 때, JVM이 클래스의 내용을 보고, 
	//static 키워드를 사용하는 필드, 메서드에 대하여 static area 메모리를 단 한번만 생성한다. 
	
	//static 필드(정적필드)
	private static int serialNum; //static필드를 접근하는 메서드는 static이여야 한다.
	

	//인스턴스(instance) 필드 : Student stu1 = new Student(); 
	//객체생성구문이 실행이 될때만 stack, heap 영역의 메모리를 사용
	int studentId;
	private String studentName;
	private int grade;
	private String address;
	private int count;
	
	//getter 메서드 : studentName필드로 생성된 기억장소의 값을 읽어오기 위한 목적의 메서드 
	public String getStudentName() {
		return studentName;
	}
	
	// setter 메서드 : studentName필드로 생성된 기억장소의 값을 수정하기 위한 목적의 메서드
	// setter 메서드는 무조건 void이여야 한다. 
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	//3개의 필드에 대한 getter, setter 메서드 선언하기
	public int getGrade() {
		return grade;
	}
	
	//serialNum; 사용가능, static 필드 또는 메서드는 jvm이 자동으로 메모리를 생성해주기 때문, 
	//인스턴스 메서드가 호출이 된다면, 먼저 생성되어 있는 메모리 접근이 당연하므로 문제가 안된다.
	public void setGrade(int grade) {
		this.grade = grade;		
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	// static int serialNum
	public static int getSerialNum() {
		//static 필드는 클래스명.static필드로 기억장소에 접근한다.
		//studentName = "홍길동";
		serialNum++;
		return Student.serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		//static 필드는 클래스명.static필드로 기억장소에 접근한다.
		Student.serialNum = serialNum;
	}
}
