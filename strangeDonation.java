
public class strangeDonation {
	public static void main(String[] args) {
		String s = "";
		int n = 1000000;
		while(n != 0) {
			s += n % 7;
			n /= 7;
		}
		int sum = 0;		
		for (int i = 0; i < s.length(); i++) {			
			sum += s.charAt(i) - '0';// 把每个位的数加起来，就是答案了		
			}		
		System.out.println("转换成七进制后为：" + s);		
		System.out.println("最多有：" + sum + "份");
	}
}
