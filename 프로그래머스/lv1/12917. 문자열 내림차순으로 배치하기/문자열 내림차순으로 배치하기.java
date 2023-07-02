import java.util.*;
import java.io.*;

class Solution {
    public String solution(String s) {
              String answer = "";
        String [] sr = s.split("");
        ArrayList<String> list = new ArrayList<String>();
        
        for(int i= 0; i< sr.length;i++) {
        	list.add(sr[i]);
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
       for(int i= 0; i<sr.length;i++) {
    	   sr[i] = list.get(i);
    	   answer+=sr[i];
       }
       
       
        
        return answer;
    }
}