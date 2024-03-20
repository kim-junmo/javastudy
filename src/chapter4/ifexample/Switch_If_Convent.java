package chapter4.ifexample;

public class Switch_If_Convent {

	public static void main(String[] args) {
		
		int ranking = 1; // 1, 2, 3
		char medalColor;
		
		if(ranking == 1) {
			medalColor = 'G';
			System.out.println("금메달");
		} else if(ranking == 2) {
			medalColor = 'S';
			System.out.println("은메달");
		} else if(ranking == 3) {
			medalColor = 'B';
			System.out.println("동메달");
		} else {
			medalColor = 'A';
			System.out.println("고생하셨습니다.");
		}
		System.out.println(ranking + "등 메달의 색깔을? " + medalColor + "입니다.");

	}

}
