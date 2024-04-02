package chapter14.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import chapter14.collection.Member;

//ArrayList클레스의 데이터로 Member클래스를 사용하기
public class MemberArrayList {

	//기억장소를 인덱스로 관리하는 특징(순서가 있다.), 데이터중복허용
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	//데이터 추가 메서드
	public void addMember(Member member) {
		arrayList.add(member); //객체의 주소값이 저장이 됨.
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
		//책의 예제는 Iterator작업이 여기에 존재한다.
		//복잡하여, 아래 removeMember2로 작업하였음.
		return false;
	}
	
	//Collection 요소를 순회하는 Iterator작업
	public boolean removeMember2(int memberId) {
		
		//arrayList객체가 가지고 있는 데이터를 순차적으로 접근할 수 있는 객체 ir
		Iterator<Member> ir = arrayList.iterator();
		//ir객체는 커서라는 포인터를 이용하여 데이터를 참조하는데
		//처음에 가리키는 위치에 데이터가 존재하면 hasNext()가 
		//ture 아니면 false로 반환한다.
		while(ir.hasNext()) {
			Member member = ir.next(); 
			// 커서가 가리키는 위치에서 데이터를 읽어온다. 커서가 다음 위치로 이동된다.
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(member); //멤버를 삭제
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
