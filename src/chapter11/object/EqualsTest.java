package chapter11.object;

class Student /* extends Object */ {
	int studentID;
	String studentName;
	
	public Student(int StudentID, String studentName) {
		//super(); 컴파일하면, 자동생성됨.
		this.studentID = StudentID;
		this.studentName = studentName;
	}
	
	//패키지명, 클래스명@주소(참조)값 출력
	/*@Override
	public String toString() {
		// TODO Auto-generated method stub
		return studentID + ", " + studentName;
	}*/

	@Override
	public int hashCode() {
		System.out.println("hashCode()");
		return super.hashCode(); //주소값
		//return studentID; //손흥민의 등넘버값 7
	}

	// st1.equals(st3)
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()메서드");
//		return super.equals(obj); 주소값 비교
		//st1과 st3의 객체가 가리키는 힙영역의 데이터를 비교하는 구문.
		if(obj instanceof Student) {
			Student std = (Student) obj;
			//힙영역의 데이터값 비교
			if(studentID == std.studentID && studentName.equals(std.studentName))
				return true;
				else
					return false;
		}
		return false;
	}
}



public class EqualsTest {

	public static void main(String[] args) {
		
		Student st1 = new Student(7, "손흥민");
		Student st2 = st1; //객체의 주소가 대입된다.
		//stack영역에 4바이트가 생성된 후 값은 null상태, 힙 영역에 7과 손흥민이 들어간 상태
		//힙 영역의 주소가 100이다. 39번 라인이 진행이 되면 스택 라인이 2개(st1, st2)로 만들어 지는데, 이 2개의 주소가 동일하게 됨.
		// 즉 힙 영역의 100,손흥민은 스택 영역의 st1, st2가 같이 관리가 된다.
		Student st3 = new Student(7, "손흥민");
		
		//st1객체의 주소와 st3객체의 주소는 다르다.

		//주소비교
		if(st1 == st2) {
			System.out.println("st1과 st2는 주소가 동일하다.");
		}else {
			System.out.println("st1과 st2는 주소가 동일하지않다.");
		}
		
		//equals()메서드 : object클래스에서도 주소값으로 비교.
		if(st1.equals(st2)) {
			System.out.println("st1과 st2는 주소가 같습니다.");
		}else {
			System.out.println("st1과 st2는 주소가 같지않습니다.");
		}
		
		//주소비교
		if(st1 == st3) {
		System.out.println("st1과 st3는 주소가 같습니다.");
		}else {
		System.out.println("st1과 st3는 주소가 같지않습니다.");
		}
		
		//equals()메서드 : object클래스에서도 주소값으로 비교하지 말고
		//객체가 참조하는 힙영역의 데이터로 비교하여 판단할 수 있도록 equals()메서드를 재정의한다.
		if(st1.equals(st3)) {
		System.out.println("st1과 st3는 주소가 동일하다.");
		}else {
		System.out.println("st1과 st3는 주소가 동일하지않다.");
		}
		
		/*
		 정리
		 객체가 힙영역에 가지고 있는 정보(데이터)가 동일한 데이터라고 간주하고 싶다면
		 객체비교시 내부적으로 object클래스의 equals()메서드와, hushCode()메서드가 동작된다. (주소값으로 비교)
		 객체가 참조한고 있는 힙영역의 데이터로 비교하도록, equals()메서드와, hushCode()메서드를 재정의하자.
		 //힙영역의 데이터값 비교
		if(studentID == std.studentID && studentName.equals(std.studentName))
		return true;
		else
		return false;
		}
		return false;
		 */
				
		// toString() 메서드가 자동으로 호출
		System.out.println(st1); // st1.toString()
		System.out.println(st2); // st2.toString()
		System.out.println(st3); // st3.toString()
		
		//해쉬코드값 : 힙영역의 기억장소를 가리킬 때 사용하는 코드값.
		System.out.println(st1.hashCode()); // 1694819250 → 7→
		System.out.println(st2.hashCode()); // 1694819250 → 7
		System.out.println(st3.hashCode()); // 1365202186 → 7
		
	}
}
