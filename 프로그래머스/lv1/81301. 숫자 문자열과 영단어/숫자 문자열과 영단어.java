class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String [] eng = {"one","two","three","four","five","six","seven","eight","nine","zero"};
        String [] m = {"1","2","3","4","5","6","7","8","9","0"};
        String check ="";
        String result = "";
        for(int i= 0 ; i<eng.length;i++) {
        	check = eng[i];
        	for(int j = 0; j<1;j++) {
        		if(s.contains(check)) {
        			s = s.replaceAll(check, m[i]);
        		}
        	}
        	
        }
        
        answer = Integer.parseInt(s);
        
		return answer;

    }
}