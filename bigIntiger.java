
public class bigIntiger {
	static String zero(int n) {
		if(n == 0)
			return "";
		if(n == 1)
			return "0";
		return zero(n/2) + zero(n/2) + zero(n%2);
	}
	
	static String bigAdd(String a,String b) {
		if(a.length() <= 8 && b.length() <= 8)
			return Integer.parseInt(a) + Integer.parseInt(b) + "";
		String a_L = "0";
		String a_R = a;
		if(a.length() > 8) {
			a_L = a.substring(0,a.length()-8);
			a_R = a.substring(a.length() - 8);
		}
		
		String b_L = "0";
		String b_R = b;
		if(b.length() > 8) {
			b_L = b.substring(0,b.length()-8);
			b_R = b.substring(b.length() - 8);
		}
		
		String half_latter = bigAdd(a_R,b_R);
		
		while(half_latter.length() < 8)
			half_latter = "0" + half_latter;
		
		if(half_latter.length() > 8)
			return bigAdd(bigAdd(a_L,b_L),"1") + half_latter.substring(1);
		
		return bigAdd(a_L,b_L) + half_latter;
	}
	
	static String bigMulti(String a,String b) {
		if(a.length() <= 4 && b.length() <= 4)
			return Integer.parseInt(a) * Integer.parseInt(b) + "";
		if(a.length() > 4) {
			int mod = a.length() / 2;
			
			String a_L = a.substring(0,mod);
			String a_R = a.substring(mod);
			
			return bigAdd(bigMulti(a_L,b)+zero(a_R.length()),bigMulti(a_R,b));
		}
		
		return bigMulti(b,a);
	}
	public static void main(String[] args) {
		System.out.println(bigMulti("1234567890987654321666","1234567890123456789555"));
	}
}
