//정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라.

public class Sol7 {

	public static void main(String[] args) {
		
		System.out.print("랜덤한 정수들 : ");
		
		int intArray[] = new int[10];
		
		for(int i=0;i<10;i++) {
			intArray[i] = (int)(Math.random()*10+1);
			System.out.print(intArray[i]+" ");
		}
		
		int sum = 0;
		Double average;
		
		for(int k=0;k<10;k++) {
			sum += intArray[k];
		}
		
		average = sum/10.0;
		
		System.out.println();
		System.out.println("평균은 "+average);
		
	}

}
