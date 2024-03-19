package chapter2;

public class IntegerVariable {

	public static void main(String[] args) {
		// 정수형 데이터 타입에는 : bype(1), short(2), int(4), long(8)
		// 크기를 이용하여 기억장소를 생성한다.
		// 예로 byte는 1바이트를 생성한다. 
		// 1byte = 8개의 bit로 구성이 되어 있다.
		// bit는 0,1의 2진수값을 저장하도록 설계되어 있다.
		
		byte b1 = -128;
		short sVal = 10;
		byte bval = 20;
		
		System.out.println(sVal + bval + b1);
		
		//long 데이터를 저장할 경우 숫자 데이터 끝부분에 알파벳 L or l을 붙인다. 
		//알파벳은 소문자 혹은 대문자 L이다.
		long lVal = 12345678900L;

	}

}
