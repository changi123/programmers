import java.util.*;


public class Main {
static PriorityQueue<Integer> pq = new PriorityQueue<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		for(int i= 0 ; i < n ; i++) {
			pq.offer(Integer.parseInt(sc.next()));
		}
			if( n ==1 ) {
			System.out.println(0);
			return ;
		}
		int priSum = 0 ;
		int answer =0 ; 
		int i = 0 ; 
		while(!pq.isEmpty()) {
			if( i>=2 ) {
				pq.offer(priSum);
				answer+=priSum;
				priSum = 0 ; 
				i= 0 ;
			}else {				
				priSum+=pq.poll();
				i++;
			}
			if( pq.size() == 0) {
				answer+=priSum;
				break;
			}
			
		}
		System.out.println(answer);

	}

}
