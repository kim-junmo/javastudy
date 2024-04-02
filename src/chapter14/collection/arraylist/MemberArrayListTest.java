package chapter14.collection.arraylist;

import chapter14.collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		//객체생성
		Member memberSon = new Member(1001, "손흥민");
		Member memberKim = new Member(1002, "김민재");
		Member memberLee = new Member(1003, "이강인");
		Member memberPark = new Member(1004, "박지성");
		
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberPark);
		
		memberArrayList.showAllMember(); //4개 member객체가 출력
		
		memberArrayList.removeMember(memberPark.getMemberId()); //박지성삭제
		
		memberArrayList.showAllMember(); // 3개의 member객체가 출력
		
		
	}

}
