package chapter14.collection.arraylist;

import java.util.ArrayList;

import chapter14.collection.Member;

//ArrayList클레스의 데이터로 Member클래스를 사용하기
public class MemberArrayList {

	//기억장소를 인덱스로 관리하는 특징(순서가 있다.), 데이터중복허용
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	//데이터 추가 메서드
	public void addMember (Member member) {
		arrayList.add(member);
	}
	
	//데이터 제거
	public boolean removeMember(int memberId) {
		//arrayList.size() : 컬렉션 기억장소의 요소의 개수
		for(int i=0; i<arrayList.size(); i++) {
			Member member =	arrayList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(i); //멤버를 삭제
				return true;
			}
		}
		return false;
	}
	
	//모든 데이터를 보기
	public void showAllMember() {
		//4번 반복
		for(Member member : arrayList) { //member.tostring 호출
			System.out.println(member);
		}
		System.out.println();
	}
}
