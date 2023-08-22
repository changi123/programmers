class Solution {
    boolean solution(String s) {
             boolean answer = false;
        int cnt1= 0;
        int cnt2= 0;
        int cnt3= 0;
        
        
        
        for(int i= 0; i <s.length();i++) {
        	if(s.charAt(i) == '(') {
        		cnt1++;
        		cnt2++;
        	} else {
        		cnt1--;
        		cnt3++;
        		if(cnt1 <0) {
        			return answer ;
        		}
        	}
        }
        
        if(cnt2 != cnt3) {
        	return answer;
        }
        answer = true;
        return answer;
    }
}