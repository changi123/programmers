class Solution {
    public int solution(int n, int k) {
               int answer = 0;
       
        int free = n/10;
        
        if(free >=1) {
        	k = k - free;
        }
        
        answer = (12000*n) + (2000*k);

        
        
        
    
        
		return answer;
        
    }
}