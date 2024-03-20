package chapter4.ifexample;

// 다중 if문 : 조건식이 여러개 일 경우
public class IfExample4 {
	public static void main(String[] args) {

		//변수 선언시 초기에 값을 할당하거나 혹은 코드내에서 변수가 조건에 의하여 값을 가지도록 코딩을 해주어야 한다. 
		int age = 131; // 나이
		int charge; // 입장료
		
		//아래 다중if문에서 조건식이 성립이 안되어 charge변수 값을 갖지 못하는 경우는 error발생
		
		if(age >=0 && age < 8) {   // 0세 이상이고, 8세 미만
			charge = 1000;
			System.out.println("미 취학 아동입니다.");
		}else if(age >=9 && age < 14) {    // 9세 이상이고, 14세 미만
			charge = 2000;
			System.out.println("초등학생입니다.");
		}else if(age >=15 && age < 20) {   // 15세 이상이고, 20세 미만   
			charge = 2500;
			System.out.println("중, 고등학생입니다.");
		}else if(age >=20 && age < 130) {
			charge = 3000;
			System.out.println("일반인입니다.");
		}else {
			charge = -99999;
			System.out.println("나이를 확인해주세요");
		}
		
		System.out.println("입장료는" + charge + "원입니다.");
	}
}
