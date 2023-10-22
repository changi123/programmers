import java.util.*;
import java.io.*;


class Solution {
    public int[] solution(int N, int[] stages) {
 int[] answer = new int [N];
       
        
       int 총스테이지수 = stages.length;
       
       
        double [] 실패율 = new double [N];
        
        int [] com = new int [stages.length];
        
        for(int i= 1; i<stages.length+1 ; i++) {
        	com[i-1] = i;
        }
        
        double [] 스테이지당성공못한수 = new double [총스테이지수];
        
        
        for(int i= 0; i < N; i++) {
        	if( i == stages.length) {
	        		break;
	        		
	        	}
        	for(int j = 0 ; j<stages.length;j++) {
        		if(com[i] == stages[j]) {
        		스테이지당성공못한수[i]++; 
        		}
        		
        	
        	}
if(스테이지당성공못한수[i]==0) {
        		continue;
        	}
        	
        	실패율[i] = 스테이지당성공못한수[i] / 총스테이지수;
        	총스테이지수 = (int) (총스테이지수 - 스테이지당성공못한수[i]);
        	
        }
      
        
        ArrayList list = new ArrayList();
       
        for(int i= 0; i<실패율.length;i++) {
        	list.add(실패율[i]);
        	
        }
        
        Collections.sort(list,Collections.reverseOrder());
        
        
        
//        HashMap map = new HashMap();
//        
//        for(int i= 0; i<실패율.length;i++) {
//        	map.put(i+1, 실패율[i]);
//        	
//        	
//        	 }
//        
//        
        
        double [] 실패율리버스 = new double [실패율.length];
        
        
        for(int i= 0; i<실패율리버스.length;i++) {
        	실패율리버스[i] = (double) list.get(i);
        }
        
        
        
        
        double compare = 0; 
        for(int i= 0; i<실패율.length;i++) {
        	
        	compare = 실패율리버스[i];
        	for(int j =0 ; j<실패율.length;j++) {
        		if(compare == 실패율[j]) {
        			answer[i] = j+1;
        			실패율[j] = -1;
        			break;
        		}else {
        			continue;
        		}
        	}
        	
        }
       
        
       

        return answer ;
    }
}