
public class ConventionsAndMultiples {
	static void swap(int a,int b) {
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
	}
	static int gcd(int a,int b) {
		if(a<b) {
			swap(a,b);
		}
		if(b == 0) {
			return a;
		}
		return gcd(b , a % b);
	}
	static int lcm(int a, int b) {
		return a * b / gcd(a,b);
	}
	public static void main(String[] args) {
		System.out.println("最大公约数为："+gcd(60,45));
		System.out.println("最小公倍数为："+lcm(60,45));
	}
}
