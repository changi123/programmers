class Solution {
    public int solution(int n) {

		/*
    	1 + 2 + 3 + 4 + 5 = 15
		4 + 5 + 6 = 15
		7 + 8 = 15
		15 = 15
		
		1+2+3+4+5+6 =21



	15를 2로 나눈값이 7을 초과하면 시작 숫자가 안됨 

	21를 2로 나눈값이 10.5 11x
		 */
		
		int answer = 0;
		int a =1;
		
		
	
		
		
/*		
		while(a<=(n/2)) {

			int sum = 0;
			int b =a ;


			for(int i= 1 ; i <=n ;i++)
			{
				sum+=b;
				if(sum==n) {
					answer+=1;
					break;
				}
				b++;
			}
			a++;



		}
*/
		

		for(int i= 1; i<=n ; i++) {
			if(n%i==0 && i%2==1) {
				answer++;
				
				
			}
		}
		
		return answer;    }
}