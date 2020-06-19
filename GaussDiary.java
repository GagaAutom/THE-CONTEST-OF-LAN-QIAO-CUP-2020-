
public class GaussDiary {
	static boolean isLeapYear(int year) {
		boolean tag = false;
		if(year % 4 == 0)   tag = true;
		if(year % 100 == 0)  tag = false;
		if(year % 400 == 0)  tag = true;
		return tag;
	}
	static String day_jurge(int days) {
		String s = "";
		int year = 1777;
		int month = 4;
		int day = 30;
		int[] M = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		while(day != days) {
			days--;
			if(isLeapYear(year)) {
				M[2] = 29;
			}else {
				M[2] = 28;
			}
			if(day > M[month]) {
				month++;
				if(month > 12) {
					month = 1;
					year++;
				}
				day = 0;
			}
			day++;
		}
		s = s + year +"-"+month+"-"+day;
		return s;
	}
	public static void main(String[] args) {
		System.out.println(day_jurge(8113));
	}
}
