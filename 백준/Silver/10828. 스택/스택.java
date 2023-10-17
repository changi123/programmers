import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Stack<String> st = new Stack<String>();
		Stack st1 = new Stack();
		int N = Integer.parseInt(bf.readLine());
		for (int i = 0; i < N; i++) {
			st.add(bf.readLine());
		}
		
		for(int i= 0; i <st.size();i++) {
			String [] arr = st.get(i).split(" ");
			if( arr.length == 2) {
				st1.push(arr[1]);
			} else if( arr[0].equals("top")){
				if( st1.size()!=0) {
					System.out.println(st1.peek());					
				} else {
					System.out.println(-1);
				}
			} else if( arr[0].equals("size")) {
					System.out.println(st1.size());			
			} else if ( arr[0].equals("empty")) {
				if(st1.empty()) {
					System.out.println(1);
				} else { 
					System.out.println(0);
				}
			} else if (arr[0].equals("pop")) {
				if( st1.size()!=0) {
					System.out.println(st1.pop());
				} else {
					System.out.println(-1);
				}
			}
		}

	}

}
