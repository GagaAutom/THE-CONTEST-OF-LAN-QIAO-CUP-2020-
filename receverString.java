
public class receverString {
	public static String recever(String s) {
		if(s.length()<=1) {
			return s;
		}
		return recever(s.substring(1))+s.charAt(0);
	}
	public static void main(String[] args) {
		String s = "abcd";
		System.out.println(recever(s));
	}
}
