import java.util.*;
class Solution {
    public long solution(int[] arr) {
       long answer = 0;
        
        Stack<Long> st = new Stack();
        
        for(int i=  0 ; i<arr.length;i++) {
        	st.push((long)arr[i]);
        }
        
        while(st.size()>1) {
        	long a = (long)st.pop();
        	long b = (long)st.pop();
        	
        	long max = Math.max(a, b);
        	long min = Math.min(a, b); 
        	long lcm = max;
        	while(true) {
        		if(lcm % min== 0) {
        			st.push(lcm);
        			break;
        		}
        		lcm +=max;
        	}
        	
        }
        
        answer = st.pop();
        return answer;
    }
}