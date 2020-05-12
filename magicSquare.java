import java.util.Scanner;

public class magicSquare {
	public static boolean equals(String s1,String s2) {
		for(int i =0;i<s1.length();i++) {
			if(s1.charAt(i)==s2.charAt(i))  continue;
			else if(s2.charAt(i)=='0')  continue;
			else return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String[] srr = {
				"492357816",
				"834159672",
				"618753294",
				"296951438",
				"816357492",
				"294753618",
				"672159834"
		};
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		for(int i = 0;i<srr.length;i++) {
			if(equals(srr[i],s)) {
				System.out.print(srr[i]);
			}
		}
	}
}
