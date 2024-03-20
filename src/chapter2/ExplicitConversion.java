package chapter2;

// 데이터타입 형변환(casting) : 데이터타입변환
// 명시적 형변환
public class ExplicitConversion {

	public static void main(String[] args) {
		
		// 1.묵시적형변환: 큰데이터 타입 = 작은 데이터타입(가능)
		// 2.명시적형변환: 작은데이터 타입 = 큰 데이터타입(불가능) →→ 작은데이터타입 = (좌측데이터타입) 큰데이터타입(가능)s
		
		double dNum1 = 1.2; // 해석 : double dNum1 = 1.2d;
		float fNum2 = 0.9f;
		
		// int iNum3 = dNum1; // 큰데이터타입은 작은데이터타입으로 변환될 수 없다.
		int iNum3 = (int) dNum1 + (int) fNum2; // 1.2는 1이되고, 0.9는 0이 됨 // 반올림이 아닌 내림으로 적용이 된다.
		int iNum4 = (int)(dNum1 + fNum2); //1.2(d) + 0.9f → 1.2(d) + 0.9(d) →→ 2.1(d) = 2.0(d))
		
		//실수값이 정수값으로 변환 시 소수부분은 버려진다. (반올림X) (int)0.999999999f;도 → 0
		System.out.println(iNum3); // 1
		System.out.println(iNum4); // 2(d)
	}

}
