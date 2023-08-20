import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
			int answer = 0;
		List Llist = new ArrayList();
		for(int i=0; i< lost.length;i++) {
			Llist.add(lost[i]);
			Llist.sort(null);
		}
		List Rlist = new ArrayList();
		for(int i=0; i< reserve.length;i++) {
			
			Rlist.add(reserve[i]);
			Rlist.sort(null);
		}

		for(int i= 0; i<reserve.length;i++) {

			for(int j= 0; j<lost.length;j++) {
				if(reserve[i] == lost[j]) {
					Rlist.remove(Rlist.indexOf(reserve[i]) );
					Llist.remove(Llist.indexOf(lost[j]));
					break;
				}
			}
		}

		int all = n - Llist.size();

		for(int i= 0; i<Rlist.size();i++) {



			int front = (int)Rlist.get(i)-1;
			int back = (int)Rlist.get(i)+1;
			for(int j =0; j<Llist.size();j++) {
				if(Llist.contains(front)){
					all +=1;
					Llist.remove(Llist.indexOf(front));
					break;
				} else if(Llist.contains(back)) {
					all +=1;
					Llist.remove(Llist.indexOf(back));
					break;
				}
			}
		}
		answer = all;
		return answer ;

    }
}