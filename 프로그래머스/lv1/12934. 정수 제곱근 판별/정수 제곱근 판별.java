class Solution {
    public long solution(long n) {
    		  long answer = 0;
    	  
    	  long i= 1;
    	  long a = 0;
    	  while(true) {
    		  if(Math.pow( i, 2) >=n) {
    			  a = i;
    			  break; 
    		  }
    		  i++;
    		  
    	  }
    	  
    	  if(Math.pow(a, 2) == n) {
    		  answer= (long) Math.pow(a+1, 2);
    	  }
    	  
    	  if(answer==0) {
    		  answer=-1;
    	  }
          return answer;
    	  
    }
}