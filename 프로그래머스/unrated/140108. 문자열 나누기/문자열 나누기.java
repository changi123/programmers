class Solution {
    public int solution(String s) {
          int answer = 0;
        
        int cnt = 0; 
        int cnt2 = 0;
        char first = s.charAt(0);
        for(int i= 0; i < s.length();i++) {
        	if(first == s.charAt(i)) {
        		cnt++;
        	} else {
        		cnt2++;
        	}
        	
        	if(cnt == cnt2) {        		
        		answer++;
        		if(i == s.length()-1) {
        			return answer;
        		}
        		first = s.charAt(i+1);
        		cnt = 0;
        		cnt2 = 0;
        	} else if(i == s.length()-1) {
        		answer++;
        	}
        		
   
        }
        return answer;
        
    }
}