
//从“AABBBCCD”中取3个，有多少取法？
public class stringGetString {
	public static void show(int[] time) {
		for(int i = 0;i<time.length;i++) {
			for(int j = 0;j<time[i];j++) {
				System.out.print((char)('A'+i));
			}
		}
		System.out.println();
	}
	public static void Get(int[] data,int[] time,int index,int goal) {
		if(index == time.length) {
			if(goal == 0)
				show(time);
				return;
		}
		for(int i = 0;i<= Math.min(data[index], goal);i++) {
			time[index] = i;
			Get(data,time,index+1,goal-i);
		}
		time[index] = 0;
	}
	public static void main(String[] args) {
		int[] a = {2,3,2,1};
		int[] time = new int[a.length];
		
		Get(a,time,0,3);
	}
}
