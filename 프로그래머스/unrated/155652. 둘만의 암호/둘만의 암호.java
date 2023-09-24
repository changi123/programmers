import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
		String answer = "";
		char alphabet[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		
		List<Character> list = new ArrayList<Character>();
		
		for(char c :alphabet) {
			list.add(c);
		}
			
		for(int i= 0; i<skip.length();i++) {
			list.remove(list.indexOf(skip.charAt(i)));
		}
		
//		System.out.println(list.size());
		
		
		for(int i = 0 ; i<s.length();i++) {
			int a = list.indexOf(s.charAt(i))+index;
			if(list.indexOf(s.charAt(i))+index>=list.size() ) {
				answer+= list.get( a % list.size()) ;
			} else {
				answer+= list.get(a);
			}
			
//			int a = list.indexOf(s.charAt(i)) + index;
//			if (a >= list.size()) {
//			    a %= list.size();
//			}
//			answer += list.get(a);

		}
		
		return answer;
    }
}