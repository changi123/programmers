import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc=  new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int result = 0 ;
		for(int i= 0  ; i < n ; i++) {
			int num = Integer.parseInt(sc.next());
			int cnt  = 0 ; 
			if( num == 1) {
				continue;
			} else {
				
				for(int j = 1 ; j <= num ; j++) {
					if( num % j  == 0) {
						cnt++;
					}
				}
				
			if( cnt == 2 ) {
				result++;
			}
			}
		}
		System.out.println(result);
	}

}
