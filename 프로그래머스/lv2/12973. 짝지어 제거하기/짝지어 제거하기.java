import java.util.*;
class Solution
{
    public int solution(String s)
    {
               int answer = 0;
     
        if(s.length()== 1) {
        	return answer;
        	
        }
        
        Stack<Character> st = new Stack();
        
        for (char c  : s.toCharArray()) {
			if(!st.isEmpty() &&  st.peek() == c) {
			st.pop();
	
			} else {
				st.push(c);
			}
		}
        
        if(st.isEmpty()) {
        	answer = 1;
        	
        } else {
        	answer= 0 ;
        }
        
        return answer;
    }
}