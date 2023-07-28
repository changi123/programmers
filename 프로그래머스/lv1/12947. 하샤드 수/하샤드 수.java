class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String s = Integer.toString(x);
        
        String [] sr = s.split("");
        
        int sum = 0;
        
        for(int i = 0; i<sr.length;i++) {
        	
        	sum =sum + Integer.parseInt(sr[i]);
        	
        }
        
        if(x % sum  != 0) {
        	
        	answer = false;
        }
        
        return answer;
    }
}