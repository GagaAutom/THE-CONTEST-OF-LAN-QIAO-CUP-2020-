
public class nimPile {
	static void Nim(int[] a) {
		int sum = 0;
		for(int i = 0;i<a.length;i++) {
			sum ^= a[i];
		}
		if(sum == 0) {
			System.out.println("±ØÊä");
		}
		
		for(int i = 0;i<a.length;i++) {
			int x = sum ^ a[i];
			
			if(x < a[i]) {
				System.out.println(a[i]+"-->"+x);
			}
		}
	}
	public static void main(String[] args) {
		int[] a = {3,4,5};
		Nim(a);
	}
}
