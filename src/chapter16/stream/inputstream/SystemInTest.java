package chapter16.stream.inputstream;

import java.io.IOException;

//표준입출력 스트림 : 키보드로 입력받고, 화면(모니터)에 출력하는 기능을 지원목적.
/*
 표준 입력 스트림 : system.in
 표준 출력 스트림 : system.out
 표준 에러 스트림 : system.err
 */
public class SystemInTest {

	public static void main(String[] args) {
		
		System.out.println("알파벳 하나를 입력하고, [enter]를 누르세요.");
		
		int i;
		//예외처리 : try~catch
		try {
			
			//System.in.read(); 구문이 실행이 되면, 사용자가 키보드로 입력하기 전까지 대기상태로 존재한다.
			//키보드로 입력을 하고 Enter를 치면, 입력한 데이터가 버퍼(임시기억장소)에 저장이 된다. 
			//System.in 표준 입력스트림이 읽어온다.
			i = System.in.read(); 
			//read() 메서드가 예외관력작업을 하도록 문법이 존재한다. 그래서 try~catch 예외처리를 함.
			
			
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
