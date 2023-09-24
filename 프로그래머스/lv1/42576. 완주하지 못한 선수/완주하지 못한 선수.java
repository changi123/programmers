import java.util.*;
import java.io.*;


class Solution {
    public String solution(String[] participant, String[] completion) {
    			String answer = "";

//		ArrayList<String> list = new ArrayList();
		Arrays.sort(participant);
		Arrays.sort(completion);
//		List<String> list2 = Arrays.asList(completion);
//
//		for(int i =0; i < participant.length;i++) {
//
//			list.add(participant[i]);
//		}
//
//		for(int i =0; i < completion.length;i++) {
//			if(list.size()==1) {
//				break;
//			}
//			for(int j = 0 ; j<list2.size() ; j++) {
//				if(list.contains(list2.get(j))) {
//					list.remove(list.indexOf(list2.get(j)));
//				}
//			}
//		}


		for(int i= 0; i <completion.length; i++) {
			
		
				if(!participant[i].equals(completion[i])) {
					answer= participant[i];
					return answer;
				}
			}
		
		
		
		return participant[participant.length-1];

    }
}