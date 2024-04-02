package chapter14.collection.linkedlist;


import java.util.LinkedList;

import chapter14.collection.Member;

//LinkedList클레스의 데이터로 Member클래스를 사용하기
public class MemberLinkedList {

	//기억장소를 인덱스로 관리하는 특징(순서가 있다.), 데이터중복허용
	private LinkedList<Member> linkedList;
	
	public MemberLinkedList() {
		linkedList = new LinkedList<Member>();
	}
	
	//데이터 추가 메서드
	public void addMember(Member member) {
		linkedList.add(member); //객체의 주소값이 저장이 됨.
	}
	
	//데이터 제거
	public boolean removeMember(int memberId) {
		//arrayList.size() : 컬렉션 기억장소의 요소의 개수
		for(int i=0; i<linkedList.size(); i++) {
			Member member =	linkedList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				linkedList.remove(i); //멤버를 삭제
				return true;
			}
		}
		return false;
	}
	
	//모든 데이터를 보기
	public void showAllMember() {
		//4번 반복
		for(Member member : linkedList) { //member.tostring 호출
			System.out.println(member);
		}
		System.out.println();
	}
}
