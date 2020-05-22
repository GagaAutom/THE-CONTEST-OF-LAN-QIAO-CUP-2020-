//字符串全排列无List实现
public class fullPermutationString_2 {
	public static void fullP(char[] srr,int index) {
		if(index == srr.length-1) {
			System.out.println(String.valueOf(srr));
			return;
		}
		
		for(int i = index;i<srr.length;i++) {
			char temp = srr[index];
			srr[index] = srr[i];
			srr[i] = temp;
			
			fullP(srr,index+1);
			
			temp = srr[index];
			srr[index] = srr[i];
			srr[i] = temp;
		}
	}
	public static void main(String[] args) {
		String s = "ABC";
		fullP(s.toCharArray(),0);
	}
}
