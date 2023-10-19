import java.util.*;
class Solution {
    public int solution(int[] nums) {
    	int answer = 0;
		List<Integer> list = new ArrayList<>();
		// 세 개 더해서 나올 수 있는 모든 합 리스트에 박자
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					int sum = 0;
					sum = nums[i] + nums[j] + nums[k];
					list.add(sum);
				}
			}
		}
		
		// 박은 리스트에서 소수 판별
		for (int i = 0; i < list.size(); i++) {
			int cnt = 0;
			for (int j = 1; j <= list.get(i); j++) {
				if (list.get(i) % j == 0) {
					cnt++;
				}
			}
			if (cnt == 2) {
				answer++;
			}
		}

		return answer;
    }
}
