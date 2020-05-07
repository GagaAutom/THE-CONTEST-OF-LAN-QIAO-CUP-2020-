import java.util.Scanner;

public class romaNumber2 {
	
	static String numToRom(int x) {
		String s = "";
		int th = x / 1000;
		int hu = x % 1000 / 100;
		int te = x % 100 / 10; 
		int on = x % 1000;
		
		if(th == 3)  s += "MMM";
		if(th == 2)  s += "MM";
		if(th == 1)  s += "M";
		
		if(hu == 9)  s += "CM";
		if(hu == 8)  s += "DCCC";
		if(hu == 7)  s += "DCC";
		if(hu == 6)  s += "DC";
		if(hu == 5)  s += "D";
		if(hu == 4)  s += "CD";
		if(hu == 3)  s += "CCC";
		if(hu == 2)  s += "CC";
		if(hu == 1)  s += "C";
		
		if(te == 9)  s += "XC";
		if(te == 8)  s += "LXXX";
		if(te == 7)  s += "LXX";
		if(te == 6)  s += "LX";
		if(te == 5)  s += "L";
		if(te == 4)  s += "XL";
		if(te == 3)  s += "XXX";
		if(te == 2)  s += "XX";
		if(te == 1)  s += "X";
		
		if(on == 9)  s += "IX";
		if(on == 8)  s += "VIII";
		if(on == 7)  s += "VII";
		if(on == 6)  s += "VI";
		if(on == 5)  s += "V";
		if(on == 4)  s += "IV";
		if(on == 3)  s += "III";
		if(on == 2)  s += "II";
		if(on == 1)  s += "I";
		
		return s;
	}
	
	static boolean romaNumberJurge(String s) {
		for(int i = 0;i < 4000;i++) {
			if(s.equals(numToRom(i))) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(romaNumberJurge(s));
	}
	
}
