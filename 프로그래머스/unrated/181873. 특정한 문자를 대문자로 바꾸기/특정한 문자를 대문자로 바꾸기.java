class Solution {
    public String solution(String my_string, String alp) {
             String answer = "";
        
        String s = "";
        s = s+alp;
        
        for(int i = 0; i<my_string.length();i++) {
        	if(my_string.charAt(i) == s.charAt(0)) {
        		answer += Character.toUpperCase(s.charAt(0));
        	} else {
        		answer += my_string.charAt(i) ;

        	}
        }
        
        return answer;
    }
}