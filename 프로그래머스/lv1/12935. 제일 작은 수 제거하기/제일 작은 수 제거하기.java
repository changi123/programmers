import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList list = new ArrayList();
       
        
        if(arr.length==1) {
        	int [] answer = new int [1];
        	answer[0] = -1;
        	return answer;
        } else {
        	
        	for(int i=0 ;i<arr.length;i++) {
        		list.add(arr[i]);
        	}
        	
        	list.sort(null);
        	
        	int check = (int) list.get(0);
        	
        	int idx =0;
        	for(int i= 0; i<arr.length;i++) {
        		if(arr[i] != check) {
        			idx++;
        		}
        	}
        	
        	int [] answer = new int [idx];
        	
        	int k =0;
        	for(int i= 0; i<arr.length;i++) {
        		if(arr[i] == check) {
        			continue;
        		} else {
        			answer[k] = arr[i];
        			k++;
        		}
        		
        	}
        	return answer;
        }
    }
}