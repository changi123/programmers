class Solution
{
        public int solution(int n, int a, int b)
        {
          int answer = 0;

        
        int cnt = 0;
        // 
        if(a>b) {
        	int temp = a;
        	a = b;
        	b= temp; 
        }
        // 무조건 a < b 
        while(true) {
        	
        	if( a %2== 1 && b - 1 == a ) {
        		cnt++;
        		break;
        	}
        	if(a % 2 == 1) {
        		a = a+1;
        	}
        	if(b % 2 == 1) {
        		b = b+1;
        	}
        	a = a / 2;
        	b = b / 2;
        	cnt++;
        	if( a % 2== 1 && b-1 ==a ) {
        		cnt++; 
        		break;
        	
        	}
        }
        
        
        
        return cnt;
        }
}