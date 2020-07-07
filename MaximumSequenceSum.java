
public class MaximumSequenceSum {
	static int f(int[] a, int begin, int end){
		if(end-begin==1){
			if(a[begin] > 0) return a[begin];
			return 0;
		}
		
		int k = (begin+end)/2;
		int t1 = f(a,begin,k);
		int t2 = f(a,k,end);
		
		int t3a = 0;
		int sum = 0;
		for(int i=k-1; i>=begin; i--){
			sum += a[i];
			if(sum > t3a) t3a = sum;
		}
		
		int t3b=0;
		sum = 0;
		for(int i=k; i<end; i++){
			sum += a[i];
			if(sum > t3b) t3b = sum;
		}
		
		int t3 = t3a + t3b;
		
		int max = 0;
		if(t1 > max) max = t1;
		if(t2 > max) max = t2;
		if(t3 > max) max = t3;
		
		return max;
	}
	
	static int work(int[] a){
		return f(a,0,a.length);
	}
	
	public static void main(String[] args){
		System.out.println(work(new int[]{2,4,-7,5,2,-1,2,-4,3}));
	}
//	static int solution(int[] arr,int begin,int end) {
//		if(end - begin == 1)
//			return arr[begin];
//		
//		int mod = (begin+end) /2;
//		int temp_L = solution(arr,begin,mod);
//		int temp_R = solution(arr,mod,end);
//		
//		int max_L = 0;
//		int sum = 0;
//		for(int i = begin;i<mod;i++) {
//			sum += arr[i];
//			if(sum > max_L)
//				max_L = sum;
//		}
//		
//		int max_R = 0;
//		sum = 0;
//		for(int i = mod;i<end;i++) {
//			sum += arr[i];
//			if(sum > max_R)
//				max_R = sum;
//		}
//		
//		int max = max_R + max_L;
//		
//		if(temp_L > max)
//			return temp_L;
//		else if(temp_R > max)
//			return temp_R;
//		else
//			return max;
//	}
//	public static void main(String[] args) {
//		int[] a = {2,4,-7,5,2,-1,2,-4,3};
//		System.out.println(solution(a,0,a.length));
//	}
}
