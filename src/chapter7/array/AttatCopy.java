package chapter7.array;

//배열복사
public class AttatCopy {

	public static void main(String[] args) {
		
		int[] array1 = {10, 20, 30, 40, 50}; //원본배열
		int[] array2 = {1, 2, 3, 4, 5}; // 사본배열
		
		//배열복사기능 → 원본배열을 복사해서 사본배열로 복붙
		//array1배열의 인덱스 0 위치에서 array2 인덱스 1위치에 값 순차적으로 4개를 복사한다.
		//즉 array1의 값 10~40를 array2 2~5로 복사한다. → array2 값은 1,10,20,30,40 으로 변경됨
		System.arraycopy(array1, 0, array2, 1, 4);

		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
	}

}
