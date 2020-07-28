import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class RiskMeasurement {
	static void fan_zu(int[][] re, int me, int goal){
		if(re[me][3] <= goal) return;
		re[me][3] = goal;
		fan_zu(re, re[me][2], goal); 
	}
	
	static void dfs(List[] gr, int[][] re, int v1, int v2){
		if(v1==v2) return;
		
		for(Object obj: gr[v1]){
			int it = (Integer)obj;
			if(re[it][0] > 0){
				fan_zu(re,v1,re[it][1]);  // 更新整个家族的返祖级
				continue;
			}
			
			re[it][0] = 1;
			re[it][1] = re[v1][1]+1;
			re[it][2] = v1;
			re[it][3] = re[v1][1];
			dfs(gr,re,it,v2);
		}
	}
	
	static int solve(int[][] re, int root, int leaf){
		int sum = 0;
		int p = leaf;
		int min = re[p][3];  // 当前最高(小)返祖级
		while(true){
			int pa = re[p][2];
			System.out.println("pa " + pa);
			if(pa==0 || pa==root) break;
			if(re[pa][1] <= min) sum++;
			if(re[pa][3] < min) min = re[pa][3];
			p = pa;
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String[] ss = scan.nextLine().trim().split(" ");
		int m = Integer.parseInt(ss[0]); //节点数
		int n = Integer.parseInt(ss[1]); //边数
		
		List[] gr = new List[m+1];    // 顶点 --> list(顶点)
		for(int i=0; i<gr.length; i++) gr[i] = new Vector();
		
		int[][] re = new int[m+1][4]; // dfs生成树结果： 顶点 --> (可见性, 深度, 父节点, 最高返祖) 
		
		for(int i=0; i<n; i++){
			ss = scan.nextLine().trim().split(" ");
			int v1 = Integer.parseInt(ss[0]);
			int v2 = Integer.parseInt(ss[1]);
			gr[v1].add(v2);
			gr[v2].add(v1);
		}
		
		ss = scan.nextLine().trim().split(" ");
		int a = Integer.parseInt(ss[0]);
		int b = Integer.parseInt(ss[1]);
		
		re[a][0] = 1;
		re[a][1] = 0;
		re[1][3] = 0;
		dfs(gr,re,a,b);	
		
		System.out.println(solve(re,a,b));	
	}
	
	static void debug(int[][] re){
		for(int i=0; i<re.length; i++){
			System.out.println(i + ": " + re[i][0] + "," + re[i][1] + "," + re[i][2] + "," + re[i][3]);
		}
	}
}
