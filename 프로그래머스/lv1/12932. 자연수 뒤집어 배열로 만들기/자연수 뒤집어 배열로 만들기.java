import java.util.*;
import java.io.*;
class Solution {
    public int[] solution(long n) {
 		long a=   n; // toString에 넣기위해 형변환

		String s = Long.toString(a); //toString으로 문자열로 변환

		
		String [] sr = s.split(""); //변환한 s를 sr 배열에 공백 기준으로 넣기
		

		int [] answer= new int [sr.length]; // 배열 sr 크기만큼 answer 크기 
		
		ArrayList list = new ArrayList(); // 뒤집기 위해 list 객체 선언
		
		for(int i= 0; i< answer.length;i++) {
			
			answer[i] = Integer.parseInt(sr[i]); // answer[i] 에 sr각 요소 정수로 바꿔 넣어주기 
			list.add(answer[i]); 	// 리스트에 answer[i] 추가
		}
		
 		
		
		Collections.reverse(list); // 뒤집기
		
		for(int i= 0; i<answer.length;i++) {
			answer [i] = (int) list.get(i);  //answer[i] 에 리스트 각 요소 get으로 얻어와서 넣기 
		}
		
		
	
		
		return answer;

    }
}