class Solution {
    public boolean solution(String s) {
  	        boolean answer = true;
	        int len = s.length();
	        
	        if( !Len(len) ) {
	        	return false;
	        }
	        
	        for(int i = 0; i<s.length();i++) {
	        	if(Character.isUpperCase( s.charAt(i)) || Character.isLowerCase(s.charAt(i))){
	        		return false;
	        }
	       
	    }
	        
	        
	        return answer;
    }
    
    	 public static boolean Len(int len) {
		 if(len == 6 || len==4) {
			 return true;
		 } else {
			 return false;
		 }
		
	 }
	 
}