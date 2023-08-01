import java.util.*;
import java.io.*;
class Solution {
    public String solution(String s) {
       String answer = "";
        
        //대문자
        ArrayList list1  = new ArrayList();
        
        
        //소문자 
        ArrayList list2  = new ArrayList();
        
        
        for(int i= 0; i<s.length();i++) {
        	
        	if( Character.isUpperCase(s.charAt(i))) {
        		list1.add(s.charAt(i));	
        	} else {
        		list2.add(s.charAt(i));		
        	}
        	
        }
        
        list1.sort(Collections.reverseOrder());
        list2.sort(Collections.reverseOrder());
        
        String a = "" ;
        String b = "" ;
        
        for(int i= 0; i<list1.size();i++) {
        	a = a + list1.get(i);
        }
        for(int i= 0; i<list2.size();i++) {
        	b = b + list2.get(i);
        }
        
        answer = answer + b +a;
        
        return answer;
    }
}