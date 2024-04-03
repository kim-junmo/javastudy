package chapter14.collection.treeset;



import java.util.Iterator;
import java.util.TreeSet;

import chapter14.collection.Member2;



//TreeSet클레스의 데이터로 Member클래스를 사용하기
public class MemberTreeSet {

	
	private TreeSet<Member2> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member2>();
	}
	
	//데이터 추가 메서드
	public void addMember(Member2 member) {
		//아래 메서드 동작하면서, Member2클래스의 compareTo()메서드가 호출됨.
		treeSet.add(member); //객체의 주소값이 저장이 됨.
	}
	
	//데이터 제거
	//Collection 요소를 순회하는 Iterator작업
		public boolean removeMember(int memberId) {
			
			
			Iterator<Member2> ir = treeSet.iterator();
			//ir객체는 커서라는 포인터를 이용하여 데이터를 참조하는데
			//처음에 가리키는 위치에 데이터가 존재하면 hasNext()가 
			//ture 아니면 false로 반환한다.
			while(ir.hasNext()) {
				Member2 member = ir.next(); 
				// 커서가 가리키는 위치에서 데이터를 읽어온다. 커서가 다음 위치로 이동된다.
				int tempId = member.getMemberId();
				if(tempId == memberId) {
					treeSet.remove(member); //멤버를 삭제
					return true;
				}
			}
			return false;
		}
	
	
	//모든 데이터를 보기
	public void showAllMember() {
		//4번 반복
		for(Member2 member : treeSet) { //member.tostring 호출
			System.out.println(member);
		}
		System.out.println();
	}
}
