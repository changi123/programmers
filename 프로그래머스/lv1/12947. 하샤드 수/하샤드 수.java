class Solution {
    public boolean solution(int x) {
           boolean answer = false;
        
        String s = Integer.toString(x);
        
        String [] sr = s.split("");
        int sum = 0;
        int i = 0;
        while(i<sr.length) {
        	sum += Integer.parseInt(sr[i]); 
        	i++;
        }
        
        if(x%sum == 0) {
        	return answer = true;
        } else {
        	return answer ;
        }
    }
}