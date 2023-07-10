class Solution {
    public String solution(String[] str_list, String ex) {
             String answer = "";
	        String com = "";
	        for(int i= 0; i<str_list.length;i++) {
	        	com = str_list[i].replace(ex, "");
	        	if(str_list[i].equals(com)) {
	        		answer+=str_list[i];
	        	}else {
	        		answer += "";
	        	}
	        }
	        return answer;
    }
}