import java.util.*;

public class Solution {
    public int solution(int n) {
        		int ans = 0;

		int cnt = 0 ;


		while(true) {
			if(n % 2==1 ) {
				ans ++;
				n-=1;
			}
			n = n / 2;
			if(n==0) {
				break;
			}
		}


		return ans;
    }
}