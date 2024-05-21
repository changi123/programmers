import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		Stack<Integer> st = new Stack();
		int start = 0 ; 
		StringBuilder sb = new StringBuilder();
		while(n-- > 0) {
			int num = Integer.parseInt(sc.next());
			if( num > start ) {				
				for(int i= start+1  ;  i<= num ; i++) {
					st.push(i);
					sb.append("+"+'\n');
				}
				start = num ;
			}
			
			if( st.peek() != num ) {
				System.out.println("NO");
				return ;
			}else {
				st.pop();
				sb.append("-"+'\n');
			}
			
		}
		System.out.println(sb);
	}

}
