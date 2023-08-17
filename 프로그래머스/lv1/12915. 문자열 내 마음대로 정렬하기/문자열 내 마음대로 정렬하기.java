import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
    		String[] answer = new String [strings.length];
		List list = new ArrayList();
		
		for(int i= 0; i<strings.length;i++) {
			answer[i] = strings[i].charAt(n) + strings[i];
			list.add(answer[i]);
		}
		// usun , ebed, acar
		
		list.sort(null);
		
		for(int i= 0 ; i<list.size();i++) {
			String a = (String) list.get(i);
			answer[i]= a.substring(1);
		}
		
		
		
		return answer;

    }
}