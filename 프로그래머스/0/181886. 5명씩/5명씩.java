import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        
        int index = 5 ; 
        int cnt = 0 ; 
        String s = "";
        for(int i= 0 ; i < names.length ; i++ ){
            if( i % index == 0 ){
                cnt++;
                if( i == 0 ){
                    s+=names[i];
                } else{
                    s+="_"+names[i];
                }
            }
        }
        String [] answer = s.split("_");
        return  answer;
        }
}