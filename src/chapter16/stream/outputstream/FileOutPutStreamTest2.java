package chapter16.stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

//배열을 이용하여, 텍스트 파일에 출력작업
public class FileOutPutStreamTest2 {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("Output2.txt", true)) {
			
			byte[] bs = new byte[26]; //알파벳 26개 문자
			byte date = 65; //대문자 A를 가리킴
			
			//bs배열에 알파벳 대문자에 해당하는 숫자코드값을 변경하는 작업.
			//i값은 bs[0]~bs[25]
			for(int i=0; i<bs.length; i++) {
				bs[i] = date;
				date++;
			}
			fos.write(bs); //배열의 내용을 한번에 텍스트 파일에 쓰기작업.
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("출력이 완료됨.");

	}

}
