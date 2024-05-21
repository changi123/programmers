import java.util.*;


public class Main {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int i= 0 ; i < n ; i++) {
			int num = Integer.parseInt(sc.next());
			if( !hm.containsKey(num) ) {
				hm.put(num, 1);
			}else {
				int plusNum = hm.get(num);
				hm.put(num, plusNum+1);
			}
		}
		StringBuilder sb = new StringBuilder();
		int m = Integer.parseInt(sc.next());
		for(int i = 0 ; i < m ; i++) {
			int num = Integer.parseInt(sc.next());
			if( hm.containsKey(num)) {
				sb.append(hm.get(num)+ " ");
			}else {
				sb.append(0+ " ");
			}
		}
		System.out.println(sb);

	}

}
