import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		int T = Integer.parseInt(sc.next());
		
		for(int i= 0 ; i < T; i++) {
			int cnt = 0 ;
			int heigth = Integer.parseInt(sc.next());
			int width = Integer.parseInt(sc.next());
			int check = Integer.parseInt(sc.next());
			int [][] arr = new int[heigth][width];
			
			loop:for(int j = 0 ; j <width; j++ ) {
				
				for(int k = heigth -1 ; k>=0 ; k--) {
					if( cnt != check) {						
						cnt++;
						arr[k][j] =( (heigth -k)*100 )+j+1;
						if(cnt == check ) {
							System.out.println(arr[k][j]);
							break loop;
						}
					} 
				}
				
			}
			
			
			
			
		}
	}

}
