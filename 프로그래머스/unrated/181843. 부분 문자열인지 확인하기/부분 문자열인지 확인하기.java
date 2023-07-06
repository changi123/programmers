class Solution {
    public int solution(String my_string, String target) {
           int answer = 0;
        
        String s = my_string.replace(target, "");
        
        if(my_string.equals(s)) {
        	answer = 0;
        } else {
        	answer = 1;
        }
        
        return answer;
    }
}