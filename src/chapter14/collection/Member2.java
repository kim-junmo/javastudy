package chapter14.collection;

//import java.util.Comparator;
//treeset 클래스에서 이 클래스가 객체생성하여, 데이터로 사용하기 위해서는,
//아래 인터페이스를 반드시 구현을 해야한다.
//1. Comparable인터페이스나 또는 2. Comparator인터페이스를 구현해야한다.
public class Member2 implements Comparable<Member2> {
	
	private int memberId;
	private String memberName;
	
	//매개변수가 있는 생성자
	public Member2(int memberId, String memberName) {
		super(); //컴파일 과정에서 자동으로 만들어지며 생략해도 괜찮음. object클래스의 기본생성자 호출
		this.memberId = memberId;
		this.memberName = memberName;
	}

	//getter / setter : private접근자를 public을 만들기 위해 존재함.
	
	public Member2(String memberId2, String string) {
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	//재정의 목적은 클래스의 필드 내용을 확인하는 목적으로 사용됨.
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}
	
	//객체 비교로 사용되는 메서드 재정의
	@Override
	public int hashCode() {

		return memberId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member2) {
			Member2 member = (Member2) obj;
			if(this.memberId == member.memberId && this.memberName.equals(member.memberName))
				return true;
			else
				return false;
		}
		return false;
	}
/*
	//객체가 대소비교에 사용되는 추상메서드 구현용도로 사용이 되는 메소드이다.
	//public class Member2 implements Comparator<Member2>
	//이걸 작성한 후에 아래 가 만들어짐.
	@Override
	public int compare(Member2 o1, Member2 o2) {
		System.out.println("Compare 메서드 호출");
		//Member2 클래스를 대소비교할 때 기준을 잡아야한다.
		//memberId를 대소비교를 하는 기준으로 잡음.
		return o1.getMemberId() - o2.getMemberId();
	}
*/

	@Override
	public int compareTo(Member2 o) {
		System.out.println("compareTo 메서드 호출");
//		System.out.println(memberId - o.getMemberId());
		
		//오름차순 1001, 1002 순서로 저장
		return this.memberId - o.getMemberId();
		
		//내림차순 1002, 1001 순서로 저장
		//return (this.memberId - o.getMemberId) * (-1);
	}
	
	
	
	

}
