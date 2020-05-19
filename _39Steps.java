public class _39Steps {
	public static int leftSteps(int n) {
		if(n <= 0)
			return 0;
		if(n == 1)
			return 1;
		return rightSteps(n-1)+rightSteps(n-2);
	}
	public static int rightSteps(int n) {
		if(n <= 0)
			return 1;
		if(n == 1)
			return 0;
		return leftSteps(n-1)+leftSteps(n-2);
	}
	public static void main(String[] args) {
		System.out.println(rightSteps(39));
	}
}
