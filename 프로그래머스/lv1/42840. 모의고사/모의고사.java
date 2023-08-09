import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] answers) {
	
		int [] std1 = {1, 2, 3, 4, 5};
		int [] std2 = {2, 1, 2, 3, 2, 4, 2, 5};
		int [] std3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

		ArrayList list = new ArrayList();
		ArrayList list2 = new ArrayList();
	
		
		int [] cnt = new int [3];
		
		for(int i= 0; i<answers.length;i++) {
			if(std1[i%std1.length] == answers[i]) {
				cnt[0] ++;
			}
			if(std2[i%std2.length] == answers[i]) {
				cnt[1] ++;
			}
			if(std3[i%std3.length] == answers[i]) {
				cnt[2] ++;
			}
		} 
		list.add(cnt[0]);
		list2.add(cnt[0]);
		

	
		list.add(cnt[1]);
		list2.add(cnt[1]);
	
	
		list.add(cnt[2]);
		list2.add(cnt[2]);



		//        for(int i= 0; i<)
		//        [1,2,3,4,5]		[1]
		//        [5, 0, 0]
		//
		//        [1,3,2,4,2]		[1,2,3]
		//        [2, 2, 2]





		// [2,1,2] 
		// ( 1 . 3)
		
		


		list.sort(Collections.reverseOrder());


	
		int max = (int) list.get(0);
		int check = 0;
		for(int i= 0; i<3;i++) {
			if(list.contains(max)) {
				
				list.remove(0);
				check++;  // 1

			} else {
				break;
			}
		}
		
//		int a = 0;
//		while(a<3) {
//			if(list.contains(max)) {
//			
//			list.remove(0);
//			check++;  // 1
//			a++;
//		}
//		}
		
	
		
		// check == 1이면 한명
		// check == 2 이명 두명 
		/// check 가 3이면 다 똑같음 
		//        {1,2,3}

	
		
		
		int [] answer = new int [check]; 
		
		if(check == 1) {
			for(int i= 0; i<list2.size();i++) {
				if((int) list2.get(i) == max) {
					answer[0] = i+1;
					break;
				}
			}

		} else if(check == 2) {
			
			answer[0] = list2.indexOf(max)+1;
			answer[1] = list2.lastIndexOf(max)+1;
			
		} else {
			answer[0]= 1;
			answer[1]= 2;
			answer[2]= 3;

		}
		
		
//		switch (check) {
//		case 1:
//			for(int i= 0; i<list2.size();i++) {
//				if((int) list2.get(i) == max) {
//					answer[0] = i+1;
//					break;
//				}
//			}
//
//			break;
//
//		case 2:
//			
//			answer[0] = list2.indexOf(max)+1;
//			answer[1] = list2.lastIndexOf(max)+1;
//			break;
//
//		case 3:
//			answer[0]= 1;
//			answer[1]= 2;
//			answer[2]= 3;
//
//			break;
//
//
//		}
		return answer;
    }
}