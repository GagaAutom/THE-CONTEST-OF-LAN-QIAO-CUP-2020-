
public class FightingMethodOfEminentMonks {
	static boolean nim(int[] nim) {
		int sum = 0;
		for(int i=0;i<nim.length-1;i+=2) {
			sum ^= nim[i+1] - nim[i] - 1;
		}
		return sum != 0;
	}
	static void solution(int[] arr) {
		for(int i = 0;i<arr.length-1;i++) {
			for(int j = arr[i]+1;j<arr[i+1];j++) {
				int old = arr[i];
				try {
					arr[i] = j;
					if(nim(arr) == false) {
						System.out.println(old+" "+j);
					}
				}
				finally {
					arr[i] = old;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		solution(new int[] {1,5,9});
		solution(new int[] {1,5,8,10});
	}
}
