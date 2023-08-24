import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
		int[] answer = new int[2];
		int [] h= new int [n];
		
		Stack st = new Stack();
		List list = new ArrayList();
		list.add(words[0]);
		
		
		for(int i= 0; i<words.length;i++) {
			if(i==0) {
				h[i%n]++;
				continue;
			}
			h[i%n]++;
			st.push(words[i-1].charAt(words[i-1].length()-1));
			char c= (char)st.peek();
			if(words[i].charAt(0) == c) {
				if(list.contains(words[i])) {
					answer[0]= (i%n)+1;
					answer[1]= h[i%n];
					break;
				}
				list.add(words[i]);
				st.pop();
				
				if(i==words.length-1) {
					answer[0]= 0;
					answer[1] = 0;
				}
			} else {
				
				answer[0]= (i%n)+1;
				answer[1]= h[i%n];
				break;
			}
		}
		return answer;
    }
}