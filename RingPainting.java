
public class RingPainting {
	static long paint(int n) {
		if(n == 1)
			return 3;
		if(n == 2)
			return 6;
		if(n == 3)
			return 6;
		return 2 * paint(n - 2) + paint(n - 1);
	}
	public static void main(String[] args) {
		for(int i = 1;i<30;i++) {
			System.out.println(i+": "+paint(i));
		}
	}
}
