class Solution {
    public String solution(String my_string) {
        String answer = "";
        String [] sr = my_string.split("");
        
        
        
        for(int i =0 ; i<my_string.length(); i++) {
        	if(sr[i].equals("a") || sr[i].equals("e") || sr[i].equals("i")||
        			sr[i].equals("o") || sr[i].equals("u")) {
        		continue;
        	}
        	answer += sr[i];
        }
        
        
        return answer;
    }
}