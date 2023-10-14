import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
	String answer = "No";

		List<String> list1 = new ArrayList<>(Arrays.asList(cards1));
		List<String> list2 = new ArrayList<>(Arrays.asList(cards2));

		int cnt = 0;
		for (int i = 0; i < goal.length; i++) {

			if (!list1.isEmpty() && goal[i].equals(list1.get(0))) {
				list1.remove(0);
				cnt++;
			} else if (!list2.isEmpty() && goal[i].equals(list2.get(0))) {
				list2.remove(0);
				cnt++;
			} else  {
				return answer;
			}

		}
		
		if( cnt !=goal.length) {
			return answer ; 
		}

		answer = "Yes";

		return answer;
    }
}