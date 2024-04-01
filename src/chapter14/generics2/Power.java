package chapter14.generics2;

public class Power extends Material {

	public void doPrinting() {
		System.out.println("power 재료로 출력합니다.");
	}
	
	@Override
	public String toString() {
		return "재료는 power입니다.";
	}
}
