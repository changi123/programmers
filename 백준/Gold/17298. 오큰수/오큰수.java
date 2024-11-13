import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int  n = Integer.parseInt(sc.next());
		int [] arr = new int[n];
		Stack<Integer> st = new Stack<>();
		for(int i = 0 ; i < n ; i++) {
			int num = Integer.parseInt(sc.next());
			arr[i] = num ; 
		}
		int [] answer  = new int[n];
	
		
		for(int i= 0 ; i  < n ; i ++) {
			
			while( !st.isEmpty() && arr[st.peek()] < arr[i]) {
				int index = st.pop();
				answer[index] = arr[i];
			}
			
			st.push(i);
			
		}
		while(!st.isEmpty()) {
			answer[st.pop()] = -1 ;
		}
		StringBuilder sb = new StringBuilder();
		for(int num : answer) {
			sb.append(num+ " ");
		}
		
		System.out.println(sb.toString());
	}

}
    