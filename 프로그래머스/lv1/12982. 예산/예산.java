
import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        ArrayList list = new ArrayList();
        
        for(int i= 0; i<d.length;i++) {
        	list.add(d[i]);
        }
        

        list.sort(null);
        
        
        
        for(int i = 0 ; i<list.size();i++) {
        	d[i] = (int)list.get(i);
        	
        }
        
        
        int sum = 0;
        int i  = 0;
        while(true) {
        	sum+=d[i];
        	i++;
        	if(sum == budget) {
        		answer++;
        		break;
        	} else if(sum<budget) {
        		if(i==d.length) {
        			answer++;
        			break;
        		}
        		answer++;
        	} else if(sum > budget) {
        		break;
        	}
        	
        	
        }
        
        
        
        
        return answer;
    }
}