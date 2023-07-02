class Solution {
    public int solution(int[] a, int[] b) {
       	int [] m = new int [a.length];
    	
    	for(int i= 0; i<a.length;i++) {
    		m[i] = a[i]*b[i];
    	}
    	
    	int answer =0;
    	for(int i= 0; i<m.length;i++) {
    		answer+=m[i];
    	}
    	
        return answer;
    }
}