package chapter14.collection.map.Treemap;

import chapter14.collection.Member;
import chapter14.collection.Member2;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		//객체생성
		Member2 memberSon = new Member2(1001, "손흥민");
		Member2 memberKim = new Member2(1002, "김민재");
		Member2 memberLee = new Member2(1003, "이강인");
		Member2 memberPark = new Member2(1004, "박지성");
		
		memberTreeMap.addMember(memberSon);
		memberTreeMap.addMember(memberKim);
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberPark);
		
		memberTreeMap.showAllMember(); //4개 member객체가 출력
		
		Member2 memberLee2 = new Member2(1003, "이강두");
		memberTreeMap.addMember(memberLee2);
		
		memberTreeMap.showAllMember(); // 5개의 member객체가 출력
		
		
	}

}
