import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		
		
		ArrayList<Integer> list = new ArrayList();
		
		
		for(int i= 0 ; i < n; i ++) {
			String s = sc.next();
			if( !list.contains(s)) {
				list.add(Integer.parseInt(s));
			}
		}
		
	
//		System.out.println(list.toString());
		
		list.sort(null);
		
		for(int i= 0 ; i <list.size(); i ++) {
			System.out.println(list.get(i));
		}
		
		
	}

}
