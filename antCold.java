import java.util.Scanner;

public class antCold {
	public static int Ant(int[] data) {
		if(data.length>=50||data.length<=1) {
			return -1;
		}
		int L=0,R=0;
		for(int i = 1;i<data.length;i++) {
			if(data[i]<=-100 || data[i]>=100) {
				return -1;
			}
			if(data[0] > 0) {
				if(Math.abs(data[i]) > data[0] && data[i] < 0) {
					R++;
				}
				if(R == 0) {
					return 1;
				}
				if(Math.abs(data[i]) < data[0] && data[i] > 0) {
					L++;
				}
			}
			else {
				if(Math.abs(data[i]) < Math.abs(data[0]) && data[i] > 0) {
					L++;
				}
				if(L == 0) {
					return 1;
				}
				if(Math.abs(data[i]) > Math.abs(data[0]) && data[i] < 0) {
					R++;
				}
			}
		}
		return R + L + 1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] data = new int[n];
		for(int i = 0;i<data.length;i++) {
			data[i] = sc.nextInt();
		}
		System.out.println(Ant(data));
	}
}
