import java.util.*;
class Solution {
    public int solution(int[] citations) {
	int answer = 0;
		
		
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		Arrays.sort(citations);
		
		int k = 0;
		for(int i= 1; i <=citations.length;i++ ) {
			list.add(citations[i-1]);
			list2.add(i);
		}
		
		list.sort(Collections.reverseOrder());
		list2.sort(Collections.reverseOrder());
	
		for(int i= 0; i < citations.length;i++) {
			int h_index = list2.get(i);
			int cnt = 0 ;
			
			for(int j=  0; j < list.size();j++) {
				if(list.get(j)>=h_index) {
					cnt++;
				}
			}
			
			if(cnt>=h_index) {
				answer = h_index;
				break;
			}
		}
		
		
		return answer;
    }
}

// 0 1 3 5 6 