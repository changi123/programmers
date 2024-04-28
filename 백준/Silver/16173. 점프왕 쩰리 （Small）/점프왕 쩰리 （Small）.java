import java.util.*;


public class Main {
	static int [][] arr;
	static boolean [][] flag;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		arr = new int[n][n];
		flag = new boolean[n][n];
		for(int i= 0 ; i < arr.length;i++) {
			for(int j = 0 ; j <arr[0].length;j++) {
				arr[i][j] = Integer.parseInt(sc.next());
			}
		}

		dfs(0,0);
		System.out.println("Hing");
	}

	public static void dfs(int x , int y ) {
		
		if( arr[x][y] == -1) {
			System.out.println("HaruHaru");
			System.exit(0);
		}
	
		if ( y+arr[x][y] < arr.length && flag[x][y+arr[x][y]]==false ) {
			flag[x][y+arr[x][y]]= true;
			dfs( x, y+arr[x][y]);
		}
		
		if( x+arr[x][y] < arr.length &&  flag[x+arr[x][y]][y]==false) {
			flag[x+arr[x][y]][y] =true;
			dfs(x+arr[x][y],y);
		}
		
		return ; 


	}
}
