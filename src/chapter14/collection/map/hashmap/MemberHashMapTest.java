package chapter14.collection.map.hashmap;

import chapter14.collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap memberHashMap = new MemberHashMap();
		
		//객체생성
		Member memberSon = new Member(1001, "손흥민");
		Member memberKim = new Member(1002, "김민재");
		Member memberLee = new Member(1003, "이강인");
		Member memberPark = new Member(1004, "박지성");
		
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberPark);
		
		memberHashMap.showAllMember(); //4개 member객체가 출력
		
		Member memberLee2 = new Member(1003, "이강두");
		memberHashMap.addMember(memberLee2);
		
		memberHashMap.showAllMember(); // 5개의 member객체가 출력
		
		
	}

}
