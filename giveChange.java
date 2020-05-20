
public class giveChange {
	public static int change(int m,int n) {
		if(m==0)
			return 1;
		if(n==0)
			return 0;
		if(m<n)
			return 0;
		return change(m-1,n)+change(m,n-1);
	}
	public static void main(String[] args) {
		System.out.println(change(5,3));
	}
}
