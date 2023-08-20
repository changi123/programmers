import java.util.*;
import java.io.*;


class Solution {
    public String solution(String[] participant, String[] completion) {
      String answer = "";
	        
	        ArrayList list = new ArrayList();
	        
	        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
	        		
	        for(int i= 0 ; i< participant.length;i++) {
	        	if(!map.containsKey(participant[i])) {	
	        		map.put(participant[i], new ArrayList<String>());
	        	}
	        	map.get(participant[i]).add(participant[i]);
	        }
	        
	        for(int  i = 0; i<completion.length;i++) {
	        	if(map.containsKey(completion[i])) {
	        		List<String> names = map.get(completion[i]);
	        		if(names.size()>1) {
	        			names.remove(0);
	        		} else { 	
	        			map.remove(completion[i]);
	        		}
	        	}
	        	
	        }

	        Iterator<String> it = map.keySet().iterator();
	        while (it.hasNext()) {
				String key = it.next();
				answer = key;
				break;
				
			}
	        return answer;
    }
}