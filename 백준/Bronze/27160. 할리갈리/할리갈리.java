import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> hm = new HashMap<>();
		int n = Integer.parseInt(sc.next());
		hm.put("BANANA", 0);
		hm.put("STRAWBERRY", 0);
		hm.put("LIME", 0);
		hm.put("PLUM", 0);
		for(int i= 0 ; i < n ; i++) {
			String s = sc.next();
			int amount = Integer.parseInt(sc.next());
			if( s.equals("BANANA")) {
				int num = hm.get("BANANA");
				hm.put("BANANA", num+amount);
			} else if(s.equals("STRAWBERRY")) {
				int num = hm.get("STRAWBERRY");
				hm.put("STRAWBERRY", num+amount);
			} else if(s.equals("LIME")) {
				int num = hm.get("LIME");
				hm.put("LIME", num+amount);
			} else if(s.equals("PLUM")) {
				int num = hm.get("PLUM");
				hm.put("PLUM", num+amount);
			}
		}
		
		for(String s : hm.keySet()) {
			if( hm.get(s) == 5) {
				System.out.println("YES");
				return ; 
			}
		}
		System.out.println("NO");
	}

}
