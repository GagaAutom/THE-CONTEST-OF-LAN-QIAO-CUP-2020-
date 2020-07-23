import java.util.Scanner;

public class Connectivity {
	static boolean connect(char[][] data,int y1,int x1,int y2,int x2) {
		if(y1 == y2 && x1 == x2)
			return true;
		char old = data[y1][x1];
		data[y1][x1] = '*';
		try {
			if(y1 > 0 && data[y1 - 1][x1] == old && connect(data,y1 - 1,x1,y2,x2))
				return true;
			if(y1 < data.length-1 && data[y1 + 1][x1] == old && connect(data,y1 + 1,x1,y2,x2))
				return true;
			if(x1 > 0 && data[y1][x1 - 1] == old && connect(data,y1,x1 - 1,y2,x2))
				return true;
			if(x1 < data.length-1 && data[y1][x1 + 1] == old && connect(data,y1,x1 + 1,y2,x2))
				return true;
		}
		finally{
			data[y1][x1] = old;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		char[][] data = new char[N][];
		for(int i=0; i<N; i++){
			data[i] = sc.nextLine().toCharArray();
		}
		
		int M = Integer.parseInt(sc.nextLine());
		for(int i=0; i<M; i++){
			String[] ss = sc.nextLine().split(" ");
			int y1 = Integer.parseInt(ss[0]);
			int x1 = Integer.parseInt(ss[1]);
			int y2 = Integer.parseInt(ss[2]);
			int x2 = Integer.parseInt(ss[3]);
			
			System.out.println(connect(data,y1,x1,y2,x2));
		}
	}
}
