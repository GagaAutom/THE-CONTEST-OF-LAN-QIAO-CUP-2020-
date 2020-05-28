
public class delegationVisit {
	public static void Show(int[] value) {
		for(int i = 0;i<value.length;i++) {
			System.out.print((char)('A'+i)+"¹ú:"+value[i]+" ");
		}
		System.out.println();
	}
	public static void Get(int[] data,int[] value,int index,int goal) {
		if(index == data.length) {
			if(goal == 0)
				Show(value);
			return;
		}
		for(int i = 0;i<=Math.min(data[index], goal);i++) {
			value[index] = i;
			
			Get(data,value,index+1,goal-i);
		}
		value[index] = 0;
	}
	public static void main(String[] args) {
		int[] data = {4,2,2,1,1,3};
		int[] value = new int[data.length];
		Get(data,value,0,5);
	}
}
