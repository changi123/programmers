import java.util.*;
class Solution {
    public int solution(String s) {
    	   int answer = 0;
	       char [] arr =  {'[','{','(',')','}',']'};
	       int [] iarr = new int [6];
		   List list0 = new ArrayList();
		   
		   for(int i= 0 ; i < s.length();i++) {
			   for(int j= 0 ; j< arr.length;j++) {
				   if(s.charAt(i) == arr[j]) {
					   iarr[j]++;
				   }
				   
				   
			   }
			   
		   }
		   
		   
		   for(int i= 0; i <iarr.length;i++) {
			   if ( iarr[i] == 0 ) {
				   return answer;
			   }
		   }
		   
	        List<String> list = new ArrayList();
	        list.add(s);
	        
	        
	        for(int i= 0; i <s.length()-1;i++) {
	        	char c = s.charAt(0);
	        	s = s.replaceFirst("\\"+c,"");
	        	s += c;
	        	list.add(s);
	        }
	        
	        for(int i = 0 ; i<list.size();i++) {
	        	int cnt  = 0; 
	        	String sr = list.get(i);
	        	for(int j = 0 ; j<s.length();j++) {
	        		if(sr.charAt(j) == '[' || sr.charAt(j) == '{' ||sr.charAt(j) == '('  ) {
	        			cnt++;
	        			
	        		} else {
	        			cnt--;
	        		}
	        		if(cnt < 0 ) {
	        			break;
	        		}
	        		
	        	}
	        	if( cnt == 0 ) {
	        		answer++;
	        	}
	        	
	        	
	        }
	        return answer;
    }
}