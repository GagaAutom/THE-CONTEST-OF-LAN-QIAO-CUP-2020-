import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LiquorDistribution {
	static Set dispose(String liquor) {
		int[] bottle = {9,7,4,3};//瓶子的容积
		int[] data = new int[4];
		String[] ss = liquor.split(" ");
		for(int i = 0;i<4;i++)
			data[i] = Integer.parseInt(ss[i]);
		
		Set set = new HashSet();
		for(int i = 0;i<4;i++) {//以i所在的瓶子为酒
			for(int j = 0;j<4;j++) {//以j所在瓶子为目标，将i向j倒入
				if(i == j)
					continue;
				if(data[i] == 0)
					continue;
				if(data[j] == bottle[j])
					continue;
				
				int sum = data[i] + data[j];
				int Vi = (sum <= bottle[j]) ? 0 : (sum - bottle[j]);//i所在的酒的瓶子
				int Vj = (sum <= bottle[j]) ? sum : bottle[j];//j所在的目标的的瓶子
				
				String result = "";
				for(int k = 0;k<4;k++) {
					if(k == i)
						result += Vi + " ";
					else if(k == j)
						result += Vj + " ";
					else
						result += data[k] + " ";
				}
				
				set.add(result.trim());
			}
		}
		return set;
	}
	static int distribute(Set history,Set begin,String end) {
		if(begin.contains(end))
			return 0;
		Set set = new HashSet();
		
		for(Object obj:begin) {
			Set temp = dispose(obj.toString());
			set.addAll(temp);
		}
		set.removeAll(history);
		if(set.isEmpty())
			return -1;
		history.addAll(set);
		int r = distribute(history,set,end);
		if(r < 0)
			return r;
		return r + 1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set begin = new HashSet();
		begin.add("9 0 0 0");
		Set history = new HashSet();
		history.addAll(begin);
		System.out.println(distribute(history,begin,sc.nextLine().trim()));
	}
}
