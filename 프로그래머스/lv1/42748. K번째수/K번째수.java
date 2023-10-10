import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
   		int[] answer = new int[commands.length];

		for(int i =0 ;  i<commands.length;i++) {
			int a = commands[i][0];
			int b = commands[i][1];
			int c = commands[i][2];

			// 배열 카피해서 오름차순 정렬 후 3번째 값 넣기
			int [] arr = Arrays.copyOfRange(array, a-1, b);
			Arrays.sort(arr);
			answer[i] = arr[c-1];
		}

		return answer;
    }
}
