
public class rankAndGet {
	public static int Get(int sum,int value) {
		if(sum == value)   return 1;
		if(value == 0)    return 1;
		return Get(sum - 1,value)+Get(sum - 1,value - 1);
	}
	public static void main(String[] args) {
		System.out.println(Get(5,3));
	}
}
