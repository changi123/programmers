import java.util.*;
import java.io.*;
class Solution {
    public int solution(int[] nums) {
            int answer = 0;
        
        int a =(  nums.length+1 ) / 2;
        HashSet set = new HashSet();        
        for(int i= 0 ;i<nums.length;i++) {
        	set.add(nums[i]);
        }
 
        
        
        if(set.size()> a) {
        	return answer = a;
        }else {
        	return answer = set.size();
        }
        
        
    
    }
}