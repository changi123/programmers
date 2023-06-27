import java.util.*;
import java.io.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
		int idx =0;
		for(int i= 0; i<arr.length; i++) {
			if(arr[i] % divisor==0) {
				idx++;
			}
		}
		
		ArrayList list = new ArrayList();
		
		int k = 0;
		if(idx>0) {
			int [] answer = new int[idx];
			for(int i= 0; i<arr.length;i++) {
				if(arr[i] % divisor==0) {
				  	answer[k] = arr[i];
					list.add(answer[k]);
					list.sort(null);	
					k++;
				}
				
			}
			for(int i= 0 ;i<list.size();i++) {
				answer[i] = (int) list.get(i);
			}
			return answer;
		}else {
			int [] answer = new int[1];
			answer[0] = -1;
			return  answer;
		}

    }
}