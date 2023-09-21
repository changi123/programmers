import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
          	
    	
		int [] answer = new int[2];
		
		int max = 0; 
		int min = 0;
		for(int a : lottos) {
			if ( a == 0 ) {
				max++;
			}
		}
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0 ; i <lottos.length;i++) {
			list.add(lottos[i]);
		}
		for(int a :win_nums) {
			if( list.contains(a)) {
				max++;
				min++;
			}
		}
		
//		순위	당첨 내용
//		1	6개 번호가 모두 일치
//		2	5개 번호가 일치
//		3	4개 번호가 일치
//		4	3개 번호가 일치
//		5	2개 번호가 일치
//		6(낙첨)	그 외
		if( max == 0 || max == 1) {
			answer[0] = 6;
		} else if( max == 2) {
			answer[0] = 5;
		} else if( max == 3) {
			answer[0] = 4;
		} else if( max == 4) {
			answer[0] = 3;
		} else if( max == 5) {
			answer[0] = 2;
		} else if( max == 6) {
			answer[0] = 1;
		}
		
        
		if( min == 0 || min == 1) {
			answer[1] = 6;
		} else if( min == 2) {
			answer[1] = 5;
		} else if( min == 3) {
			answer[1] = 4;
		} else if( min == 4) {
			answer[1] = 3;
		} else if( min == 5) {
			answer[1] = 2;
		} else if( min == 6) {
			answer[1] = 1;
		}
        return answer;
        
    }
}