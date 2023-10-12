import java.util.*;
class Solution {
    public String solution(int[] food) {
        
		String first = "";

		List<String> list = new ArrayList();

		for (int i = 1; i < food.length; i++) {

			int com = 0;
			// 홀수면 하나 빼거 
			if (food[i] % 2 == 1) {
				com = food[i] - 1;
			} else {
				com = food[i];
			}
			
			// '0' 기준으로 절반만 넣으면 되기 때문에 com / 2
			// list에 박기
			for (int j = 0; j < com / 2; j++) {
				first = first + Integer.toString(i);
				list.add(Integer.toString(i));
			}
			if (i == food.length - 1) {
				// 지금까진 이어진 거 + 중간 0 넣고 탈출
				first = first + "0";
			}
		}
		
		// 거꾸로 돌려
		Collections.reverse(list);

		
		// 뒤에 리스트 반대로 만든 거 이어붙이기
		for (int i = 0; i < list.size(); i++) {
			first = first + list.get(i);
		}
		return first;
    }
}