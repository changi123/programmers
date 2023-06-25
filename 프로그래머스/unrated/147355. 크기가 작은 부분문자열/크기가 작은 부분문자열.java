
import java.util.*;
import java.io.*;

class Solution {
    public int solution(String t, String p) {
		int answer = 0;
		int len =p.length();							// 서브스트링에서 짤라줄 len
		long check = Long.parseLong(p);				// 나중에 체크해줄 p 정수형으로 

		ArrayList list = new ArrayList();				// 잘라준 값 넣을 리스트 선언				
		for(int i= 0; i<t.length();i++) {
			if(i == t.length()-len) {
				list.add(t.substring(i, len+i));		// 서브스트링으로 짤라서 넣어줌
				break;									// 만약 i 가 문자열의 마지막 len 번째이면 거기까지 잘라서 넣고 반목문 탈출
			}

			list.add(t.substring(i, len+i));
		}

		long [] m = new long [list.size()];				// 비교해서 answer 올려줄 배열 
		
		for(int i= 0; i<list.size();i++) {					//
			m[i] = Long.parseLong((String) list.get(i)); 	// 리스트값 가져와서 변환후 배열에 저장
			if(m[i] <= check) {								// 만약 저장한 정수가 check 보다 작거나 ㄷ같다면 answer++;
				answer++;
			}
		}



		return answer;
    }
}