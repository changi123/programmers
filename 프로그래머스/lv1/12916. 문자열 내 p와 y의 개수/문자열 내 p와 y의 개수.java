class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int [] cnt = new int [2];

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        char ch = 'a';

        
        
        for(int i= 0 ; i<s.length();i++) {
        	
        	ch = Character.toUpperCase(s.charAt(i));
        	if(ch == 'P') {
        		cnt[0]++;
        	} else if(ch== 'Y') {
        		cnt[1]++;
        	} else {
        		answer = true;
        	}
        }
        
        if(cnt[0] == cnt[1]) {
        	return answer = true;
        } else {
        	return answer = false;
        }
    }
}