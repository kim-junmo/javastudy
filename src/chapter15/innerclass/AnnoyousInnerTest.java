package chapter15.innerclass;

//익명내부 클래스 - 일회성 특징으로 사용하는 클래스 
//보통은 A라는 이름이 부여된 클래스를 사용하지만 이와 반대의 개념

class Outer2 {
	
	//익명구현객체 : 클래스명 없이 객체를 생성하는 형태, 일회성 목적으로 작업
	//Runnable runner = new 클래스 생성자(); : 보통은 이렇게 만듬
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			
			
		}
	};
	
	//클래스로 작업
	/*
	class Runnable {
		public void run {
			
		}
	}
	Runnable r = new Runnable();
	*/
}




public class AnnoyousInnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
