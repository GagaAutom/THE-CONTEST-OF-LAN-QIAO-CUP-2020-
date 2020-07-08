
public class MaximumSequenceSum {
	static int solution(int[] arr,int begin,int end) {
		if(end-begin==1)
			return arr[begin];
		
		int mod = (begin+end) /2;
		int temp_L = solution(arr,begin,mod);
		int temp_R = solution(arr,mod,end);
		
		int max_L = 0;
		int sum = 0;
		for(int i = mod - 1;i>=begin;i--) {
			sum += arr[i];
			if(sum > max_L)
				max_L = sum;
		}
		
		int max_R = 0;
		sum = 0;
		for(int i = mod;i<=end;i++) {
			sum += arr[i];
			if(sum > max_R)
				max_R = sum;
		}
		
		int max = max_R + max_L;
		
		if(temp_L > max)
			return temp_L;
		else if(temp_R > max)
			return temp_R;
		else
			return max;
	}
	public static void main(String[] args) {
		int[] a = {2,4,-7,5,2,-1,2,-4,3};
		System.out.println(solution(a,0,a.length-1));
	}
}
