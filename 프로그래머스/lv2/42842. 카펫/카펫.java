import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
	int[] answer = new int[2];

		int sum = yellow+ brown;
		
		for(int i = 3; i<=sum/2 ;i++) {
			int h = sum / i ;
			if( (h-2) * (i-2) == yellow) {
				answer [0] = h;
				answer[1] = i;
				break;
			}
		}
		return answer;
    }
}