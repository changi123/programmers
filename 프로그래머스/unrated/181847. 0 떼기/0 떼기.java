class Solution {
    public String solution(String n_str) {
   String answer = "";
        int a = 0;
        
        if(n_str.charAt(0) != '0') {
        	return n_str;
        } else {
        	for(int i= 0; i < n_str.length();i++) {
        		if(n_str.charAt(i)!='0') {
        			a = i ;
        			break;
        		} 
        	}
        }
        
        for(int i= a ; i<n_str.length();i++) {
        	answer+=n_str.charAt(i);
        		
        }
        
        return answer;
    }
}