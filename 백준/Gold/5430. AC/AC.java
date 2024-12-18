import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.next());
		while(t-- > 0) {
			Boolean flag = true; 
			boolean reverseFlag = false;
			String p = sc.next();
			int size = Integer.parseInt(sc.next());
			String [] arr = sc.next().split(",");
			Deque<Integer> dq = new LinkedList<>();
			for(int i= 0 ; i < arr.length; i++) {
				String s = arr[i];
				if(arr.length == 1 ) {
					s = s.substring(1);
					s = s.substring(0,s.length()-1);
					if( s.length()== 0 ) {
						break;
					}
					dq.offer(Integer.parseInt(s));
					break;
				}
				if( i == 0 ) {
					s = s.substring(1);
				} else if (i == arr.length-1) {
					s = s.substring(0,s.length()-1);
				}				
				dq.offer(Integer.parseInt(s));
			}


			for(int i =0 ; i < p.length();i++) {

				char c = p.charAt(i);
				if( c == 'D') {
					if( dq.isEmpty()) {
						System.out.println("error");
						flag = false; 
						break; 
					} else {
						if( reverseFlag) {
							dq.pollLast();
						} else {
							dq.pollFirst();
						}
					}
				} else if( c== 'R') {
					reverseFlag = !reverseFlag;
				}
			}
			if( flag ) {
				if( dq.isEmpty()) {
					System.out.println("[]");
					continue;
				}
				StringBuilder sb = new StringBuilder("[");
				while(!dq.isEmpty()) {
					if (reverseFlag) {
						sb.append(dq.pollLast());
					} else {
						sb.append(dq.pollFirst());
					}
					if (!dq.isEmpty()) sb.append(",");
				}
				sb.append("]");
				System.out.println(sb.toString());
			}
			

		}

	}

}
