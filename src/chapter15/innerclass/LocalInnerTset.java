package chapter15.innerclass;

//지역내부클래스
class Outer {
	
	//전역변수: 클래스 안에 있는 변수 
	int outNum = 100;
	static int sNum = 200;
	
	//메서드 내부에 클래스를 정의하고 있음
	Runnable getRunnable(int i) {
		
		int num = 100; //지역변수 : 메서드 안에 있는 변수
		
		// 스레드
		class MyRunnable implements Runnable { //Runnable안에 run이라는 추상메서드가 들어있었음
			
			int localNum = 10;

			@Override
			public void run() {
				System.out.println("i= " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outer.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");
				
			}
		}
			
		return new MyRunnable();
		

	}
	
	void methodA() {
		
		//지역내부 클래스
		class A {}
		
		//객체생성
		A a = new A();
			
	}
}



public class LocalInnerTset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
