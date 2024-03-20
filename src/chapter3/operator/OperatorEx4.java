package chapter3.operator;

//조건연산자(삼항연산자) : if문과 유사
public class OperatorEx4 {

	public static void main(String[] args) {
		
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch; // 숫자로 사용시 0~65535 범위를 갖는다.
		// ch = 문자코드표현, 숫자(0~65535), '문자 1개', '유니코드'
		ch = (fatherAge > motherAge) ? 'T':'F'; 
		
		System.out.println(ch); // F가 출력이 된다
	}
}
