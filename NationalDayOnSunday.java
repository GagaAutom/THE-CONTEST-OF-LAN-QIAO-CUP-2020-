
public class NationalDayOnSunday {
	static boolean isYearLeap(int y) {
		boolean tag = false;
		if(y % 4 == 0)
			tag = true;
		if(y % 100 == 0)
			tag = false;
		if(y % 400 == 0)
			tag = true;
		return tag;
	}
	
	static int daDate(int year,int month,int day) {
		int sumdays = 0;
		int[] M = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		for(int i = 1;i<year;i++) {
			sumdays += 365;
			
			if(isYearLeap(i)) {
				sumdays++;
			}
		}
		if(isYearLeap(year)) {
			M[2] = 29;
		}
		for(int i = 1;i<month;i++) {
			sumdays += M[i];
		}
		sumdays += day;
		return sumdays;
	}
	
	public static void main(String[] args) {
		int total = 0;
		int sum = 0;
		for(int i = 1950;i<2012;i++) {
			total = (daDate(i,10,1) - daDate(1949,10,2));
			if(total % 7 == 0) {
				System.out.println(i+"年10月1日");
				sum++;
			}
		}
		System.out.println("总数："+sum);
	}
}
