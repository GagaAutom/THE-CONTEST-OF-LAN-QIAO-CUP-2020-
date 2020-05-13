import java.util.Scanner;

public class Luhn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int sum = 0;
		for(int i = 1;i<s.length();i++) {
			if(i%2==0) {
				int on = (s.charAt(i)-'0')*2;
				if(on>=10)   on -= 9;
				sum += on;
			}else {
				sum += (s.charAt(i)-'0');
			}
		}
		if(sum %10 == 0) {
			System.out.println("³É¹¦!");
		}else {
			System.out.println("Ê§°Ü!");
		}
	}
}
