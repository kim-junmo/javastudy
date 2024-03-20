package chapter4.loopexample;

// 중첩 for문을 이용한 구구단 예제
public class GuGUDan {

	public static void main(String[] args) {
		
		for(int i=0; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				if(i == 0) {
				System.out.print(j + "단" + "\t");
				continue; //실행이 되면 아래로 가는 것이 아닌 위로 올라가게 된다.
				}
				System.out.print(j + "*" + i + "=" + (j*i) + "\t");
			} //println : 줄바꿈 기능이 있음, print : 줄바꿈 기능이 없음
			System.out.println();
		}

	}

}
