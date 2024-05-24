import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		HashMap<String,String> hm = new HashMap<>();
		
		for(int i= 0 ; i< n ; i++) {
			String name = sc.next();
			String state = sc.next();
			hm.put(name, state);
		}
		
		ArrayList<String> list = new ArrayList();
		
		for(String name : hm.keySet()) {
			String state = hm.get(name);
			if( state.equals("enter")) {
				list.add(name);
			}
		}
		
		list.sort(Collections.reverseOrder());
		
		for(int i= 0 ; i < list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
	}

}
