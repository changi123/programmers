import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		Deque<Integer> dq = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();
		sc.nextLine();
		while(n-- > 0 ) {
			String [] arr = sc.nextLine().split(" ");
			if( arr[0].equals("push_front")) {
				dq.addFirst(Integer.parseInt(arr[1]));
			} else if( arr[0].equals("push_back")) {
				dq.addLast(Integer.parseInt(arr[1]));
			} else if (arr[0].equals("pop_front")) {
				if( dq.isEmpty()) {
					sb.append(-1+" "+'\n');
				}else {					
					sb.append(dq.pollFirst()+" "+'\n');
				}
			} else if (arr[0].equals("pop_back")) {
				if( dq.isEmpty()) {
					sb.append(-1+" "+'\n');
				}else {					
					sb.append(dq.pollLast()+" "+'\n');
				}
			} else if (arr[0].equals("size")) {
				sb.append(dq.size()+" "+'\n');
			} else if (arr[0].equals("empty")) {
				if( dq.isEmpty()) {
					sb.append(1+" "+'\n');
				} else {
					sb.append(0+" "+'\n');
				}
			} else if (arr[0].equals("front")) {
				if( dq.isEmpty()) {
					sb.append(-1+" "+'\n');
				}else {					
					sb.append(dq.peekFirst()+" "+'\n');
				}
			} else if (arr[0].equals("back")) {
				if( dq.isEmpty()) {
					sb.append(-1+" "+'\n');
				}else {					
					sb.append(dq.peekLast()+" "+'\n');
				}
			}
		}
		System.out.println(sb.toString());
	}

}
