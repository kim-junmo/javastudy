package chapter7.array;

public class CharArray {
	
	public static void main(String[] args) {
		
		char[] alphabets = new char[26];
		char ch = 'A'; // 아스키코드 값은 65로 저장되어 있음
		
		for(int i=0; i<alphabets.length; i++, ch++) { //alphabets.length = 26
			alphabets[i] = ch; //ch변수에 더하기 1이 반영이 되어 있다.
		}
		for(int i=0; i<alphabets.length; i++) {
			System.out.println(alphabets[i] + ", " + (int) alphabets[i]);
		}
	}
}
