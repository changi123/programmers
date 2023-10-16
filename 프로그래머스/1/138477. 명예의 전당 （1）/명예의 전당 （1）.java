import java.util.*;
import java.io.*;


class Solution {
    public int[] solution(int k, int[] score) {
 	     int[] answer = new int [score.length];
		        
		        
		        ArrayList<Integer> list = new ArrayList();
		      
		        
		        // 1. 10추가 
		        // 2. 100 추가
		        
		        
		        // 100 10  // size == 2
		        
		        // 3. 20추가
		        // 100 20 10 // size == 3
		        
		        // 4. 150추가
		        // 150 100 20 10 size == 4
		        for(int i= 0 ; i< score.length;i++) {
		        	
		        	list.add(score[i]);
		        	
		        	list.sort(Collections.reverseOrder());
		        	for(int j = 0; j<list.size();j++) {
		        		if(list.size()<=k) {
		        		answer[i] = (int) list.get(list.size()-1);
		        		break;
		        		} else {
		        		answer[i] = (int) list.get(k-1);
		        		break;
		        		}
		        	}
		        	
		        }
		        
		        
		        return answer;
    }
}