import java.util.*;


public class Main {

	public static void main(String[] args) {
//		push X: 정수 X를 큐에 넣는 연산이다.
//		pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//		size: 큐에 들어있는 정수의 개수를 출력한다.
//		empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
//		front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//		back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		Scanner sc= new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		Queue<Integer> q = new LinkedList();
		sc.nextLine();
		int lastNum = 0 ;
		StringBuilder sb = new StringBuilder();
		for(int i= 0 ; i < n ; i++) {
			String s = sc.nextLine();
			String [] arr = s.split(" ");
			if ( arr[0].equals("push")) {
				q.offer(Integer.parseInt(arr[1]));
				lastNum = Integer.parseInt(arr[1]);
			} else if (arr[0].equals("pop")) {
				if( q.isEmpty()) {
//					System.out.println(-1);
					sb.append(-1+"\n");
				}else {				
					sb.append(q.poll()+"\n");
//					System.out.println(q.poll());
				}
			} else if (arr[0].equals("size")) {
				sb.append(q.size()+"\n");
//				System.out.println(q.size());
			} else if (arr[0].equals("empty")) {
				if(q.isEmpty()) {
					sb.append(1+"\n");
//					System.out.println(1);
				}else {
					sb.append(0+"\n");
//					System.out.println(0);
				}
			} else if (arr[0].equals("front")) {
				if( q.peek()!=null) {
//					System.out.println(q.peek());
					sb.append(q.peek()+"\n");
				}else {
					sb.append(-1+"\n");
//					System.out.println(-1);
				}
			} else if (arr[0].equals("back")) {
				if( q.isEmpty()) {
					sb.append(-1+"\n");
//					System.out.println(-1);
				}else {			
					sb.append(lastNum+"\n");
//					System.out.println(lastNum);
				}
			}
		}
		System.out.println(sb.toString());
	}

}
