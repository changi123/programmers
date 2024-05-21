import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		Stack<Integer> st = new Stack();
		for(int i= 0 ; i < n ; i++) {
			int num = Integer.parseInt(sc.next());
			st.push(num);
		}
		int cnt = 0 ;
		int last = st.pop();
		int temp = last ;
		int i= 0 ;
		while(!st.isEmpty()) {
			if(st.peek() > last && st.peek() > temp) {
				temp = st.peek();
				st.pop();
				cnt++;	
			}else {
				st.pop();
			}
			
		}
		
		System.out.println(cnt+1);
	}

}
