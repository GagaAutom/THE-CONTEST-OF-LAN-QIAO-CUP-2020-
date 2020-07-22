import java.util.HashMap;
import java.util.Map;

public class RingPainting_updata2 {
	static Map<Integer,Long> map = new HashMap<>();
	static long paint(int n) {
		if(map.get(n) != null)
			return map.get(n);
		long temp = 2 * paint(n - 2) + paint(n - 1);
		map.put(n,temp);
		return temp;
	}
	public static void main(String[] args) {
		map.put(1,(long) 3);
		map.put(2,(long) 6);
		map.put(3,(long) 6);
		for(int i = 1;i<50;i++) {
			System.out.println(i+": "+paint(i));
		}
	}
}
