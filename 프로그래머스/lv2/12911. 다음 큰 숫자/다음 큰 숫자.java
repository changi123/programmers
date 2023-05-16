    class Solution {
        public int solution(int n) {
                 int answer = 0;
        
        
        String 이진수 = Integer.toBinaryString(n);
        int cnt1 = 0;
        for(int i= 0; i<이진수.length();i++) {
        	if(이진수.charAt(i)=='1') {
        		cnt1++;
        		
        	}
        }
        
        
        while(true) {
        n++;
        
        String 증가된이진수 = Integer.toBinaryString(n);
        int cnt2 = 0;
        
        for(int i= 0; i<증가된이진수.length();i++) {
        	
        	if(증가된이진수.charAt(i)=='1') {
        		cnt2++;
        		
        	}
        		
        }
        
        if(cnt1 == cnt2) {
        	answer = n ;
        	break;
        }
        	
        	
        }
        
        return answer ; 
        
        }
}