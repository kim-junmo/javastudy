package chapter14.collection.arraylist;

import java.util.ArrayList;

//컬렉션
//List 인터페이스
//특징 : 데이터는 순서가 유지가 되며 데이터 중복은 허용이 된다.
public class ArrayListBasic {

	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("손흥민");//인덱스 0
		a1.add("김민재");//인덱스 1
		a1.add("이강인");//인덱스 2
		a1.add("박지성");//인덱스 3
		
		ArrayList<Integer> a12 = new ArrayList<Integer>();
		a12.add(10);//인덱스 0
		a12.add(20);//인덱스 1
		a12.add(30);//인덱스 2
		a12.add(40);//인덱스 3
		a12.add(50);//인덱스 4
		
		//컬렉션 데이터 출력
		System.out.println(a1.get(2)); //이강인
		System.out.println(a12.get(3)); //40
		System.out.println(a1.get(2) + "의 골은 " + a12.get(3)); //이강인
	}
}
