import java.util.*;


public class Main {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		
		String [][] arr = new String[n][m];
		
		int cnt = 0;
		for(int i = 0 ; i < n ; i++) {
			
			String s= sc.next();
			String [] sArr = s.split("");
			for(int j = 0 ; j < m ; j++) {
				arr[i][j] = sArr[j];
			}
		}
		
		
		// 가로 체크
		for(int i = 0 ; i < n ; i++ ) {
			
			String s = "";
			for(int j = 0 ; j <arr[i].length;j++) {
				s+=arr[i][j];
			}
			
			String [] check = s.split("\\|");
	
			for(int j = 0 ; j < check.length;j++) {
				if( check [j].length() !=0) {
					cnt++;
				}
			}
			
		}
		
		
		for(int i= 0 ; i < m ;i++) {
			
			String s = "";
			for(int j = 0 ; j < n ; j++) {
				s+=arr[j][i];
			}
			
			
			String [] check = s.split("-");
			
			for(int j = 0 ; j < check.length;j++) {
				if( check [j].length() !=0) {
					cnt++;
				}
			}
			
		}
		System.out.println(cnt);
		
	}

}
