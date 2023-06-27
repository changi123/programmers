class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        
        int add = 0;
        int even =0;
        
        for(int i = 0; i< num_list.length; i++) {
        	if(num_list[i] % 2 ==1 ) {
        		add++;
        	}else {
        		even++;
        	}
        	
        }
        answer[0] = even;
        answer[1] = add;
        
        return answer;
    }
}