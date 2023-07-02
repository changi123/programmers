class Solution {
    public int solution(int[] number) {
      int answer = 0;
        
        int check = 0;
        
        for(int i = 0; i<number.length;i++) {
        	check = number[i];
        	for(int j =i+1; j<number.length;j++) {
        		if(j!=i+1) {
        			check = number[i];
        		}
        		check+= number[j];
        		for(int k =j+1; k<number.length;k++) {
        			if(k!=j+1) {
        				check = number[i] + number[j];
        			}
        			check+=number[k];
        			if(check == 0) {
        				answer++;	
        			} else {
        				continue;
        			}
        		}
        	}
        	
        }
        
        return answer;
    }
}