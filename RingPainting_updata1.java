
public class RingPainting_updata1 {
	static long paint(int n) {
		long one = 6;
		long two = 6;
		long thiry = 3;
		while(n > 3) {
			thiry = 2 * one  + two;
			one = two;
			two = thiry;
			n--;
		}
		return thiry;
	}
	public static void main(String[] args) {
		for(int i = 1;i<30;i++) {
			System.out.println(i+": "+paint(i));
		}
	}
}
