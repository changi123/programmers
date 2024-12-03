import java.util.*;


public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		PriorityQueue<Integer> plus = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> minus = new PriorityQueue<>();
		
		
		int sum = 0 ;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i= 0 ; i < n ; i++) {
			
			int num = Integer.parseInt(sc.next());
			if( num > 0 ) {
				plus.offer(num);
			} else {
				minus.offer(num);
			}
		}
		
		while(plus.size() > 1 ) {
			int a = plus.poll();
			int b = plus.poll();
			
			if( a*b > a+b) {
				sum+=a*b;
			} else {
				sum+=a+b;
			}
		}

		
		while(!plus.isEmpty()) {
			list.add(plus.poll());
		}
		
		while(minus.size() > 1 ) {
			int a = minus.poll();
			int b = minus.poll();
			
			if( a*b > a+b) {
				sum+=a*b;
			} else {
				sum+=a+b;
			}
		}
			
		while(!minus.isEmpty()) {
			list.add(minus.poll());
		}
		
		if( list.size() == 2 ) {
			int a = list.get(0);
			int b = list.get(1);
			
			if( a*b > a+b) {
				sum+=a*b;
			} else {
				sum+=a+b;
			}
		} else if( list.size() == 1 ) {
			sum+= list.get(0);
		}
	
		System.out.println(sum);
	}

}
