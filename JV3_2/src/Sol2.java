//2차원 배열 n을 풀력하는 프로그램을 작성하라.
public class Sol2 {
	public static void main(String[] args) {
		int n [][] = {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
		
		for(int i=0;i<5;i++) {
			for(int k=0;k<n[i].length;k++) {
				System.out.print(n[i][k]+" ");
			}
			System.out.println();
		}
		
	}

}
