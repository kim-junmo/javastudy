package chapter14.generics3;

//멀티타입파라미터
public class Point<T, V> {
	/*
	데이터타입 x;
	데이터타입 y;
	*/
	
	//필드
	T x;
	V y;
	
	//생성자
	public Point(T x, V y) {
		this.x = x;
		this.y = y;
	}
	
	//제네릭 메서드
	public T getX() {
		return x;
	}
	
	public V getY() {
		return y;
	}
	
	//제네릭클래스 객체생성
	/* 
	 point<Integer, Double> p1 = new Point<Integer, Double>(0,0.0);
	 point<Integer, Double> p2 = new Point<>(10,10.0);
	 = new Point<Integer, Double>(0,0.0);에서 Integer, Double는 생략가능
	 */

}
