package chapter14.collection;

public class Member2 /*extends Object*/ {
	
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
	
	
	
	

}
