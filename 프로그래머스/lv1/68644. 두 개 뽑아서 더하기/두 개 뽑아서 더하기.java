
import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] numbers) {
               LinkedHashSet hs = new LinkedHashSet();
        int fir =0;
        int mul = 0;
        for(int i= 0; i< numbers.length; i++) {
        	fir = numbers[i];
        	for(int j= 0; j < numbers.length; j++) {
        		if(i==j) {
        			continue;
        		}
        		hs.add(fir + numbers[j]);
        	}
        }
        
        ArrayList list = new ArrayList(hs);
        
        list.sort(null);
        
        int[] answer = new int [list.size()];
        
        for(int i= 0; i< answer.length;i++) {
        	answer[i] = (int) list.get(i);
        }
        
        return answer;
    }
}