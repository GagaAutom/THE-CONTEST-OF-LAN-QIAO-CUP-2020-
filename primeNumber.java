//筛法取素数
public class primeNumber {
	public static void main(String[] args) {
		int N = 1500 * 1000;
		int x = 100002;
		
		byte[] a = new byte[N];
		
		for(int i = 2;i<N/2;i++) {
			if(a[i] == 1)
				continue;
			for(int j = 2;j<=N/i;j++) {//筛子，1为合数
				if(i * j < N)
					a[i*j] = 1;
			}
		}
		
		int m = 0;
		for(int i = 2;i<N;i++) {
			if(a[i] == 0) {
				m++;
				if(m == x) {
					System.out.println("第"+m+"个："+ i);
				}
			}
		}
	}
}
