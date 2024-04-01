package chapter14.generics3;

public class GenericMethod {

	
	//제네릭 메서드 문법형식
	//<T, V> : 메서드 타입파라미터
	//제네릭메서드 호출	GenericMethod.<Integer, Double>makeRectangle(null, null);
	//<T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2)
	//<T, V> double makeRectangle(Point<Integer, Double> p1, Point<Integer, Double> p2)
	//위에서 아래도 변환이 됨.
	public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;

		return width * height;
	}
	
	public static void main(String[] args) {
		
		//우측 Integer, Double는 생략가능
		Point<Integer, Double> p1 = new Point<>(0, 0.0);
		Point<Integer, Double> p2 = new Point<Integer, Double>(10, 10.0);

		//제네릭 메서드 호출
		double rect = GenericMethod.<Integer, Double>makeRectangle(p1, p2);
		System.out.println("두 점으로 만들어진 사각형의 넓이는 " + rect + "입니다.");
		
		
	}

}
