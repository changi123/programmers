import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        String s = Integer.toString(n);
        
        String [] sr = s.split("");
        for(int i =0 ; i<sr.length;i++) {
        	answer += Integer.parseInt(sr[i]);
        }
        
        
        System.out.println("Hello Java");

        return answer;
    }
}