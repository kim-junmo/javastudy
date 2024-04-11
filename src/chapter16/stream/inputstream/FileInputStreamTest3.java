package chapter16.stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

//바이트 기반 단위로 작업.
//파일의 내용을 배열을 사용하여, 10byte씩 읽어오기

//보통은 텍스트 파일은 바이트 단위로 작업보다는 문자 단위로 작업을 한다.
public class FileInputStreamTest3 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input.txt")) {
				
			//10바이트씩 읽기 위한 임시 기억장소 역활을 하고 있다.
				byte[] bs = new byte[10];
				
				int i;
				
				//fis.read(bs) : read매서드가 10바이트씩 읽어와서 bs에 저장시킨다.
				while((i = fis.read(bs)) != -1) {
					for(int k=0; k<i; k++) {
						System.out.print((char)bs[k]);
					}
					System.err.println(": " + i + "바이트 읽음");
				}
				
		}catch (IOException e) {
		e.printStackTrace();

		}
	}

}
