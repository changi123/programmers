class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
 
        String [] sr = my_string.split("");
        
        for(int i =0 ; i< sr.length;i++) {
        	if(sr[i].equals(letter)) {
        		continue;
        	} else {
        		answer += sr[i];
        	}
        	
        }
 
 
 return answer;
    }
}