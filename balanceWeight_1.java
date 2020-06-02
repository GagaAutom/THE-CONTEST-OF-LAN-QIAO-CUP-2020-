
public class balanceWeight_1 {
	public static String balance(int n) {
		String s = "";
		
		int q = 1;
		while(n > 0) {
			int shang = n / 3;
			
			if(n % 3 == 1) 
				s = "+"+ q +s;
			if(n % 3 == 2) {
				shang++;
				s = "-"+q+s;
			}
			n = shang;
			q *= 3;
		}
		return s.substring(1);
	}
	public static void main(String[] args) {
		for(int i = 1;i<100;i++) {
			System.out.println(i+":"+balance(i));
		}
	}
}
