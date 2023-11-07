class Solution {
    boolean solution(String s) {
      boolean answer = false;
		// '(' 개수 
		int cnt1 = 0;
		int cnt2 = 0;
	
		// ')' 개수 
		int cnt3 = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				cnt1++;
				cnt2++;
			} else {
				cnt1--;
				cnt3++;
				// '(' 이것보다 ')' 이게 먼저 더 많으면 어차피 안만들어진다
				if (cnt1 < 0) {
					return answer;
				}
			}
		}
		// 만약 '(' 까지  통과했다면 개수가 같은지
		if (cnt2 != cnt3) {
			return answer;
		}
		answer = true;
		return answer;
    }
}