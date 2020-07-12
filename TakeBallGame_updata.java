import java.util.HashMap;
import java.util.Map;

public class TakeBallGame_updata {
	static Map map = new HashMap();
	static boolean takeBall(int n) {
		boolean temp = false;
		if(map.get(n) != null)
			return (boolean)map.get(n);
		if(n >= 1 && takeBall(n-1) == false)
			temp = true;
		if(n >= 3 && takeBall(n-1) == false)
			temp = true;
		if(n >= 7 && takeBall(n-1) == false)
			temp = true;
		if(n >= 8 && takeBall(n-1) == false)
			temp = true;
		map.put(n, temp);
		return temp;
	}
	public static void main(String[] args) {
		map.put(0, true);
		for(int i = 1;i<=50;i++) {
			System.out.println(i+":"+takeBall(i));
		}
	}
}
