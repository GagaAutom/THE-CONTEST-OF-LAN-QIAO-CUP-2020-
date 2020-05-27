import java.util.LinkedList;
import java.util.List;

public class combination {
	public static List<String> Get(String s,int n) {
		List<String> list = new LinkedList();
		if(n == 0) {
			list.add("");
			return list;
		}
		for(int i = 0;i<s.length();i++) {
			char locat = s.charAt(i);
			List<String> temp = Get(s.substring(i+1),n-1);
			
			for(int j = 0;j<temp.size();j++) {
				list.add(""+locat+temp.get(j));
			}
		}
		return list;
	}
	public static void main(String[] args) {
		String s = "ABCDE";
		List<String> list = Get(s,3);
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
