import java.util.*;
import java.io.*;


class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
                String [] arr1_sr  = new String [n];
        String [] arr2_sr = new String [n];
       
        String s = "";
        
        for(int i= 0; i<n;i++) {
        	 s =Integer.toBinaryString(arr1[i]);
        	 int len = s.length();
             if(n == s.length()) {
            	 arr1_sr[i] = s ;
            	 continue;
             }
        	 for(int  j= n; j>len ; j--) {
        	
        		 s = "0" +s;
        		 
        		 	
        	 }
        	 arr1_sr[i] = s;
        			 
        }
        
        for(int i =0; i< n  ; i++ ) {
        	 s= Integer.toBinaryString(arr2[i]);
        	 int len = s.length();
        	 if(n==s.length()) {
        		 arr2_sr[i] = s;
        		 continue;
        	 }
        	 for( int j = n; j > len;j--) {
        		 
        		 s = "0" + s;
        		 
        	 }
        	 arr2_sr[i] = s;
        }
        
        String[] answer = new String [n];
        
       
        // ArrayList list = new ArrayList();
        // for(int i= 0; i<n;i++) {
        // 	list.add("");
        // }
        
        
        for(int i= 0; i<n;i++) {
        	answer[i] = "";
        }
        
        
       
        
        
        for(int i= 0; i<arr1_sr.length;i++) {
        	
        	for(int j= 0; j <arr2_sr.length;j++)
        	if(arr1_sr[i].charAt(j) == '0' && arr2_sr[i].charAt(j) == '0') {
        		
        		answer[i] += " ";
        	} else {
        		answer[i] += "#";
        	}
        }
        
        return answer;
    }
}