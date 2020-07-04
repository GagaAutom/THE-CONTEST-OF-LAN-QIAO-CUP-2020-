import java.util.Scanner;

public class MatchGame {
	static void show(char[][] srr) {
		System.out.println();
		for(int i = 0;i<srr.length;i++) {
			System.out.println(String.valueOf(srr[i]));
		}
	}
	static boolean jurge(char[][] srr) {
		for(int i = 0;i<srr.length;i++) {
			String s = new String(srr[i]).replaceAll("0", "");
			if(s.contains("--"))
				return true;
		}
		for(int i = 0;i<srr[0].length;i++) {
			String s = (""+srr[0][i]+srr[1][i]+srr[2][i]).replaceAll("0", "");
			if(s.contains("11"))
				return true;
		}
		for(int i = 0;i<srr.length;i++) {
			for(int j = 0;j<srr[i].length;j++) {
				if(srr[i][j] == '0') {
					try {
						srr[i][j] = '1';
						if(jurge(srr) == false)
							return true;
						srr[i][j] = '-';
						if(jurge(srr) == false)
							return true;
					}
					finally {
						srr[i][j] = '0';
					}
				}
			}
		}
		return false;
	}
	
	static void solution(char[][] srr) {
		for(int i = 0;i<srr.length;i++) {
			for(int j = 0;j<srr[0].length;j++) {
				if(srr[i][j] == '0') {
					try {
						srr[i][j] = '1';
						if(jurge(srr) == false) {
							show(srr);
							return;
						}
						srr[i][j] = '-';
						if(jurge(srr) == false) {
							show(srr);
							return;
						}
					}
					finally {
						srr[i][j] = '0';
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[][] match = new char[3][];
		
		match[0] = sc.nextLine().trim().toCharArray();
		match[1] = sc.nextLine().trim().toCharArray();
		match[2] = sc.nextLine().trim().toCharArray();
		
		solution(match);
	}
}
