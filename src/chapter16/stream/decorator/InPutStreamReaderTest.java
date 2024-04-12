package chapter16.stream.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//보조스트림 : 메인스트림에 추가하여 작업하는 특징을 가지고 있다. 단독으로는 사용 불가능
//데코레이터 디자인 패턴을 사용
//보조스트림클래스 객체 = new 생성자(메인스트림객체);
//InputStreamReader클래스 : 바이트스트림을 문자스트림으로 변환하는 기능
public class InPutStreamReaderTest {

	public InPutStreamReaderTest() {
		
		//바이트 기반의 입력스트림 객체 생성
		//FileInputStream fis = new FileInputStream("reader.txt");
		
		
		//작업
		
		//문자기반의 입력스트림 객체 생성, 바이트 기반의 객체를 문자기반의 객체로 변환하는 작업
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))) {
			
			int i;
			while((i = isr.read()) != -1) {
				System.out.println((char)i);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
