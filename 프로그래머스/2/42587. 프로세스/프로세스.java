import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
    	int answer = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		Queue<HashMap<Integer,Integer>> q = new LinkedList<>();
		int checkNum = priorities[location];
		for(int i= 0 ; i < priorities.length;i++) {
			pq.offer(priorities[i]);
			HashMap<Integer,Integer> h = new HashMap<>();
			if( i ==  location) {				
				h.put(priorities[i], 1);
			}else {
				h.put(priorities[i], 0);				
			}
			q.offer(h);
		}

		while(!pq.isEmpty()) {
			HashMap<Integer,Integer> h = q.peek();
			for(int num : h.keySet()) {
				int key = num;
				int value = h.get(key);
				int max = pq.peek();
				if( max == checkNum && value == 1) {
					answer++;
					return answer ; 
				}
				
				if( key == checkNum && key != max ) {
					q.offer(q.poll());
					break;
				}
				
				if( key != checkNum && key == max) {
					pq.poll();
					answer++;
					q.poll();
					break;
				}
				
				if( key == checkNum && max == key && value == 0 ) {
					q.poll();
					answer++;
					break;
				}
				if( key != checkNum && key != max) {
					q.offer(q.poll());
					break;
				}
			}

		}


		return answer;
    }
}