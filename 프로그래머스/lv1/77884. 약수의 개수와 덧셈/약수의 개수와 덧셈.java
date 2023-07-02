class Solution {
    public int solution(int left, int right) {
      		int answer = 0;
		int [] m = new int [right-left+1];
		int [] cnt = new int [m.length];
		int k=0;
		for(int i= left; i<=right;i++) {
			m[k] = i;
			k++;

		}
		int i= 0;
		int l = 0;

		while(left<=right) {
			
			
			for(i= 1; i<=left;i++) {
				if(left % i ==0) {
					cnt[l]++;
				}
			} if(cnt[l] % 2 ==0) {
				answer+=m[l];
			} else {
				answer+= -m[l];
			} 
			
			left++;
			l++;
			
		}

		return answer;
    }
}