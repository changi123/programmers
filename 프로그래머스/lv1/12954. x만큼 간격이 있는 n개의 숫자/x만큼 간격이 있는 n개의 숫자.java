class Solution {
    public long[] solution(int x, int n) {
	long[] answer = new long [n];
		double x3 =x;
		
		int x2 = x;

		for(int i=0 ; i<n;i++) {

			answer[i] = (long) x3;

			x3 = x3+ x2;

		}
		return answer;
    }
}