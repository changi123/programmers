import java.util.*;
import java.io.*;

class Solution {
    public int solution(int number, int limit, int power) {

		int answer = 0;

//		ArrayList list = new ArrayList();

		/*		
		int [] num = new int [number];

		for(int i= 0; i<number ; i++) {
			num[i] = i+1 ; 
		}
		// [1,2,3,4,5]

		 */

		//		int [] measure = new int [num.length];   // measure == 약수 

		//		int compare = 0;

		/*
		for(int i= 0; i< num.length;i++) {
			//			compare = num[i];
			int cnt =0;
			for(int j= 0; j<num.length;j++) {
				if(num[i] % (j+1) == 0) {

					cnt ++;
				}
			}
			if(cnt >limit) {
				//				measure[i] = power;

				answer += power;
				continue;
			}
			//			measure[i] = cnt ;
			answer += cnt;

		}
	*/
		
		
		
		
		for(int i= 1; i<=number ;i++) {
//		
			int cnt =0;
			for(int j= 1; j<= Math.sqrt(i);j++) {
				if((i) % (j) ==0 && Math.sqrt(i)!=j) {

					cnt = cnt+2;
					
				} else if((i) % (j) ==0 && Math.sqrt(i)==j) {
					cnt++;
				}
			}
			if(cnt >limit) {
				//				measure[i] = power;

				answer += power;
				continue;
			}
			//			measure[i] = cnt ;
			answer += cnt;

		}



		return answer;
    }
}