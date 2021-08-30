//Scanner를 이용해 삼각형의 변의 길이를 나타내는 정수를 3개 입력받고 이 3개의 수로 삼각형을 만들 수 있는지 판별하라. 삼각형이 되려면 두 변의 합이 다른 한 변의 합보다 커야 한다.
import java.util.Scanner;
public class Sol5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 3개를 입력하시오>>");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int max = 0;
		
		if(a<b) {
			if(a<c) {
				if(b<c) {
					max = c;
				}
				else {
					max = b;
				}
			}
		}
		else {
			if(a<c) {
				max = c;
			}
			else {
			    max = a;
			}
		}
		
		int num = a+b+c-max;
		
		if(max>num) {
			System.out.println("삼각형이 될 수 없습니다.");
		}
		else {
			System.out.println("삼각형이 됩니다.");
		}

	}

}
