
public class RingPainting_updata {
	public static void main(String[] args) {
		long[] arr = new long[50+20];
		
		arr[1] = 3;
		arr[2] = 6;
		arr[3] = 6;
		
		for(int i = 4;i<60;i++) {
			arr[i] = 2 * arr[i-2] + arr[i-1];
		}
		
		for(int i = 1;i<60;i++) {
			System.out.println(i+": "+arr[i]);
		}
	}
}
