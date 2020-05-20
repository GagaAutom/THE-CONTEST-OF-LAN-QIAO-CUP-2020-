
public class magicString {
	public static int conbination(int x,int y) {
		if(x == 0)
			return 1;
		if(y == 0)
			return 1;
		return conbination(x-1,y)+conbination(x,y-1);
	}
	public static void main(String[] args) {
		System.out.println(conbination(5,4));
	}
}
