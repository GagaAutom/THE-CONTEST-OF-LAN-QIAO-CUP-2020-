
public class DateDifferenceMatter {
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
	
	static int dayCalculation(int year1,int month1,int day1,
			                  int year2,int month2,int day2) {
		return daDate(year2,month2,day2) - daDate(year1,month1,day1);
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
		System.out.println(dayCalculation(1997,12,26,2020,06,21));
	}
}
