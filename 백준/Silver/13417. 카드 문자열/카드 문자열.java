import java.util.*;


public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.next());
		
		while(T--  > 0 ) {
			int n = Integer.parseInt(sc.next());
			Deque<String> dq = new ArrayDeque<>();
			dq.addFirst(sc.next());
			StringBuilder sb = new StringBuilder();
			for(int i = 1 ; i < n ; i++) {
				String s = sc.next(); //k
				String compare = dq.peek(); //m
				if(compare.compareTo(s) < 0 ) {
					dq.addLast(s);
				}else {
					dq.addFirst(s);
				}
			}
			for(String s : dq) {
				sb.append(s);
			}
			System.out.println(sb);
//			System.out.println(dq.toString());
		}
	}

}
