
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public long solution(long n) {
               long answer = 0;
        
        String [] arr  = Long.toString(n).split("");
        ArrayList list = new ArrayList();
        for(int i = 0; i<arr.length;i++) {
        	list.add(arr[i]);
        }
        
        list.sort(Comparator.reverseOrder());
        String a= "";
        for(int i= 0; i<list.size(); i++) {
        	
        	a += list.get(i);
        	
        	
        }
        
        
        return Long.parseLong(a);
         
    }
}