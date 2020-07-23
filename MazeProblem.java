import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MazeProblem {		
	static int maze(char[][] data,Set come,String goal) {
		if(come.contains(goal))
			return 0;
		
		Set set = new HashSet();
		
		for(Object object : come) {
			String[] crr = ((String)object).split(",");
			
			int y = Integer.parseInt(crr[0]);
			int x = Integer.parseInt(crr[1]);
			
			if(y > 0 && data[y - 1][x] == '.') {
				data[y - 1][x] = '*';
				set.add(y-1 + "," + x);
			}
			
			if(y < data.length - 1 && data[y + 1][x] == '.') {
				data[y + 1][x] = '*';
				set.add(y+1 +","+x);
			}
			
			if(x > 0 && data[y][x - 1] == '.') {
				data[y][x - 1] = '*';
				set.add(y+","+(x - 1));
			}
			
			if(x < data[0].length - 1 && data[y][x + 1] == '.') {
				data[y][x + 1] = '*';
				set.add(y+","+(x + 1));
 			}
		}
		if(set.isEmpty())
			return -1;
		int r = maze(data,set,goal);
		if(r < 0)
			return -1;
		return r + 1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int m = Integer.parseInt(sc.nextLine());
		
		char[][] data = new char[n][];
		for(int i = 0;i<data.length;i++) {
			data[i] = sc.nextLine().trim().toCharArray();
		}
		
		Set set = new HashSet();
		set.add("0,0");
		System.out.println(maze(data,set,n-1 + "," + (m-1)));
	}
}
