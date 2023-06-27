import java.util.*;
import java.io.*;

class Solution {
    public String solution(String[] seoul) {
              String answer = "";
        
        
        ArrayList list = new ArrayList();
        
        for(int i= 0; i<seoul.length;i++) {
        	list.add(seoul[i]);
        	
        }
        
        int idx = list.indexOf("Kim");
        
        answer = String.format("김서방은 %d에 있다",idx);
        
        
        return answer;
    }
}