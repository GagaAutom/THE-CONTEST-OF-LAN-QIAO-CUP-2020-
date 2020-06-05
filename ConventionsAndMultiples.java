
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
		System.out.println("���Լ��Ϊ��"+gcd(60,45));
		System.out.println("��С������Ϊ��"+lcm(60,45));
	}
}
