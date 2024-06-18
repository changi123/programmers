import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Stack<Character> st = new Stack<>();
		int answer = 0 ;
		for(int i= 0 ; i < s.length();i++) {
			if( s.charAt(i) == '(') {
				st.push(s.charAt(i));
				continue;
			}
			
			if( s.charAt(i) == ')') {
				st.pop();
			}
			
			if( s.charAt(i-1) == '(') {
				answer+=st.size();
			}else {
				answer++;
			}
			
		}
		System.out.println(answer);
	}

}
