package chapter9.abstractex;

public class Tiger extends Animal{

	@Override
	void run() {
		System.out.println("호랑이가 뛴다.");
	}

	@Override
	void cry() {
		System.out.println("호랑이가 어흥 울부짖는다.");
	}

	
	
}
