class Solution {
    public String solution(String my_string) {
              String answer = "";
        int i = 0;
        int j = my_string.length()-1;
        while(j>=0) {
        	answer += my_string.charAt(j);
        	j--;
        	
        }
        
        return answer;
    }
}