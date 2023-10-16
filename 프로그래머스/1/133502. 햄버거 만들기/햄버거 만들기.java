class Solution {
    public int solution(int[] ingredient) {
     int answer = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ingredient.length; i++) {
			if (ingredient[i] == 1) {
				sb.append("빵");
			} else if (ingredient[i] == 2) {
				sb.append("야채");
			} else {
				sb.append("고기");
			}
			if(sb.length() >= 6) {
				if(sb.substring(sb.length() - 6).toString().equals("빵야채고기빵")) {
					sb.delete(sb.length() - 6, sb.length());
					answer ++;
				}
			} 
		}


		return answer;
    }
}