class Solution {
    public boolean solution(String s) {
              boolean answer = true;
        
        int cnt = 0;
        if(s.length()==4 || s.length() == 6 ) {
        	for(int i= 0; i<s.length();i++) {
            	if(Character.isUpperCase(s.charAt(i)) || Character.isLowerCase(s.charAt(i))) {
            		cnt++;
            	}
            }	
        } else {
        	answer =false; 
        	return answer;
        }
        	
        
        if(cnt != 0) {
        	answer =false;
        }
        return answer;
    }
}