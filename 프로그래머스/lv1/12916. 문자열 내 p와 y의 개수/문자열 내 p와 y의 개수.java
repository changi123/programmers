class Solution {
    boolean solution(String s) {
           boolean answer = true;


        int num1 = 0;
        int num2 = 0;
        
        for(int i =0 ; i<s.length();i++) {
        	if(Character.toUpperCase(s.charAt(i))  == 'P') {
        		num1++;
        	}else if( Character.toUpperCase(s.charAt(i))  == 'Y'){
        		num2 ++;
        		
        	}
        		
        }
        
        if(num1 != num2) {
        	answer = false;
        }
        
        
        return answer; 
    }
}