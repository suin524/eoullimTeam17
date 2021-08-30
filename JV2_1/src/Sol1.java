//Scanner클래스를 이용해 원화를 입력받아 달러로 바꾸어 다음 예시와 같이 출력하는 프로그램을 작성하라. $1=1100원으로 가정.
import java.util.Scanner;

public class Sol1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요(단위 원)>>>");
		Double won = scanner.nextDouble();
		
		Double dollar = won/1100.0;
		System.out.println(won+"원은 $"+dollar+"입니다.");
	}

}
