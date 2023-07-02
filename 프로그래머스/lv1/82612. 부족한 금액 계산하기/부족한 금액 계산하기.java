class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        
        long need_money= 0;
        
        int k = 1;
        for(int i= 0; i<count ; i++) {
        	need_money +=(long) price*k++;
        }
        
        if(need_money > money ) {
        	return answer = need_money - (long) money;
        } else {
        	return answer = 0;
        }
    }
}