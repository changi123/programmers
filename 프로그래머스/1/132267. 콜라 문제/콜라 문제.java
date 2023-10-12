class Solution {
    public int solution(int a, int b, int n) {
	int answer = 0;


		while (n / a > 0) {
			// 가지고 있는 빈병수 - 
			answer = answer + (n - (n % a)) / a * b;
			n = n - (n - (n % a)) + (n - (n % a)) / a * b;

		}

		return answer;
    }
}