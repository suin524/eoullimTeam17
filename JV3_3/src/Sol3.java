//Scanner를 이용해 정수를 입력받고 다음과 같이 *를 출력하는 프로그램을 작성하라.
import java.util.Scanner;
public class Sol3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오>>");
		
		int num = scanner.nextInt();
		int x = num; //num값은 변화시키지 않고 별의 갯수를 줄이기위해 새로운 변수
		
		for(int i = 0; i<num; i++) {
			for(int k=x;k>0;k--) {
				System.out.print("*");
			}
			System.out.println();
			x--;
		}

	}

}
