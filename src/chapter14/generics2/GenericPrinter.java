package chapter14.generics2;

// 제네릭 기능이 있는 클래스
//<T> : 타입파라미터. 
//이 클래스를 객체생성시 타입파아미터에는 참조타입만 사용 가능하다.
//T extends Material 타입파라미터에 사용할 수 있는 자료형을 제한
//의미? Material클래스 또는 Material를 상속받은 클래스만 타입파라미터로 사용가능.
public class GenericPrinter<T extends Material> {
	
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
