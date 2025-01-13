import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		Stack<Character> st = new Stack<>();

		int cnt = 1 ;
		int answer = 0  ;

		boolean flag = true; 
		for(int i =0  ; i<s.length();i++) {
			char c = s.charAt(i);
			if( c == '(') {
				st.push(c);
				cnt *= 2;
			} else if( c=='[') {
				st.push(c);
				cnt *= 3; 
			} else {
				if( c == ')') {
					if( st.isEmpty() || st.peek() != '(') {
						flag = false; 
						break;
					} 

					if( s.charAt(i-1) =='(' ) {
						answer += cnt ; 

					}

					st.pop();
					cnt /= 2;
				} else if( c == ']') {
					if( st.isEmpty() || st.peek() != '[') {
						flag = false ;
						break;
					}
					if ( s.charAt(i-1) == '[') {
						answer+=cnt ;
					}
					st.pop();
					cnt /=3;
				}
			}

		}
		if( !flag || !st.isEmpty()) {
			System.out.println(0);
		} else {
			System.out.println(answer);
		}

	}

}
