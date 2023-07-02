class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n==1000000) {
        	answer = 1;
        } else if(n<1000000) {
        	answer = n/100000 + (n/10000)%10 + (n/1000)%10 + (n/100)%10 + (n/10) %10 + n%10;
        } else if(n<100000) {
        	answer = n/10000 + (n/1000)%10 + (n/100)%10 + (n/10)%10 + n%10;
        } else if(n<10000) {
        	answer  = n/1000 + (n/100)%10 + (n/10)%10 + n%10;
        } else if(n<1000) {
        	answer = n/100 + (n/10) % 10 + n%10;
        } else if(n<100) {
        	answer = n/10 + n%10;
        } else if (n<10 && n>=0) {
        	answer = n;
        }
        
        return answer;
    }
    
}