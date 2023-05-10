import java.util.*;
import java.io.*;


class Solution {
    public String solution(String s) {
             String answer = "";
        
        
        
        
        
        ArrayList list = new ArrayList();
        
        String [] a = s.split(" ");
        int [] arr = new int [a.length];
        for(int i= 0; i<a.length; i++) {
        	arr[i] = Integer.parseInt(a[i]);
        	list.add(arr[i]);
        }
        
        list.sort(null);
        
        answer+= Integer.toString((int)list.get(0)) ;

        answer+= " ";
        answer+= Integer.toString((int) list.get(list.size()-1));

        

        
        
        
        return answer;
    }
}