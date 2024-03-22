package chapter5.hiding;

public class MyDate {
	//접근자는 총 4개 유형이 존재한다.
	/*
	private : 사용하면 접근 불가.
	
	default : 접근자 사용안함,필드 앞에 아무것도 없으면 디폴트.
	접근자 사용안함, 동일패이키에서는 public, 다른패키지에서는 private
	public : 사용하면 접근 가능.
	protected : 상속 접근자
	
	private < default < public
	default : 필드는 동일한 패키지일 경우에는 접근이 가능하지만, 다른 패키지일 경우 접근이 안된다.
	
	*/ 
	public int day;
	int month; //접근자 생략시 디폴트 의미
	private int year;
}
