import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		int powerN = n*n;
		while( powerN -- >0) {
			pq.offer(Integer.parseInt(sc.next()));
		}
		
		while(n-- > 1 ) {
			pq.poll();
		}
		System.out.println(pq.poll());
	}

}
