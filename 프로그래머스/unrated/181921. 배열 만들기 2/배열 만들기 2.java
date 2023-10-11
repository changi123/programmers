import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=  l ; i <=r ; i++) {
			String s =  "";
			int cnt = 0 ;
			if(i % 5 == 0) {
				s = Integer.toString(i);
				
				for(int j = 0; j <s.length();j++) {
					if(s.charAt(j) != '5' && s.charAt(j)!='0' ) {
						cnt++;
						break;
						
					} 
				}
				if(cnt==0) {
					list.add(i);
				}
			
			}
			
		}
				if( list.size() == 0 ) {
			int[] answer = new int [1];
			answer [0] = -1;
			return answer;
			
		}
		int[] answer = new int [list.size()];
		for(int i= 0;  i < list.size();i++) {
			answer [i] =  list.get(i);
		}

		return answer;
    }
}