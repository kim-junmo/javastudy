package chapter5.classpart;

public class StudentVariable {

	public static void main(String[] args) {
		// 학생관련정보를 저장한다.
		// 학번, 이름, 학년, 주소지
		
		int studentId;
		String studentName;
		int grade;
		String address;
		
		studentId =1;
		studentName = "홍길동";
		grade = 4;
		address = "노원구";
		
		System.out.println("학번은? " + studentId);
		System.out.println("이름은? " + studentName);
		System.out.println("학년은? " + grade);
		System.out.println("주소는? " + address);
		
		int studentId2;
		String studentName2;
		int grade2;
		String address2;
		
		studentId2 =2;
		studentName2 = "손흥민";
		grade2 = 5;
		address2 = "성북구";
		
		System.out.println("학번은? " + studentId2);
		System.out.println("이름은? " + studentName2);
		System.out.println("학년은? " + grade2);
		System.out.println("주소는? " + address2);
	}

}
