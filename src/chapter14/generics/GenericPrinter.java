package chapter14.generics;

// 제네릭 기능이 있는 클래스
//<T> : 타입파라미터. 
//이 클래스를 객체생성시 타입파아미터에는 참조타입만 사용 가능하다.
public class GenericPrinter<T> {
	
	//private 데이터타입 material;
	private T material;
	
	//getter / setter
	
	public T getMaterial() {
		return material;
	}
	
	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString();
	}
	
}
