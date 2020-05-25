import java.util.Arrays;

//从“AABBBCCD”中取3个，有多少取法？
public class stringGetString {
	public static void Get(int[] a,int[] time,int index,int goal) {
		if(index == time.length) {
			System.out.println(Arrays.toString(time));
			return;
		}
		for(int i = 0;i<=Math.min(a[index], goal);i++) {
			time[index] = i;
			Get(a,time,index+1,goal-i);
		}
	}
	public static void main(String[] args) {
		int[] a = {2,3,2,1};
		int[] time = new int[a.length];
		
		Get(a,time,0,3);
	}
}
