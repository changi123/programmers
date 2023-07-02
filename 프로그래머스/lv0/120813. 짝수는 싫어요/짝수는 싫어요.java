class Solution {
    public int[] solution(int n) {
		int cnt  = 0;
		int i = 0;
		for(i= 1; i <= n ; i++) {
			if(i%2 == 1) {
				cnt ++;
			}	
		}
		int[] answer = new int[cnt];

			i = cnt-1; 
			while(n>0){
				if(n%2==1) {
					answer[i] = n;
					n--;
					i--;
					continue;
				}
				n--;
			}
		
		
		return answer;
    }
}