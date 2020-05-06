import java.util.Scanner;

public class romeNumber {
	private static int romNum(String s) {
		int sum = 0;
		char[] arr = s.toCharArray();
		for(int i = 0;i<s.length();i++) {
			if(arr[i]=='I') sum += 1;
			if(arr[i]=='V') sum += 5;
			if(arr[i]=='X') sum += 10;
			if(arr[i]=='L') sum += 50;
			if(arr[i]=='C') sum += 100;
			if(arr[i]=='D') sum += 150;
			if(arr[i]=='M') sum += 1000;
		}
		//ÐÞÕý
		if(s.indexOf("IV") >= 0 ) sum -= 2;
		if(s.indexOf("IX") >= 0 ) sum -= 2;
		if(s.indexOf("XL") >= 0 ) sum -= 20;
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(romNum(s));
	}
}
