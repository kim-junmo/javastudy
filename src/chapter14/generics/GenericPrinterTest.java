package chapter14.generics;

public class GenericPrinterTest {

	public static void main(String[] args) {
		// 제네릭 클래스를 사용하는 법 (객체생성)
		//GenericPrinter<참조타입>
		GenericPrinter<Power> powerPrinter = new GenericPrinter<Power>();
		powerPrinter.setMaterial(new Power());
		Power power = powerPrinter.getMaterial();
		System.out.println(powerPrinter);
		
		GenericPrinter<Plastic> PlasticPrinter = new GenericPrinter<Plastic>();
		PlasticPrinter.setMaterial(new Plastic());
		Plastic plastic = PlasticPrinter.getMaterial();
		System.out.println(PlasticPrinter);

	}

}
