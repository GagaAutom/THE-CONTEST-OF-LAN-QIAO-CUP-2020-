import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class frogJump {
	static void move(char[] arr,int i,int step,Set frogs) {
		if(arr[i] == '*')
			return;
		int moved = i + step;
		if(moved < 0 || moved >= arr.length)
			return;
		if(arr[moved] != '*')
			return;
		
		arr[moved] = arr[i];
		arr[i] = '*';
		frogs.add(new String(arr));
		arr[i] = arr[moved];
		arr[moved] = '*';
	}
	static Set Frog(String frog) {
		Set s = new HashSet();
		char[] arr = frog.toCharArray();
		for(int i = 0;i<arr.length;i++) {
			move(arr,i,-1,s);
			move(arr,i,-2,s);
			move(arr,i,-3,s);
			move(arr,i,1,s);
			move(arr,i,2,s);
			move(arr,i,3,s);
		}
		return s;
	}
	static int Jump(Set begin,Set history,String goal) {
		if(begin.contains(goal))
			return 0;
		Set set = new HashSet();
		for(Object obj:begin) {
			Set temp = Frog(obj.toString());
			set.addAll(temp);
		}
		set.removeAll(history);
		if(set.isEmpty())
			return -1;
		history.addAll(set);
		int r = Jump(set,history,goal);
		if(r < 0)
			return r;
		return r+1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set begin = new HashSet();
		begin.add(sc.nextLine().trim());
		Set history = new HashSet();
		history.addAll(begin);
		System.out.println(Jump(begin,history,sc.nextLine().trim()));
	}
}
