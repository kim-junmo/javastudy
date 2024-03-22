package chapter5.shopmall;

//회원
public class Member {

	String name;
	String id;
	String pwd;
	int age;
	char gender; // 성별 M = 남자, F = 여자
	String zipcode;
	String addr;
	String hobby;

	//함수가 리턴값이 없을 때 사용하는 명령어 : void
	//void 메서드명() {으로 사용함
	
	void register(String name, String id, String pwd, int age, char gender, String zipcode, String addr, String hobby) {
		//데이터 베이스에 회원정보를 삽입하는 구문
		
	}
	void edit(String name, String id, String pwd, int age, char gender, String zipcode, String addr, String hobby) {
		//데이터 베이스에 회원정보를 수정하는 구문
	}
	void delete(String id, String pwd) {
		//데이터베이스에 회원정보를 삭제하는 구문
	}
	//로그인은 성공 및 실패로 처리하기 때문에 true, false로 진행함 그래서 boolean을 사용
	boolean login(String id, String pwd) {
		// 데이터베이스에 아이디, 비밀번호 존재유무를 체크해서 존재하면 true, 존재하지 않으면 false
		return true;
	}
	
	//아이디 중복체크
	boolean idCheck(String id) {
		//데이터베이스에 아이디가 존재하지 않으면 사용가능 true / 존재하면 사용 불가능 False
		return true;
	}
}
