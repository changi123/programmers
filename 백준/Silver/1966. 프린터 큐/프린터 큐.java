import java.util.*;


public class Main {
	static Queue<HashMap<Integer, Integer>> q = new LinkedList();
	static PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
	static int cnt ; 
	static boolean flag ;
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.next());
		int checkNum = 0;
		while(T-- > 0){
			int n = Integer.parseInt(sc.next());
			int m = Integer.parseInt(sc.next());
			
			for(int i= 0 ; i < n  ; i++) {
				HashMap<Integer, Integer> hm = new HashMap<>();
				if( i == m ) {
					int a = Integer.parseInt(sc.next());
					hm.put(a,1);
					pq.offer(a);
					checkNum = a ;
				}else {
					int a = Integer.parseInt(sc.next());
					pq.offer(a);
					hm.put(a, 0);
				}
				q.offer(hm);
				
				
			}
			
			maxCheck(checkNum);
			if( n == 1 ) {
				System.out.println(1);
				cnt= 0 ; 
				q.clear();
				pq.clear();
				flag = false;
				continue;
				
			}	
			System.out.println(cnt);
			cnt= 0 ; 
			flag = false;
			q.clear();
			pq.clear();
		}
	}
public static void maxCheck(int checkNum) {
		HashMap<Integer,Integer> hm = q.peek(); 
		for(int num : hm.keySet()) {
			if( flag ) {
				return ;
			}
			int max = pq.peek();
			int val = hm.get(num);
			if( max == checkNum && num == checkNum &&  val == 1) {
				cnt++;
				flag= true;
				return ;
			} else if( max == checkNum && num == checkNum) { 
				cnt++;
				q.poll();
				maxCheck(checkNum);
			} else if( max == num && checkNum!=num) {
				pq.poll();
				q.poll();
				cnt++;
				maxCheck(checkNum);
			} else {
				q.offer(q.poll());
				maxCheck(checkNum);
			}
			
			

			
		}
	}
}
