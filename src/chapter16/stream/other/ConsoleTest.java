package chapter16.stream.other;

import java.io.Console;

//해당 예제는 jdk 버전이 낮아 17에서는 오류가 발생하게 된다.
//Console클래스 : 내부적으로 system.in을 사용하지 않고, 
//콘솔 내용을 읽을 수 있는 기능을 제공한다.
public class ConsoleTest {

	public static void main(String[] args) {

		Console console = System.console();
		
		System.out.println("이름 : ");
		String name = console.readLine();
		
		System.out.println("직업 : ");
		String job = console.readLine();
		
		System.out.println("비밀번호 : ");
		char[] pass = console.readPassword();
		String strPass = new String(pass);
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(pass);
	}

}
