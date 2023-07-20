class Solution {
    public int[] solution(long n) {
       String [] arr = Long.toString(n).split(""); 
       
       int[] answer = new int [arr.length];
       
      
       int j = arr.length-1;
       for(int i= 0; i<arr.length ; i++) {
    	   answer[i] = Integer.parseInt(arr[j]);

    	   j--;
    	   
    	   
       }
       
        return answer;
    }
}