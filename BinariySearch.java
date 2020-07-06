
public class BinariySearch {
	static boolean search(int[] arr,int x) {
		int L = 0;
		int R = arr.length - 1;
		while(L<=R) {
			int mod = (L+R) / 2;
			if(x > mod)
				L = mod + 1;
			else if(x < mod)
				R = mod - 1;
			else
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,0};
		
		System.out.println(search(a,88));
	}
}
