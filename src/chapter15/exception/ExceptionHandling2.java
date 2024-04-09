package chapter15.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling2 {

	public static void main(String[] args) throws FileNotFoundException {
		//파일 입출력 기능을 제공하는 클래스
		FileInputStream fis = null;
		
		//실행시 a.txt파일이 존재하지 않아 예외가 발생되었고, 예외를 처리하지 않고, main()메서드에게 예외를 전가함.
		fis = new FileInputStream("a.txt");
				
		System.out.println("프로그램 종료");

	}

}
