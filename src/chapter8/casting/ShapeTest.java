package chapter8.casting;

// 참조타입 클래스를 이용한 형변환 (Casting) → 다양성 학습을 하기 위한 전단계 259p
// 참조타입 : 클래스가 상속관계에 따른 형변환
public class ShapeTest {

	public static void main(String[] args) {
		
		//부모클래스 변수 = 자식객체;
		//부모클래스 = 자식클래스 대입시에는 형 변환을 생략가능.
		//반대로 자식클래스 = 부모클래스 구문은 형변환 생략불가능
		//자식클래스 = (자식클래스명) 부모클래스 명시적형변환
		//업캐스팅 : 자식객체로 부모클래스로 형변환, 묵시적형변환
		
		
		//Shape shape1 = (Shape) new Circle();
		//draw()메서드가 부모, 자식클래스에 같이 존재하면(재정의가 되어있음), 
		//부모클래스 변수는 자식의 재정의한 draw()메서드 호출하도록 설계되어있다.
		//그리고, 부모클래스(Shape) 변수로 멤버들 호출하게 되면 자신의 클래스(Shape)구성요소만 호출되도록 설계되어 있다.
		
		Shape shape1 = new Circle();
		shape1.draw(); // draw Circle
		//Circle클래스의 재정의된 draw()메서드가 호출 
	
		Shape shape2 = new Rectangle(); 
		//해석 Shape shape2 = (Shape)new Rectangle();
		shape2.draw(); //draw Rectangle
		//Rectangle클래스의 재정의된 drwa() 호출
		
		Shape shape3 = new Triangle();
		//해석 Shape shape3 = (Shape)new Triangle();
		shape3.draw(); //draw Triangle
		//Triangle클래스의 재정의된 drwa() 호출
		
		//shape1 객체가 circle클래스로 생성된 객체인지 여부
		//instanceof : shape1객체가 Circle클래스로 만들어진 객채인지 확인하는 코드
		if(shape1 instanceof Circle) {
			
			//다운캐스팅, 명시적 형변환
			//자식클래스 변수 = (자식클래스) 부모객체
			// 자식클래스의 구성요소를 호출하도록 설계되어 있다.
			//책에서 250p로 예제가 나와있음
			Circle c1 = (Circle) shape1;
			c1.method1(); 
			//shape1.method1() 이렇게 호출이 안되고, 자식객체로 형변환하여야 호출이 되도록 설계.	
			
			//shape shape2 = new Rectangle();
			//Circle c2 = (Circle) shape1;
			Rectangle r1 = (Rectangle)shape2;
		}
	}
}
