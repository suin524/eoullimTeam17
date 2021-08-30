//Scanner 클래스로 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하라. 평균값을 구하는 것이 아님에 주의.
import java.util.Scanner;
public class Sol4 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("정수 3개 입력>>");
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		
		int mid;
		
		if(x>y) {
			if(x>z) {
				if(y>z) {
					mid = y;
				}
				else {
					mid = z;
				}
			}
			else {
				mid = x;
			}
		}
		else {
			if(x<z) {
				if(y>z){
					mid = z;
				}
				else {
					mid = y;
				}
			}
			else {
				mid = x;
			}
		}
		System.out.println("중간값은 "+mid);

	}

}
