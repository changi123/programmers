import java.util.*;
import java.io.*;


class Solution {
    public int[] solution(int k, int[] score) {
 	/*
    	 
k== 명예의전당 개수
1일차 점수 == 10  명예의전당 == 3개중 1개
발표점수 1개중 내림차 순 마지막


2일차 점수 == 100 명예의전당 == 3개중 2개
발표점수 2개중 내림차 순 마지막


3일차 점수 == 20 명예의전당 == 3개중 3개
발표점수 3개중 내림차 순 마지막


4일차 점수 == 150 명예의전당 == 4개중 내림차순 정렬 시 앞에서 3개
발표점수 3개중 내림차 순 마지막


5일차 점수 == 1 	명예의전당 == 5개중 내림차순 정렬 시 앞에서 3개
발표점수 3개중 내림차 순 마지막


6일차 점수 == 100 명예의전당 == 6개중 내림차순 정렬 시 앞에서 3개
발표점수 3개중 내림차 순 마지막


7일차 점수 == 200 명예의전당 == 7개중 내림차순 정렬 시 앞에서 3개 
발표점수 3개중 내림차 순 마지막
    	  
    	  
    	 */
    	
    	// answer 크기 == score 크기  == 각 일차의 명예의전당 최하점
        int[] answer = new int [score.length];
        
        
        ArrayList list = new ArrayList();
      
        
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
        		} else {
        		answer[i] = (int) list.get(k-1);
        		}
        	}
        	
        }
        
        
        return answer;
    }
}