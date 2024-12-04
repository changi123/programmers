import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if(Math.abs(o1) > Math.abs(o2)) {
					return Math.abs(o1) - Math.abs(o2);
				}else if(Math.abs(o1) == Math.abs(o2)) {
					return o1 - o2;
				}else {
					return -1; 
				}
			}
		});
		StringBuilder sb = new StringBuilder();
		while(n-- >  0 ) {
			int num = Integer.parseInt(sc.next());
			
			if( num !=0 ) {
				pq.offer(num);
			} else if ( num == 0 ) {
				if( pq.isEmpty()) {
					sb.append(0+" "+"\n");
				} else {
					sb.append(pq.poll()+ " "+ "\n");
				}
			}
			
		}
		
		System.out.println(sb.toString());
		
	}

}
