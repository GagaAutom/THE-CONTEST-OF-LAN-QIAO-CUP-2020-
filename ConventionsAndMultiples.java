
public class ConventionsAndMultiples {
	static int gcd(int a,int b) {
		if(b == 0) {
			return a;
		}
		return gcd(b , a % b);
	}
	static int lcm(int a, int b) {
		return a * b / gcd(a,b);
	}
	public static void main(String[] args) {
		System.out.println("最大公约数为："+gcd(45,60));
		System.out.println("最小公倍数为："+lcm(60,45));
	}
}
