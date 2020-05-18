
public class comeBack {
	public static int pace(int x,int y) {
		if(x<=0 || y<=0) 
			return 1;
		return pace(x-1,y)+pace(x,y-1);
	}
	public static void main(String[] args) {
		System.out.println(pace(2,2));
	}
}
