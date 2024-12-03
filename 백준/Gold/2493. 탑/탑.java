import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<int[]> st = new Stack<>();
		int n = Integer.parseInt(sc.next());
		StringBuilder sb = new StringBuilder();
		for(int i = 1 ; i <= n ; i++){
			int top = Integer.parseInt(sc.next());

			while(!st.isEmpty()) {
				if( st.peek()[1] >= top ) {
					sb.append(st.peek()[0]+ " ");
					break;
				}
				
				st.pop();
			}
			
			if ( st.isEmpty()) {
				sb.append("0"+ " ");
			}
			st.push(new int[] {i,top});
		}
		
		System.out.println(sb.toString());
	}

}
