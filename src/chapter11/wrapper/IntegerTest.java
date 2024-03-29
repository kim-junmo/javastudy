package chapter11.wrapper;

//Wrapper클래스
/*
 기본데이터타입을 객체관점으로 사용할 떄 기능을 제공한다.
 
 기본데이터타입	Wrapper클래스	
 boolean	Boolean
 byte		Byte
 char		Character
 short		Short
 int		Integer
 long		long
 float		Float
 double		Double
 
 */
public class IntegerTest {

	public static void main(String[] args) {
		
		//Boxing과 UnBoxing
		//Boxing : 기본형을 객체형으로 변환하여 저장하는 것.
		//UnBoxing : 객체형에서 기본형으로 꺼내오는 것.
		//객체형 : 기본데이터타입이 아닌 모든 데이터타입.
		
		
		//참조타입 클래스 = 기본데이터 타입값;
		//100 데이터가 힙영역에 기억장소를 생성하고, 들어가는 과정을 Boxing 형변환이 진행된다.
		Integer num = 100; // Boxing
		//Integer클래스에서 정수값만 가져오는 것을 UnBoxing이라고 함.
		int iNum = num.intValue(); //UnBoxing
		int jNum = 200;
		
		int sum = iNum + jNum;
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
