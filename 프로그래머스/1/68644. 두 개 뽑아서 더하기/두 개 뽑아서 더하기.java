
import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] numbers) {
   	  
       HashSet<Integer> hs = new HashSet();
        int fir =0;
        for(int i= 0; i< numbers.length; i++) {
        	fir = numbers[i];
        	for(int j= 0; j < numbers.length; j++) {
        		if(i==j) {
        			continue;
        		}
        		hs.add(fir + numbers[j]);
        	}
        }
        
       
        
        // 겹치지 않는 합들 넣기 
        ArrayList<Integer> list = new ArrayList(hs);
        // 오름차순 정렬
        list.sort(null);
        
        int[] answer = new int [list.size()];
        
        for(int i= 0; i< answer.length;i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}