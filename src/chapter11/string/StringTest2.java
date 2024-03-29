package chapter11.string;

//자바에서는 문자열데이터끼리 결합(연결)을 하면 새로운 기억장소로 관리가 된다.

public class StringTest2 {

	public static void main(String[] args) {
		
		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소값 : " + System.identityHashCode(javaStr));
		
		//concat이라는 명령어를 사용하게 된다면
		//"javaandroid" 새로운 문자열로 기억장소 새로 생성된다.
		javaStr = javaStr.concat(androidStr);
		
		System.out.println(javaStr); //javaandroid 
		System.out.println("처음 문자열 주소값 : " + System.identityHashCode(javaStr));
		
		System.out.println(javaStr.toLowerCase());
		System.out.println(javaStr.toUpperCase());
		
		
		
		
	}
}
