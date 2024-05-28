import java.util.*;


public class Main {

	public static void main(String[] args) {
			Scanner sc  = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int r = Integer.parseInt(sc.next());

		StringBuilder sb = new StringBuilder(sc.next());

		Stack<Character> st = new Stack();
		for(int i= 0 ; i < sb.length(); i++) {
			char now = sb.charAt(i);
			while(!st.isEmpty() && now > st.peek() && r > 0 ) {
				st.pop();
				r--;
			}
			
			st.push(now);
			
		}
		
		while(r>0) {
			st.pop();
			r--;
		}
		StringBuilder result = new StringBuilder();
		while(!st.isEmpty()) {
			result.append(st.pop());
			
		}
		System.out.println(result.reverse());
	}

}
