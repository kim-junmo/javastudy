package chapter4.loopexample;

public class CountiueExample {

	public static void main(String[] args) {

		int i=0;
		
		for(i = 0; i<= 10; i++) {
			
			//아래 구문이 출력이 되어 true가 되면, 
			//continue가 동작되어 for문의 i++로 제어가 넘어간다.
			// 5를 제외한 다른 숫자는 출력이 된다.
			if(i == 5) {
			continue;
			}
			System.out.println(i);
		}
		

	}

}
