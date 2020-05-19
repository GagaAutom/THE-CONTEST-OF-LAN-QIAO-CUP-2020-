public class stackIssue {
	public static int stack(int n,int m) {
		if(n <= 0)
			return 1;
		if(m <= 0)
			return stack(n-1,1);
		return stack(n-1,m+1) + stack(n,m-1);
	}
	public static void main(String[] args) {
		for(int i = 1;i<17;i++) {
			System.out.println(i+":"+stack(i,0));
		}
	}
}
