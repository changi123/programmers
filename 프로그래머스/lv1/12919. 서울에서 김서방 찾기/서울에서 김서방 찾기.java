class Solution {
    public String solution(String[] seoul) {
               String answer = "김서방은 x에 있다";
        String cnt = "";
        for(int i= 0; i<seoul.length;i++) {
        	if(seoul[i].equals("Kim")) {
        		cnt = Integer.toString(i); 
        		break;
        	}
        }
        
        answer = answer.replace("x", cnt);
        
        
        return answer;
    }
}