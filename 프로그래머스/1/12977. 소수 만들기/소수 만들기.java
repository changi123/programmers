import java.util.*;
class Solution {
    public int solution(int[] nums) {
     int answer = 0;
        
        List list = new ArrayList();
        
        for(int i= 0;  i< nums.length;i++) {
        	
        	for(int j = i+1; j < nums.length;j++) {
        		
        		for(int k = j+1 ; k<nums.length ; k++) {
        			int sum = 0 ; 
        			sum = nums[i] + nums[j] + nums[k];	
        			list.add(sum);
        		}
        	}
        }
        
        for(int i =0; i <list.size();i++) {
        	int cnt = 0 ;
        	for(int j = 1 ; j<=(int) list.get(i) ; j++) {
        		if( (int) list.get(i) % j ==0 ) {
        			cnt++;
        		}
        	}
        	if(cnt == 2 ) {
        		answer ++;
        	}
        }
        
        return answer;
    }
}