package chapter16.stream.other;

import java.io.File;
import java.io.IOException;

//File클래스 사용 : 파일과 폴더관력작업을 할 때 사용하는 클래스
public class FileTest {

	public static void main(String[] args) {
		
		File file = new File("C:\\dev\\Lecture\\JavaWork\\study\\newFile.txt");
		
		try {
			file.createNewFile(); //경로에 newFile.txt 생성
			
			//newFile.txt 파일 정보
			
			System.out.println(file.isFile()); //파일인지 확인
			System.out.println(file.isDirectory()); //폴더인지 확인
			System.out.println(file.getName()); //파일명 확인
			System.out.println(file.getAbsolutePath()); //파일의 절대경로 확인
			System.out.println(file.getPath()); //파일 경로
			System.out.println(file.canRead()); //파일 읽기상태
			System.out.println(file.canWrite()); //파일 쓰기상태
			
			file.delete(); //파일 삭제
			
			File dir = new File("C:\\dev\\Lecture\\JavaWork\\study\\newFoloder");
			
			dir.mkdirs(); //폴더생성
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
