class Solution {
    public int[] solution(int[] num_list) {
                int[] answer = new int[num_list.length];
        
//        answer[0] = num_list[4];
//        answer[1] = num_list[3];
//        answer[2] = num_list[2];
//        answer[3] = num_list[1];
//        answer[4] = num_list[0];
        int i = 0;
        int j = num_list.length-1;
        while(i<num_list.length) {
        	answer[i] = num_list[j];
        	i++;
        	j--;
        	
        }
        
       return answer;
    }
}