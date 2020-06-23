import java.util.Scanner;

public class AlphabetGame {
	static int game(String s) {
		if(s.contains("LOL"))
			return -1;
		if(s.contains("*") == false)
			return 0;
		
		boolean ping = false;
		
		char[] x = s.toCharArray();
		
		for(int i = 0;i<x.length;i++) {
			if(x[i] == '*') {
				try {
					x[i] = 'L';
					switch(game(String.valueOf(x))){
						case -1 : return 1;
						case 0: ping = true;
					}
					x[i] = 'O';
					switch(game(String.valueOf(x))){
						case -1 : return 1;
						case 0: ping = true;
					}
				}
				finally {
					x[i] = '*';
				}
			}
		}
		if(ping)
			return 0;
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String[] srr = new String[n];
		for(int i = 0;i<n;i++) {
			srr[i] = sc.next();
		}
		
		for(int i = 0;i<n;i++) {
			System.out.println(game(srr[i]));
		}
	}
}
