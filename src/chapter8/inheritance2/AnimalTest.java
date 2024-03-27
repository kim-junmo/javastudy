package chapter8.inheritance2;

public class AnimalTest {

	public static void main(String[] args) {
		
		//Animal클래스를 이용하여 객체를 생성.
		//자식클래스와는 전혀 상관없다.
		Animal ani = new Animal();
		ani.cry();
		ani.run();
		
		//자식클래스 Cat으로 객체를 생성하면
		//new 메모리 연산자가 부모 클래스 Animal를 이용하여
		//힙 메모리에 메모리를 생성하고 돌아와서 자식클래스인 Cat을 이용하여
		//힙 영역에 메모리를 생성한다.
		//이 와중에 생성자는 부모생성자를 호출하고 자식생성자가 호출로 이루어진다. (설계)
		Cat cat = new Cat();
		//재정의된 Cry(), run()메서드는 자신의 것으로 호출된다.
		cat.cry(); // 고양이가 야옹야옹한다.
		cat.run(); // 고양이가 달린다.

		cat.method1(); //동물이 달린다.
		//자식클래스 중 내부코드가 super.run();을 가지고 있으므로 부모 메서드를 호출

		Animal animal = new Cat();
		animal.cry(); //cat클래스의 재정의된 cry()을 호출한다.
		animal.run(); //cat클래스의 재정의된 run()을 호출한다.
		
		//animal.method1(); : 호출이 불가능하므로 호출하고자 할 경우에는
		
		if(animal instanceof Cat) {
		Cat c1 = (Cat) animal;
		c1.method1(); //호출가능
		}
		
		//Lion 클래스의 재정의된 명령어들 호출
		Animal animal2 = new Lion();
		animal2.cry(); 
		animal2.run();
		
		if(animal2 instanceof Lion) {
		Lion lion = (Lion) animal2;
		lion.play();
		}
		
		if(animal2 instanceof Lion) {
			Lion l1 = (Lion) animal2;
			l1.method2();
		}
		
		if(animal2 instanceof Lion) {
			Lion l2 = (Lion) animal2;
			l2.method3();
		}
		
		Lion lio = new Lion();
		lio.cry();
		lio.run();
		lio.play();

		if(animal instanceof Lion) {
		Lion lio1 = (Lion) animal;
		lio1.method2();
		}

		if(animal instanceof Lion) {
			Lion lio2 = (Lion) animal;
			lio2.method3();
		}
		lio.method2();
		lio.method3();
	}

}
