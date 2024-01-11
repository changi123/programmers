import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
                boolean answer = true;
        Arrays.sort(phone_book);
        
        for(int i= 0; i < phone_book.length;i++) {
        	if( i== phone_book.length-1) {
        		return true;
        	}
        	int len = phone_book[i].length();	
        	if( phone_book[i+1].length()<len) {
        		continue;
        	}
        	StringBuilder sb = new StringBuilder();
        	if(phone_book[i+1].charAt(0) != phone_book[i].charAt(0)) {
        		continue;
        	}
        	sb.append(phone_book[i+1].substring(0,len));
        	if( sb.toString().equals(phone_book[i])) {
        		return false;
        	}
        }
        

        
        return answer;

    }
}