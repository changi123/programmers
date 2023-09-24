import java.util.*;
import java.io.*;


class Solution {
    public String solution(String[] participant, String[] completion) {
       	String answer = "";

		ArrayList<String> list = new ArrayList();
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


		

//		 키값 넣을 거 , 값에는 동명이인이 있을 수 있으니 리스트로 넣자
				        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
				        		
				        
				        
				        for(int i= 0 ; i< participant.length;i++) {
				        	// 참가자 키가 포함되어있찌 않다면 키 = 참가자, 값 = null
				        	if(!map.containsKey(participant[i])) {	
				        		map.put(participant[i], new ArrayList<String>());
				        	}
				        	
				        	//  방금 넣은 키값에 value = 리스트 이므로 그 참가자 추가
				        	map.get(participant[i]).add(participant[i]);
				        }
				        
				        
				        
		 		        for(int  i = 0; i<completion.length;i++) {
		 		        	// 만약 완주한 사람 i번째가 map에 키값이 있다면 
				        	if(map.containsKey(completion[i])) {
				        		// 그떄의 map 의 value 값 하나 가져옴
				        		List<String> names = map.get(completion[i]);
				        		
				        		
				        		// 리스트 크기가 1 > 0 - > 1명 이상 있다면 한명만 삭제
				        		if(names.size()>1) {
				        			names.remove(0);
				        		} else { 	
				        			// 1명이라면 그냥 삭제 
				        			map.remove(completion[i]);
				        		}
				        	}
				        	
				        }
		
		 		        
		 
		 		        
		 		        // 맵의 키값을 하나씪 돌거다
				        Iterator<String> it = map.keySet().iterator();
				        // 다음이 없는동안
				        while (it.hasNext()) {
				        	// 다음 키값 넣자
							String key = it.next();
							answer = key;
							break;
							
						}
				        




		return answer;
    }
}