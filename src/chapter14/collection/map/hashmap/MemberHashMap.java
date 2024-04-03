package chapter14.collection.map.hashmap;



import java.util.HashMap;
import java.util.Iterator;

import chapter14.collection.Member;




public class MemberHashMap {

	
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	//데이터 추가 메서드
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	//데이터 제거
	//Collection 요소를 순회하는 Iterator작업
		public boolean removeMember(int memberId) {
			
			if(hashMap.containsKey(memberId)) {
				hashMap.remove(memberId);
				return true;
			}
			
			return false;
		}
	
	
	//모든 데이터를 보기
	public void showAllMember() {
		
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			//key로 저장된 데이터가 Member
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	
	}
}












