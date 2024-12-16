import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int m = Integer.parseInt(sc.next());
		
		PriorityQueue<Integer> plusP = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> minusP = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i= 0 ; i < n ; i++) {
			
			int num = Integer.parseInt(sc.next());
			if( num < 0 ) {
				minusP.offer(Math.abs(num));
			}else {
				plusP.offer(num);
			}
		}
		
		int num = 0 ; 
		if( !plusP.isEmpty() && !minusP.isEmpty()) {			
			num = Math.max(plusP.peek(), minusP.peek());
		} else if( !plusP.isEmpty()) {
			num = plusP.peek();
		} else if( !minusP.isEmpty()) {
			num = minusP.peek();
		}
		
		int answer= 0 ; 
		
		while(!plusP.isEmpty()) {
			
			for(int i= 0 ; i < m ; i++) {
				int temp = plusP.poll();
				if( i == 0 ) {
					answer+=temp*2;
				}
				if( plusP.isEmpty()) {
					break;
				}
			}
		}
		while(!minusP.isEmpty()) {
			
			for(int i= 0 ; i < m ; i++) {
				int temp = minusP.poll();
				if( i == 0 ) {
					answer+=temp*2;
				}
				if( minusP.isEmpty()) {
					break;
				}
			}
		}
		
		answer-=num ; 
		System.out.println(answer);
		
	}

}
