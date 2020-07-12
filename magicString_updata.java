
public class magicString_updata {
	public static void main(String[] args) {
		int[][] a = new int[100][100];
		
		for(int i = 1;i<100;i++) {
			a[i][1] = 1;
			a[1][i] = 1;
		}
		
		for(int i = 2;i<100;i++) {
			for(int j = 2;j<100;j++) {
				a[i][j] = a[i-1][j] + a[i][j-1];
			}
		}
		
		System.out.println(a[5][4]);
	}
}
