package chapter15.exception3;

public class IDFormatTest {

	private String userId;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) throws IDFormatExcrption {
		if(userId == userId) {
			throw new IDFormatExcrption("아이디는 null 일 수 없습니다."); //예외 발생
		}else if(userId.length() < 8 || userId.length() > 20) {
			throw new IDFormatExcrption("아이디는 8자 이상 20자 이하로 사용가능."); //예외 발생
		}
		this.userId = userId;
	}
	
	
	public static void main(String[] args) {
		
		IDFormatTest test = new IDFormatTest();
		String userId = null;
		
		try {
			test.setUserId(userId);
		}catch (IDFormatExcrption e) {
			System.out.println(e.getMessage());
		}
		
		userId = "1234567"; //아이디를 7자리
		
		try {
			test.setUserId(userId);
		}catch(IDFormatExcrption e) {
			System.out.println(e.getMessage());
		}
	}
}
