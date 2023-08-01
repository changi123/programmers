class Solution {
    public String solution(int n) {
      String answer = "";
        
       
        int i = 0; 
        
        while( i < n) {
        	if (i%2== 1 ) {
        		answer = answer + "박";
        		i++;
        	} else {
        		answer = answer +"수";
        		i++;
        	}
        }
        
        return answer;
    }
}