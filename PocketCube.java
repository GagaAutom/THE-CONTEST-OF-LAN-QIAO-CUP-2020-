import java.util.Scanner;

public class PocketCube {
	static String[][] before = new String[6][4];
	static String[][] after = new String[6][4];
	public static void init() {
		for(int i = 0;i<6;i++) {
			for(int j = 0;j<4;j++) {
				before[i][j]=after[i][j];
			}
		}
	}
	public static void shift_x() {
		after[0][0] = before[0][2];
		after[0][1] = before[0][0];
		after[0][2] = before[0][3];
		after[0][3] = before[0][1];
		
		after[2][0] = before[4][2];
		after[2][2] = before[4][3];
		
		after[3][1] = before[5][3];
		after[3][3] = before[5][2];
		
		after[4][3] = before[3][1];
		after[4][2] = before[3][3];
		
		after[5][2] = before[2][0];
		after[5][3] = before[2][2];
	}
	public static void shift_y() {
		after[2][0] = before[2][2];
		after[2][1] = before[2][0];
		after[2][2] = before[2][3];
		after[2][3] = before[2][1];
		
		after[1][0] = before[4][3];
		after[1][2] = before[4][1];
		
		after[0][1] = before[5][2];
		after[0][3] = before[5][0];
		
		after[4][1] = before[0][1];
		after[4][3] = before[0][3];
		
		after[5][0] = before[1][0];
		after[5][2] = before[1][2];
	}
	public static void shift_z() {
		after[4][0] = before[4][2];
		after[4][1] = before[4][0];
		after[4][2] = before[4][3];
		after[4][3] = before[4][1];
		
		after[2][0] = before[1][0];
		after[2][1] = before[1][1];
		
		after[3][0] = before[0][0];
		after[3][1] = before[0][1];
		
		after[1][0] = before[3][0];
		after[1][1] = before[3][1];
		
		after[0][0] = before[2][0];
		after[0][1] = before[2][1];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[][] a= {
				{"ÂÌ","ÂÌ","ÂÌ","ÂÌ"},
				{"À¶","À¶","À¶","À¶"},
				{"ºì","ºì","ºì","ºì"},
				{"³È","³È","³È","³È"},
				{"°×","°×","°×","°×"},
				{"»Æ","»Æ","»Æ","»Æ"}
		};
		after = a;
		for(int i = 0;i<s.length();i++) {
			init();
			if(s.charAt(i) == 'x') {
				shift_x();
			}else if(s.charAt(i) == 'y') {
				shift_y();
			}else if(s.charAt(i) == 'z') {
				shift_z();
			}else {
				System.out.println("input Erro!");
			}
		}
		System.out.println(after[0][1]+""+after[2][0]+after[4][3]);
	}
}
