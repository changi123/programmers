import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int i = 0 ;
		ArrayList<String> list = new ArrayList();
		while(i < s.length()) {
			String sr = s.substring(i);
			list.add(sr);
			i++;
			
		}
		
		list.sort(null);
		
		for(String slist : list) {
			System.out.println(slist);
		}
	}

}
