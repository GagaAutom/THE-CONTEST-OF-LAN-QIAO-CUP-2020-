
public class FraudulentGambling {
	static long solution() {
		int a = (int)(Math.random() * 6 + 1);
		int b = (int)(Math.random() * 6 + 1);
		int c = (int)(Math.random() * 6 + 1);
		
		int cilence = (int)(Math.random() * 6 + 1);
		
		int n = 0;
		if(cilence == a)
			n++;
		if(cilence == b)
			n++;
		if(cilence == c)
			n++;
		
		if(n == 1)
			return -1;
		if(n == 2)
			return -2;
		if(n == 3)
			return -10;
		return 1;
	}
	public static void main(String[] args) {
		int N = 500*10000;
		int sum = 0;
		for(int i = 0;i<N;i++) {
			sum += solution();
		}
		System.out.println((double)sum/N*100 + "%");
	}
}
