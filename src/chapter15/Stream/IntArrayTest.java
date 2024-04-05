package chapter15.Stream;

import java.util.Arrays;

//스트림 예제 : 배열에 스트림 기능을 사용.
//배열 또는 컬렉선의 요소(데이터를 저장하는 공간)를 특정기준에 따라 정렬하거나, 요소중 특정값을 제외하고 출력하는 이런 형태의 기능들을
//가지고 있는 클래스들을 스트림이라고 한다. 즉 여러 자료의 처리에 대한 기능을 제공하는 클래스.
public class IntArrayTest {

	public static void main(String[] args) {
		
		//배열은 참조타입이다. 참조타입은 기억장소를 스택영역과 힙영역 2가지 영역으로 관리한다. 
		int[] arr = {1, 2, 3, 4, 5};
		
		//arr 배열의 데이터를 합계
		int sum = 0;
		
		//1) for문을 사용하여 합계를 구한 예
		//arr 배열의 첫번째 요소는 arr[0]으로 인덱스가 사용되기 때문에, for문의 i=0으로 한다.
		for(int i=0; i<arr.length; i++) {
			sum += arr[i]; //sum = sum + arr[i]
		}
		
		System.out.println("총합계:" + sum);

		//2) stream기능을 사용하여 합계를 구한 예
		int sum2 = Arrays.stream(arr).sum();
		int count = (int)Arrays.stream(arr).count(); //.count();는 long 타입이기 때문에 int형변환으로 타입일치를 해야함.
		
		System.out.println(sum2); //15
		System.out.println(count); //5
	}

}
