class Solution {
    public int[] solution(String s) {
		int[] answer = new int [2];



		
		int 횟수 = 0;
		int cnt = 0;
		while(true) {
		
			int len = s.length();
			int 빵개수 = 0;
			for(int i= 0; i<s.length();i++) {

				if(s.charAt(i)=='0') {
					빵개수++;
					cnt++;
				 
					
					
				}

				
			}
			if( s.equals("1") ) {
				
				answer[0] = 횟수 ;
				answer[1] = cnt ;
				
				break;
			}
//			cnt++;
			s =
					Integer.toBinaryString(len-빵개수);
			횟수++;

		}
		return answer;


    }
}