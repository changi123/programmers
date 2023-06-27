class Solution {
public int solution(int num) {
        int answer = 0;
        if( num == 1 ) return 0;
        long n = num;
        while( n != 1  && answer < 500 ) {            
           if( n % 2 == 0) { // 짝수
              n /= 2;              
           }else {            // 홀수
              n *=3;            n+= 1;
           }
           answer++; 
           
        } // while
         
        return n==1 ? answer : -1;
    }
}