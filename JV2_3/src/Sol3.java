//Scanner 클래스를 이용해 정수로 된 돈의 액수를 입력받아 오만원권,만원권,천원권,500원짜리 동전,100원짜리 동전,50원짜리 동전,10원짜리 동전,1원짜리 동전 각 몇개로 변환되는지 출력.
import java.util.Scanner;
public class Sol3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오>>");
		int money = scanner.nextInt();
		
		int a = money/50000;
		money = money-(a*50000);
		
		int b = money/10000;
		money = money-(b*10000);
		
		int c = money/1000;
		money = money-(c*1000);
		
		int d = money/500;
		money = money-(d*500);
		
		int e = money/100;
		money = money-(e*100);
		
		int f = money/50;
		money = money-(f*50);
		
		int g = money/10;
		money = money-(g*10);
		
		int h = money;
		
		System.out.println("오만원권 "+a+"매");
		System.out.println("만원권 "+b+"매");
		System.out.println("천원권 "+c+"매");
		System.out.println("오백원 "+d+"매");
		System.out.println("백원 "+e+"매");
		System.out.println("오십원 "+f+"매");
		System.out.println("십원 "+g+"매");
		System.out.println("일원 "+h+"매");

	}

}
