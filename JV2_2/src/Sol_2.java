import java.util.Scanner;

//Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고, 십의 자리와 1의 자리가 같은지 판별하여 출력하는 프로그램 작성
public class Sol_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("2자리수 정수 입력(10~99)>>");
		int num = scanner.nextInt();
		int firstnum = num/10;
		int secondnum = num%10;
		
		if(firstnum == secondnum) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		}
		else {
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
		}

	}

}
