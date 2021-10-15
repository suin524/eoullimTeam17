//원의 정보를 받기 위해 키보드로부터 원의 중심을 나타내는 한 점과 반지름을 입력받는다. 두 개의 원을 입력받고 두원이 서로 겹치는지 판단하여 출력하라.
import java.util.Scanner;
public class Sol10 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int r1 = scanner.nextInt();
		
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int r2 = scanner.nextInt();
		
		Double distance = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
		
		if(distance>=r1+r2) {
			System.out.println("두 원은 서로 겹치지 않는다.");
		}
		else {
			System.out.println("두 원은 서로 겹친다.");
		}
	}

}
