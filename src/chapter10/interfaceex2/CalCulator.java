package chapter10.interfaceex2;

//추상클래스 : 상속목적으로 설계, 객체생성 불가능
public abstract class CalCulator implements Calc{

	//구현되지 않은 추상메서드를 2개상속받은 상태
	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	

}
