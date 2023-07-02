class Solution {
    public String solution(int n) {
       String answer = "";
        
        String s1 = "수";
        String s2 = "박";
        
        
        int i =0;
        while(true) {
        	answer+=s1;
        	i++;
        	if(i==n) {
        		break;
        	} else {
        		answer+=s2;
        		i++;
        		if(i==n) {
        			break;
        		}
        	}
        	
        }
        return answer;
    }
}