
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
			sum += s.charAt(i) - '0';// ��ÿ��λ���������������Ǵ���		
			}		
		System.out.println("ת�����߽��ƺ�Ϊ��" + s);		
		System.out.println("����У�" + sum + "��");
	}
}
