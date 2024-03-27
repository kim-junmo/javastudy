package chapter8.polymorphism;

//부모클래스를 사용할 것이다. : super
class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	//재정의
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	//추가
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	//재정의
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	//추가
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");		
	}
}

class Eagle extends Animal {
	//재정의
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	//추가
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}

class Lion extends Animal {
	@Override
	public void move() {
		System.out.println("사자가 네 발로 뜁니다.");
	}
	
	//추가
	public void hunting() {
		System.out.println("사자가 사냥을 합니다.");		
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		// 다형성작업
		
		/*
		//개별호출
		//코드가 중복되고, 유지보수 작업에는 적합하지 않다.
		//상속관계 설정이 아니라면
		Human human = new Human();
		human.move();
		
		Tiger tiger = new Tiger();
		tiger.move();
		
		Eagle eagle = new Eagle();
		eagle.move();
		
		Lion lion = new Lion();
		lion.move();
	
*/

		
		AnimalTest aTest = new AnimalTest();
		aTest.moveAnimal(new Human()); //1)
		aTest.moveAnimal(new Tiger()); //2)
		aTest.moveAnimal(new Eagle()); //3)
		aTest.moveAnimal(new Lion()); //4)
		
	}
		
	//다형성 기능의 메서드 정의
	//Animal animal 부모클래스 변수가 여러 자식 객체를 갖게 되는 의미 또는 성질을 다형성.
	public void moveAnimal(Animal animal) {
		//재정의된 move()메서드가 호출된다.
		animal.move(); // animal = new Human() or new Tiger() or new Eagle() or new Lion()
	}
}
