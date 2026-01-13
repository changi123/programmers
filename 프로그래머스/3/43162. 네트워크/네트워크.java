class Solution {
    static boolean [] visited ;
	static int answer ;
    public int solution(int n, int[][] computers) {
		visited = new boolean[n];
		answer = 0 ; 
		for(int i = 0; i < n; i++) {
			
			if( !visited[i] ) {
				answer++;
				dfs(i , computers,n );
			}
			
		}
        return answer;
    }
    	public static void dfs(int node , int [][] computers, int n ) {
		visited[node] = true ; 
		
		for(int next  = 0  ; next < n ; next++ ) {
			if( computers[node][next] == 1 && !visited[next]) {
				dfs(next, computers, n);
			}
		}
		
	}

}