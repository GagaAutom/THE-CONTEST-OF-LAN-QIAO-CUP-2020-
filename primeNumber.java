//ɸ��ȡ����
public class primeNumber {
	public static void main(String[] args) {
		int N = 1500 * 1000;
		int x = 100002;
		
		byte[] a = new byte[N];
		
		for(int i = 2;i<N/2;i++) {
			if(a[i] == 1)
				continue;
			for(int j = 2;j<=N/i;j++) {//ɸ�ӣ�1Ϊ����
				if(i * j < N)
					a[i*j] = 1;
			}
		}
		
		int m = 0;
		for(int i = 2;i<N;i++) {
			if(a[i] == 0) {
				m++;
				if(m == x) {
					System.out.println("��"+m+"����"+ i);
				}
			}
		}
	}
}
