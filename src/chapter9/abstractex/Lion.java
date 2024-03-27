package chapter9.abstractex;

public class Lion extends Animal{

	@Override
	void run() {
		System.out.println("사자가 뛴다.");
	}

	@Override
	void cry() {
		System.out.println("사자가 울부짖는다.");
	}

	
	
}
