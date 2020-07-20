
public class WallPainting {
	static long MM = 1000000007;
	// 从某个边缘格子开始，到它相邻的边缘格子结束的所有情况
	static long fb(int n)
	{
		if(n==1) return 1;
		return fb(n-1) * 2 % MM;
	}
	
	// 从某个边缘格子开始的所有情况
	static long fa(int n)
	{
		if(n==1) return 1;
		if(n==2) return 6;
		return (2 * fa(n-1) + 4 * fa(n-2) + fb(n)) % MM;
	}
	
	// 规模为n的问题之中间第i格
	static long fk(int i, int n)
	{
		//return fb(i) * fa(n-i) * 2 * 4 % MM; //相当于镜像互换了
		return (fb(i)*fa(n-i)*2 % MM + fb(n-i+1)*fa(i-1)*2 % MM) * 2 % MM;
	}
	
	static long f(int n)
	{
		if(n==1) return 2;
		
		long sum = fa(n) * 4 % MM;
		for(int i=2; i<n; i++){
			sum = (sum + fk(i,n)) % MM;
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		for(int i=1; i<30; i++){
			System.out.println(i + ": " + f(i));	
		}
	}
}
