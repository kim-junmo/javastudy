package chapter14.collection.map.Treemap;


import java.util.Iterator;
import java.util.TreeMap;

import chapter14.collection.Member2;

//map인터페이스를 상속받아 구현한 TreeMap클래스
//자료구조를 이진형태로 분류로해서 정렬
//대소비교를 통한 정렬구조로 관리하기 때문에 반드시 데이터객체가(member2) Comparable or comparator 인터페이스를 구현해야 한다.
public class MemberTreeMap {

	
	private TreeMap<Integer, Member2> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member2>();
	}
	
	//데이터 추가 메서드
	public void addMember(Member2 member) {
		treeMap.put(member.getMemberId(), member);
	}
	
	//데이터 제거
	//Collection 요소를 순회하는 Iterator작업
		public boolean removeMember(int memberId) {
			
			if(treeMap.containsKey(memberId)) {
				treeMap.remove(memberId);
				return true;
			}
			
			return false;
		}
	
	
	//모든 데이터를 보기
	public void showAllMember() {
		
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			//key로 저장된 데이터가 Member2
			Member2 member = treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	
	}
}












