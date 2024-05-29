import java.util.*;
class Solution {
    public String solution(String number, int k) {
     
        Stack<Character> st = new Stack();
        StringBuilder sb = new StringBuilder(number);
		for(int i= 0 ; i < sb.length(); i++) {
			char now = sb.charAt(i);
			while(!st.isEmpty() && now > st.peek() && k > 0 ) {
				st.pop();
				k--;
			}
			
			st.push(now);
			
		}
		
		while(k>0) {
			st.pop();
			k--;
		}
		StringBuilder result = new StringBuilder();
		while(!st.isEmpty()) {
			result.append(st.pop());
			
		}
		return result.reverse().toString();
    }
}