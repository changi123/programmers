class Solution {
    public int solution(int n) {
        int answer = 0;

              while(n>0) {
        	if(n%2 == 0) {
        		answer += n;
        		n--;
        	} else {
        		n--;
        	}
        }
        
        return answer;
    }
}