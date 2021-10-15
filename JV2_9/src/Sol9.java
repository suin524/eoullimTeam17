//원의 중심을 나타내는 한 점과 반지름을 실수 값으로 입력받아라. 그리고 실수 값으로 다른 점 (x,y)를 입력받아 이 점이 원의 내부에 있는지 판별하여 출력하라.
import java.util.Scanner;
public class Sol9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("원의 중심과 반지름 입력>>");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		Double r = scanner.nextDouble();
		
		System.out.print("점 입력>>");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		if(Math.pow(r,2) > Math.pow(a-x, 2) + Math.pow(b-y,2)) {
			System.out.println("원의 내부에 존재");
		}
		else {
			System.out.println("원의 내부에 존재하지 않는다.");
		}

	}

}
