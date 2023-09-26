class Solution {
    public int solution(String s) {
 int answer = 0;
        int cnt = 0; 
        int cnt2 = 0;
        char first = s.charAt(0);
        for(int i= 0; i < s.length();i++) {
        	if(first == s.charAt(i)) {
        		// 같다면 증가 
        		cnt++;
        	} else {
        		cnt2++;
        		// 다르면 증가 
        	}
        	if(cnt == cnt2) {        	
        		// aaabbacc
        		// a == 4 개 // a와 다른 것 4개
        		// 이때 끊고 answer 증가
        		answer++;
        		
        		// 밑에 i+1 다음 번 숫자를 넣어야하는데 만약 넣기 전에 i 가 끝이라면 return 
        		if(i == s.length()-1) {
        			return answer;
        		}
        		
        		// 끊었으니까 다시 첫 번째 단어 초기화
        		first = s.charAt(i+1);
        		// 개수 비교할 것 초기화
        		cnt = 0;
        		cnt2 = 0;
        	} else if(i == s.length()-1) {
        		// 끊기지도 않는데 i 가 마지막 인덱스까지 왔다면 하나니까 증가시키고 reuturn
        		answer++;
        	}
        }
        return answer;
    }
}
