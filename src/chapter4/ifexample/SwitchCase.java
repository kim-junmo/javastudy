package chapter4.ifexample;

import javax.swing.DefaultBoundedRangeModel;

import chapter2.chapterEx3;

//선택문 : 다중 if문과 유사.
public class SwitchCase {

	public static void main(String[] args) {
	
		int racking = 1; // 1, 2, 3 기타 이외의 값
		char medalColor;
		
		switch(racking) {
			case 1: medalColor = 'G'; // Gold
					break;
			case 2: medalColor = 'S'; // Silver
					break;
			case 3: medalColor = 'B'; // Blons
					break;
			default: // if문의 else와 유사하다
				medalColor = 'A';	
		}
		System.out.println(racking + "등 메달의 색깔은? " + medalColor + "입니다.");

	}

}
