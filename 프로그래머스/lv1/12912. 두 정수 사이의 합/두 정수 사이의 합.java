class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        int first = 0;

        if( a< b) {
        	for(int i= a ; i<=b ; i++) {
        		answer = answer + a;
        		a++;
        		
        	}
        } else if( a>b){
        	for(int i= b ; i<=a ; i++) {
        		answer = answer +b;
        		b++;
        	}
        } else {
        	answer = a;
        }
        
        return answer;
    }
}