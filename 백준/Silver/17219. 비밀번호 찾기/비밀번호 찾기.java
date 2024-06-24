import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		HashMap<String, String> hm = new HashMap<>();
		for(int i= 0 ; i <n ; i++) {
			hm.put(sc.next(), sc.next());
		}
		
		for(int i= 0 ; i < m ; i++) {
			
			String key = sc.next();
			System.out.println(hm.get(key));
			
		}
	}

}
