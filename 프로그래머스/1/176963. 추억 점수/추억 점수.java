import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
			int[] answer = new int[photo.length];

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		// 이름별 점수 
		for (int i = 0; i < name.length; i++) {
			map.put(name[i], yearning[i]);
		}

		List<String> list = Arrays.asList(name);

		int i = 0;
		
		// 한줄 가져오기
		for (String[] sr : photo) {
			List<String> names = Arrays.asList(sr);
			int sum = 0;
			// 한줄에서 이름 하나씩 꺼내서 name에 있다면
			// 그 이름에 해당하는 만큼 sum 중첩
			for (String s : sr) {
				if (list.contains(s)) {
					sum += map.get(s);
				}
			}
			answer[i] = sum;
			i++;

		}
		return answer;
    }
}