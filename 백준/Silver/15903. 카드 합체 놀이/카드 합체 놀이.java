import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
		PriorityQueue<Long> pq = new PriorityQueue<>();
		long n = Long.parseLong(sc.next());
		long count = Long.parseLong(sc.next());
		for(int i =0 ;  i< n ; i ++) {
			pq.offer(Long.parseLong(sc.next()));
		}
		
		while(count-- > 0 ) {
			if( pq.size() < 2 ) {
				break;
			}
			long x = pq.poll();
			long y = pq.poll();
			long sum = x+y ; 
			pq.offer(sum);
			pq.offer(sum);
		}
		long answer = 0  ;
		while(!pq.isEmpty()) {
			answer+= pq.poll();
		}
		
		System.out.println(answer);
	}

}
