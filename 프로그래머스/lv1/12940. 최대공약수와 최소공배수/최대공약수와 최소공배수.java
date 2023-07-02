class Solution {
    public int[] solution(int n, int m) {
			int[] answer = new int [2];
		
		if(n<=m && m%n==0) {
			answer[0] = n;
			answer[1] = m;
			return answer;
		} else if(n>=m && n%m==0){
			answer[0] = m;
			answer[1] = n;
			return answer;
		}
		
		if(n<=m) {
			for(int i= 1 ; i<=m ; i++) {
				if(n%i ==0 && m%i ==0) {
					answer[0] = i;
				}
				answer[1] = m*n / answer[0];
			}
		} else {
			for(int i= 1 ; i<=n;i++) {
				if(n%i ==0 && m%i ==0) {
					answer[0] = i;
				}
				answer[1] = m*n / answer[0];
			}
		}
		
		
		
		
		return answer;
		
	
    }
}