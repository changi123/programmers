class Solution {
    public int solution(int num) {
			int answer = 0;
		if(num == 1 ) {
			
			return answer;
		}
		String s = Integer.toString(num);

		int i = 0 ;
		
		long longNum = Long.parseLong(s); 
		while(true) {
			if(i == 500) {
				answer = -1;
				break;
			}
			if( longNum  % 2  ==0) {
				longNum = longNum / 2;
				i++;
				answer ++;
				if(longNum == 1) {
					break;
				}

			} else {
				longNum = longNum * 3 +1;
				i++;
				answer ++;
				if(longNum == 1) {
					break;
				}


			}
			
			

		}

		return answer;
    }
}