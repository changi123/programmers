class Solution {
    public String solution(String phone_number) {
		String answer = "";
		if(phone_number.length()==4) {
			answer+=phone_number.substring(0);

		}else {

			for(int i= 0; i<phone_number.length();i++) {
				answer+="*";

				if(i== phone_number.length()-5) {

					answer += phone_number.substring(phone_number.length()-4);
					break;
				} 
			}
		}

		return answer;
    }
}