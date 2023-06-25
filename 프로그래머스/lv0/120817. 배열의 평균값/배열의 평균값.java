class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
       
        
        int count = numbers.length;
        double sum = 0;
        for(int i =0; i< numbers.length;i++) {
        	sum += numbers[i];
        }
        
        answer = sum / count;
        
        
    
        
		return answer;
        
    }
}