import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		Queue<Integer> q = new LinkedList();
		
		for(int i= 1 ; i<=n;i++ ) {
			q.offer(i);
		}
		StringBuilder sb=  new StringBuilder("<");
		int i = 1; 
		while(!q.isEmpty()) {
			if( i != k) {
				int num = q.poll();
				q.offer(num);
				i++;
			} else if( q.size()==1) {
				sb.append(q.poll()+">");
				break;
			} else {
				sb.append(q.poll()+", ");
				i=1;
			}
		}
		System.out.println(sb.toString());
	}

}
