
public class arithmeticFiller {
	public static void filler(int[] element,int locat,String result,int goal) {
		if(locat <= 0) {
			if(goal == element[0]) {
				System.out.println(element[0]+result);
			}
			return;
		}
		filler(element,locat-1,"+"+element[locat]+result,goal-element[locat]);
		filler(element,locat-1,"-"+element[locat]+result,goal+element[locat]);
		
		int temp = element[locat-1];
		element[locat-1] = Integer.parseInt(""+element[locat-1]+element[locat]);
		filler(element,locat-1,result,goal);
		element[locat-1] = temp;
		
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9};
		filler(a,8,"",110);
	}
}
