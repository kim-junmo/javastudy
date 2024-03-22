package chapter5.hiding;

//정보은닉(캡술화) : 접근자 문법
public class Student {

	//필드
	int studentId;
	String studentName;
	int grade;
	String address;
	private int score;

	//생성자 : 기본생성자는 자동생성
	//메서드. score필드에 값을 저장하는 메서드를 setter메서드라고 함
	//setter, getter메서드는 이름을 다음과 같은 규칙으로 만들어야 한다.
	//setScore(), getScore()
	public void setScore(int score) {
		
		if(score < 0 || score >=100) {
			this.score = 0;
			return;
		}
		
		this.score = score;
	}
	
	//score 필드에 값을 읽기, getter메서드
	public int getScore() {
		return score;
	}
}
