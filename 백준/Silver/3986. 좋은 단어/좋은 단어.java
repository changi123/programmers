import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int cnt = 0 ; 
		while(n-- > 0 ) {			
			Stack<Character> st = new Stack<>();
			String s = sc.next();
			char c = s.charAt(0);
			st.push(c);
			for(int i= 1 ; i < s.length();i++) {
				if( !st.isEmpty()) {
					char stc = st.peek();
					if( stc == s.charAt(i)) {
						st.pop();
					} else {
						st.push(s.charAt(i));
					}	
				}else {					
					st.push(s.charAt(i));
				}
			}
			if( st.isEmpty()) {
				cnt++;
			}
		}
		System.out.println(cnt);
			
	}

}
