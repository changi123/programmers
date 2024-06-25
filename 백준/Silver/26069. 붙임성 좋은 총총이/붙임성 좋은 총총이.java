import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		HashSet<String> hs = new HashSet<>();
		hs.add("ChongChong");
		for(int i= 0 ; i < n ; i++) {
			String firstName = sc.next();
			String secName = sc.next();
			if( hs.contains(firstName) || hs.contains(secName)) {
				hs.add(firstName);
				hs.add(secName);
			}
		}
		System.out.println(hs.size());
	}

}
