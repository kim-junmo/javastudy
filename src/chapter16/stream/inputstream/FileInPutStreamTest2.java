package chapter16.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//파일의 내용이 끝인지 아닌지를 while문으로 확인하여, 끝까지 읽어오는 예제.
public class FileInPutStreamTest2 {

	public static void main(String[] args) {

		//try(): 객체를 생성하면, 자동으로 close()메서드가 내부적으로 호출된다.
		//단, 사용클래스는 Closeable 인터페이스를 상속받아야한다.
		try(FileInputStream fis = new FileInputStream("input.txt")) {
			
			int i;
			//read()메서드가 읽어온 값이 없을 때 -1값을 리턴한다.
			//read()메서드는 1바이트씩 읽어온다.
			//read()메서드는 문자하나를 읽어오고, 다음 문자 위치로 포인터를 이동하는 기능을 제공한다.
			while((i = fis.read()) != -1) {
				System.out.print((char)i); //엔터키에는 줄바꿈기능(13)과 커서를 앞으로 옮기는 기능(10)을 가지고 있다. 
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
	}
	}
}
