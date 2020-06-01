
public class balanceWeight {
	static String Reve(String s) {
		s = s.replace("+", "#");
		s = s.replace("-", "+");
		s = s.replace("#", "-");
		
		return "-"+s;
	}
	public static String Balance(int n) {
		int a = 1;
		while(n > a)
			a *= 3;
		if(a == n)  
			return ""+a;
		if(n <= a/2)  
			return a/3 + "+" + Balance(n - a/3);
		return a + Reve(Balance(a - n));
	}
	public static void main(String[] args) {
		for(int i = 1;i<100;i++) {
			System.out.println(i+":"+Balance(i));
		}
	}
}
