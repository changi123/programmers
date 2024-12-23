import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		int num = Integer.parseInt(sc.next()) ;
		for(int i= 1 ; i < n ; i++) {
			int su = Integer.parseInt(sc.next());
			pq.offer(su-num);
			num = su ;
		}
		
		while( ( k-1 ) > 0 ) {
			pq.poll();
			k--;
		}
		int sum  = 0 ; 
		while(!pq.isEmpty()) {
			sum+=pq.poll();
		}
		
		System.out.println(sum);
	}

}
