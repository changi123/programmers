import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
  int answer = 0;
          
          int minIndex = 0;
          int maxIndex = people.length-1;

          Arrays.sort(people);
   
          int cnt = 0 ;
          int min = people[0];
          for(int i= 0 ; i < people.length;i++) {
        	         		  
        		  if( people[minIndex] + people[maxIndex]<=limit) {
        			  cnt++;
        			  people[minIndex++] = limit+1;
        			  people[maxIndex--] = limit+1;
        		  } else if(people[maxIndex]<=limit ){
        			  people[maxIndex--] = limit+1;
        			  cnt++;
        		  }
        
          }
          
          
          return cnt;
    }
}