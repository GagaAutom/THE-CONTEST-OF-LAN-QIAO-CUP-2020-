
public class printRecursion {
	public static void Print(int a,int b) {
		if(a < b) {
			Print(a,b-1);
		}
		System.out.print(b);
	}
	public static void main(String[] args) {
		Print(1,10);
	}
}
