import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int[photo.length];

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < name.length; i++) {
			map.put(name[i], yearning[i]);
		}

		
		List<String> list = Arrays.asList(name);
		
		int i = 0 ;
		for(String [] sr :photo) {
			List<String> names = Arrays.asList(sr);
			int sum = 0 ;
			for(String s :sr) {
				if(list.contains(s)) {
					sum+=map.get(s);
				}
			}
			answer[i] = sum;
			i++;
			
		}
		return answer;
    }
}