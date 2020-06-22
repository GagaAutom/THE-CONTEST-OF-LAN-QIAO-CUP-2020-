
public class TakeBallGame {
	static boolean takeBall(int n) {
		if(n == 0)
			return true;
		
		if(n >= 1 && takeBall(n-1) == false)
			return true;
		if(n >= 3 && takeBall(n-1) == false)
			return true;
		if(n >= 7 && takeBall(n-1) == false)
			return true;
		if(n >= 8 && takeBall(n-1) == false)
			return true;
		return false;
	}
	public static void main(String[] args) {
		for(int i = 1;i<50;i++) {
			System.out.println(i+":"+takeBall(i));
		}
	}
}
