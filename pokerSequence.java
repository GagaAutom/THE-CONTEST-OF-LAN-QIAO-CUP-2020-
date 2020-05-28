import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class pokerSequence {
	static Set set = new TreeSet();
	public static List<String> Rank(String s){
		List list = new LinkedList();
		if(s.length() == 1) {
			list.add(s);
			return list;
		}
		for(int i = 0;i<s.length();i++) {
			char c = s.charAt(i);
			List<String> temp = Rank(s.substring(0,i)+s.substring(i+1));
			for(int j = 0;j<temp.size();j++) {
				list.add(""+c+temp.get(j));
			}
		}
		return list;
	}
	public static void main(String[] args) {
		String s = "AA223344";
		List<String> list = Rank(s);
		for(int i = 0;i<list.size();i++) {
			if(list.get(i).lastIndexOf('A')-list.get(i).indexOf('A') == 2) {
				if(list.get(i).lastIndexOf('2')-list.get(i).indexOf('2') == 3) {
					if(list.get(i).lastIndexOf('3')-list.get(i).indexOf('3') == 4) {
						if(list.get(i).lastIndexOf('4')-list.get(i).indexOf('4') == 5) {
							set.add(list.get(i));
						}
					}
				}
			}
		}
		for(Object a:set) {
			System.out.println(a);
		}
	}
}
