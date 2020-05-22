import java.util.LinkedList;
import java.util.List;

public class fullPermutationString {
	public static List fullP(String s) {
		List list = new LinkedList();
		if(s.length() == 1) {
			list.add(s);
			return list;
		}
		for(int i = 0;i<s.length();i++) {
			char locat = s.charAt(i);
			List t = fullP(s.substring(0,i)+s.substring(i+1));
			for(int j = 0;j<t.size();j++) {
				list.add(""+locat+t.get(j));
			}
		}
		
		return list;
	}
	public static void main(String[] args) {
		String s = "ABC";
		List l = fullP(s);
		for(int i =0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
	}
}
