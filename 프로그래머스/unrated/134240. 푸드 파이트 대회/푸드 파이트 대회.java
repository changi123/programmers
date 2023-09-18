import java.util.*;
class Solution {
    public String solution(int[] food) {
         String answer = "";
        
        String first = "";
        
        List list = new ArrayList();
        
        for(int i= 1; i < food.length;i++) {
        	
        	int com = 0;
        	if( food[i] % 2 ==1 ) {
        		com = food[i] -1;
        	} else {
        		com = food[i];
        	}
        	for(int j = 0 ; j < com /2 ; j++) {
        		first = first + Integer.toString(i);
        		list.add(Integer.toString(i));
        	}
        	if(i == food.length-1) {
        		
        		first = first + "0";        
        	}	
        }
        Collections.reverse(list);
        
        for(int i= 0; i< list.size(); i++) {
        	first = first + (String) list.get(i);
        }
        return first;
    }
}