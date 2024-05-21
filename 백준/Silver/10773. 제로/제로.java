import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		Stack<Integer> st = new Stack();
		long sum = 0 ;
		for(int i= 0 ; i < n ; i++) {
			int num = Integer.parseInt(sc.next());
			if( num !=0 ) {
				st.push(num);
			}else {
				st.pop();
			}
		}
		
		while(!st.isEmpty()) {
			sum+=st.pop();
		}
		System.out.println(sum);
		
	}

}
