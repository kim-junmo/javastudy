package chapter4.ifexample;


public class SwitchCase2 {

	public static void main(String[] args) {
		
		// string 클래스 : 문자열 데이터를 관리할 때 사용.
		// char 데이터타입과는 다르다.
		String medal = "Gold"; // string을 사용할 떄는 큰 따옴표를 사용해야된다. 
	
		//switch문에 정수 변수 만이 아니라 문자열 변수를 사용할 수가 있다 (java 1.7버전에서부터 지원)
		switch(medal) {
			case "Gold":
				System.out.println("금메달입니다.");
				break;
			case "Silver":
				System.out.println("은메달입니다.");
				break;
			case "Bronze":
				System.out.println("ehd메달입니다.");
				break;
			default:
				System.out.println("메달이 없습니다.");
				break;
		}

	}

}
