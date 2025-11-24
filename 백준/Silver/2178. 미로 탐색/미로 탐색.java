import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m  =sc.nextInt();
		
		int [][] arr = new int [n][m];
		
		for(int i= 0 ; i <n ;i++ ) {
			String line = sc.next();
			for(int j = 0 ;  j < m ; j ++) {
				arr[i][j]=line.charAt(j)-'0';
			}
		}
		
		Queue<int[]> q = new LinkedList<>();
		
		q.add(new int[] {0,0});
		
		boolean [][] visited = new boolean[n][m];
		
		int [][] dist = new int[n][m];
		
		
		dist[0][0] = 1;
		
		int [] dx = {1,-1,0,0};
		int [] dy = {0,0,1,-1};
		
		
		while(!q.isEmpty()) {
			
			int [] current = q.poll();
			
			int x = current[0];
			int y = current[1];
			
			if( x == m-1 && y == n -1 ) break;
			
			for(int i = 0 ; i < 4 ; i++ ) {
				
				int nx = x + dx[i];
				int ny = y+ dy[i];
				
				if( nx <0 || ny < 0 || nx>=m || ny>=n) continue;
				
				if( arr[ny][nx] == 1 && !visited[ny][nx] ) {
					visited[ny][nx] = true;
					dist[ny][nx] = dist[y][x] + 1;
					q.add(new int[] {nx,ny});
					
				}
				
			}
			
		
		}
		
		System.out.println(dist[n-1][m-1]);
		
	}

}
