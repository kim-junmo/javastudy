package chapter14.generics2;

public class GenericPrinterTest {

	public static void main(String[] args) {
		// 제네릭 클래스를 사용하는 법 (객체생성)
		//GenericPrinter<참조타입>
		//1) Power클래스 사용가능
		GenericPrinter<Power> powerPrinter = new GenericPrinter<Power>();
		powerPrinter.setMaterial(new Power());
		Power power = powerPrinter.getMaterial();
		System.out.println(powerPrinter);
		
		//2) Plastic클래스 사용가능
		GenericPrinter<Plastic> PlasticPrinter = new GenericPrinter<Plastic>();
		PlasticPrinter.setMaterial(new Plastic());
		Plastic plastic = PlasticPrinter.getMaterial();
		System.out.println(PlasticPrinter);
		
		//3)Material클래스 사용가능
		GenericPrinter<Material> MaterialPrinter = new GenericPrinter<Material>();
		
		//4)Person클래스 사용가능
		GenericPrinter<Person> PersonPrinter = new GenericPrinter<Person>();
	}

}
