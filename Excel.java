import java.util.Scanner;

public class Excel {
	static String getExcelString(int n) {
		String s = "";
		while(n > 0) {
			if(n % 26 == 0) {
				s += 'Z';
				n /= 26;
				n--;
			}else {
				s += (char)('A' + n % 26 - 1);
				n /= 26;
			}
		}
		return s;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(getExcelString(n));
	}
}
