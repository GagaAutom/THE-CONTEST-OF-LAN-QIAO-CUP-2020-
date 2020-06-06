
public class OnePaceAway {
	static int e_gcd(int A,int B,int[] xy) {
		if(B == 0) {
			xy[0] = 1;
			xy[1] = 0;
			return A;
		}
		int ans = e_gcd(B,A%B,xy);
		int t = xy[0];
		xy[0] = xy[1];
		xy[1] = t - A/B * xy[0];
		return ans;
	}
	public static void main(String[] args) {
		int[] xy = new int[2];
		int a = e_gcd(97,127,xy);
		
		System.out.println(a);
		System.out.println(xy[0]+" "+xy[1]);
	}
}
