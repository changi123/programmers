import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
  
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < progresses.length; i++) {
			if(progresses[i]>=100) {
				continue;
			}
			
			int cnt = 0 ;
		
			for(int k = progresses[i] ; progresses[i]<=100 ;k+=speeds[i]) {
				if(progresses[i] >= 100) {
					break;
				}
				for (int j = 0; j < speeds.length; j++) {
//					if(progresses[i]>=100) {
//						break;
//					}
					if(  progresses[j]>=100) {
						continue;
					}
					progresses[j] += speeds[j];
				}
				
			}
			
			for(int z = i; z<progresses.length;z++) {
				if(progresses[z] >=100) {
//					progresses[z] = 0;
					cnt++;
				} else {
					break;
				}
			}
			list.add(cnt);
		}

		int[] answer = new int [list.size()];
		for(int i = 0 ; i <list.size();i++) {
			answer[i]= list.get(i);
		}
		return answer;
    }
}