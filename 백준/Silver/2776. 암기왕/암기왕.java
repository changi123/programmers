import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
		int T = Integer.parseInt(sc.next());
		
		while(T -- > 0) {
			
			HashSet<Integer> h = new HashSet<>();
			int n = Integer.parseInt(sc.next());
			for(int i= 0 ; i < n ; i++) {
				h.add(Integer.parseInt(sc.next()));
			}
			
			int m = Integer.parseInt(sc.next());
			StringBuilder sb = new StringBuilder();
			for(int i= 0 ; i < m ;i++) {
				int num = Integer.parseInt(sc.next());
				if(( h.contains(num))) {
					sb.append(1);
				}else {
					sb.append(0);
				}
				
				if( i == m-1) {
					break;
				}
				sb.append('\n');
			}
			System.out.println(sb.toString());
			
        }
	}

}
