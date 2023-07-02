class Solution {
    public int solution(String my_string) {
             int answer = 0;
        char check ;
       
        for( int i= 0; i <my_string.length();i++) {
        	if( (check = my_string.charAt(i)) >='1' && (check = my_string.charAt(i)) <='9' || (check = my_string.charAt(i)) == 0)
        		answer += my_string.charAt(i)-48;
        }
        return answer;
    }
}