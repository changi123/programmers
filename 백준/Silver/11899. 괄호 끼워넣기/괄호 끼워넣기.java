import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		String [] s = sc.next().split("");
//		System.out.println(Arrays.toString(s)); [), ), ), (, )]
		Stack<String> st = new Stack<>();
		int cnt = 0 ;
		for(int i = 0 ; i < s.length; i++) {
			if( st.isEmpty()) {
				if( s[i].equals(")")) {
					cnt++;
				} else {					
					st.push(s[i]);
				}
			} else {
				if(st.peek().equals("(") && s[i].equals(")")) {
					st.pop();
				} else if( st.peek().equals("(") && s[i].equals("(")){
					st.push(s[i]);
				}
			}
			
		}
		System.out.println(cnt+st.size());
	}

}
